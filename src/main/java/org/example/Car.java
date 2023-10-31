package org.example;

public class Car {
    @Id
    private String Id;
    private String model;
    private String category;
    private String price;

    public Car() {
    }

    public Car(String id, String model, String category, String price) {
        Id = id;
        this.model = model;
        this.category = category;
        this.price = price;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id='" + Id + '\'' +
                ", model='" + model + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}