package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Crud<DataRecord> crud = new Crud<>("D:/JAVA-projects/Lesson/project/src/main/resources/db.json");
        // Create operation

        DataRecord data = new DataRecord("34", "uih;", "bbb", "", "", "");
//        crud.writeJsonRecords(Arrays.asList(data,data,data));
//        crud.updateJsonRecord("33", new DataRecord("34", "uih;", "bbb", "", "", "uzbekistan"), DataRecord.class);
//        crud.deleteJsonRecord("35",DataRecord.class);

//        System.out.println(crud.readAllJsonRecords().get(0));
//        System.out.println(crud.readAllJsonRecords().get(1));
//        System.out.println(crud.readAllJsonRecords().get(2));
        System.out.println(crud.readJsonRecord("35",DataRecord.class));
        System.out.println();

        Car car = new Car("55","iuubu","uihou","76");
        car.getCategory();
        car.setCategory("jbob");


//        // Read operation
//        List<DataRecord> records = crud.readAllJsonRecords();
//        System.out.println("All records:");
//        for (DataRecord record : records) {
//            System.out.println(record);
//        }
//
//        // Update operation
//        DataRecord updatedData = new DataRecord("33", "55", "", "", "", "");
//        crud.updateJsonRecord("33", updatedData,DataRecord.class);
//
//        // Read operation after update
//        DataRecord updatedRecord = crud.readJsonRecord("33",DataRecord.class);
//        System.out.println("Updated record:");
//        System.out.println(updatedRecord);
//
//        // Delete operation
////        crud.deleteJsonRecord("33",DataRecord.class);
//
//        // Read operation after delete
//        records = crud.readAllJsonRecords();
//        System.out.println("All records after delete:");
//        for (DataRecord record : records) {
//            System.out.println(record);
//        }
    }


}