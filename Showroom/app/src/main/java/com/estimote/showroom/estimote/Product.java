package com.estimote.showroom.estimote;

public class Product {

    private String name;
    private String summary;
    private String location;

    public Product(String name, String summary, String location) {
        this.name = name;
        this.summary = summary;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }


    public String getLocation() {
        return location;
    }

}
