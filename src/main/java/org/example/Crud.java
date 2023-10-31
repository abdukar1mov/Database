package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Crud<T> {


    private final Gson gson;
    private final File jsonFile;

    public Crud(String jsonFilePath) {
        gson = new GsonBuilder().setPrettyPrinting().create();
        jsonFile = new File(jsonFilePath);
    }

    public List<T> readAllJsonRecords() {
        try (Reader reader = new FileReader(jsonFile)) {
            Type listType = TypeToken.getParameterized(List.class, DataRecord.class).getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public T readJsonRecord(String id, Type recordType) {
        List<T> records = readAllJsonRecords();
        if (records != null) {
            for (T record : records) {
                if (getID(record,recordType).equals(id)) {
                    return record;
                }
            }
        }
        return null;
    }

    public void updateJsonRecord(String id, T newData, Type recordType) {
        List<T> records = readAllJsonRecords();
        if (records != null) {
            for (T record : records) {
                if (getID(record, recordType).equals(id)) {

                    break;
                }
            }
            writeJsonRecords(records);
        }
    }

    public void deleteJsonRecord(String id, Type recordType) {
        List<T> records = readAllJsonRecords();
        if (records != null) {
            records.removeIf(record -> Objects.equals(getID(record, recordType), id));
            writeJsonRecords(records);
        }
    }

    public void writeJsonRecords(List<T> records) {
        try (Writer writer = new FileWriter(jsonFile)) {
            gson.toJson(records, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void updateRecordFields(T record, T newData, Type recordType) {
        try {
            // Perform field updates based on your specific requirements
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createJsonRecord(T data) {
        try (FileWriter writer = new FileWriter(jsonFile, true)) {
            gson.toJson(data, writer);
            writer.append(",");
            writer.append(System.lineSeparator()); // Add a new line after each record

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private String getID(T record, Type recordType) {
        try {
            Class<?> clazz = Class.forName(recordType.getTypeName());
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                if (field.isAnnotationPresent(Id.class)) {
                    field.setAccessible(true);
                    Object value = field.get(record);
                    return value != null ? value.toString() : null;
                }
            }

            // If no field with the @Id annotation is found, return null
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
