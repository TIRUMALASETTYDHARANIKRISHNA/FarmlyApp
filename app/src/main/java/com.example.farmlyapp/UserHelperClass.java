package com.example.farmlyapp;

public class UserHelperClass {
    String Item,Quantity,Harvesting,Location;

    public UserHelperClass() {
    }

    public UserHelperClass(String item, String quantity, String harvesting, String location) {
        Item = item;
        Quantity = quantity;
        Harvesting = harvesting;
        Location = location;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getHarvesting() {
        return Harvesting;
    }

    public void setHarvesting(String harvesting) {
        Harvesting = harvesting;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
