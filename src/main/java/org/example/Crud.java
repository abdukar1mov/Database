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
        List<T> records = new ArrayList<>();

        try (Reader reader = new FileReader(jsonFile)) {
            Type listType = new TypeToken<List<T>>() {
            }.getType();
            records = gson.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }


    public T readJsonRecord(String id, Type recordType) {
        return null;
    }

    public void updateJsonRecord(String id, T newData, Type recordType) {

    }

    public void deleteJsonRecord(String id, Type recordType) {

    }

    public void writeJsonRecords(List<T> records) {
        try (Writer writer = new FileWriter(jsonFile)) {
            gson.toJson(records, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void updateRecordFields(T record, T newData, Type recordType) {

    }

    public void createJsonRecord(T data) {

    }
}
