package org.example;

public class DataRecord {
    @Id
    private String Id;
    private String First_Name;
    private String Last_Name;
    private String Date_Of_Birth;
    private String Place_Of_Birth;
    private String Country;

    public DataRecord(String Id, String first_Name, String last_Name, String date_Of_Birth, String place_Of_Birth, String country) {
        this.Id = Id;
        First_Name = first_Name;
        Last_Name = last_Name;
        Date_Of_Birth = date_Of_Birth;
        Place_Of_Birth = place_Of_Birth;
        Country = country;
    }

    public String getID() {
        return Id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getDate_Of_Birth() {
        return Date_Of_Birth;
    }

    public String getPlace_Of_Birth() {
        return Place_Of_Birth;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "DataRecord{" +
                "ID='" + Id + '\'' +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Date_Of_Birth='" + Date_Of_Birth + '\'' +
                ", Place_Of_Birth='" + Place_Of_Birth + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}