package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Crud<DataRecord> dataRecordCrud = new Crud<>("src/main/resources/db.json");
        // Create operation

        DataRecord data = new DataRecord("34", "uih;", "bbb", "", "", "");
        dataRecordCrud.writeJsonRecords(Arrays.asList(data,data,data));



        Crud<Car> carCrud = new Crud<>("src/main/resources/car.json");
        Car car = new Car("55","iuubu","uihou","76");
        car.getCategory();
        car.setCategory("jbob");
        carCrud.writeJsonRecords(Arrays.asList(car,car,car,car));



    }


}