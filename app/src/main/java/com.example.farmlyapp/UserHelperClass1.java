package com.example.farmlyapp;

public class UserHelperClass1 {
    String Name,Doorno,Area,city,Pincode,State;

    public UserHelperClass1() {
    }

    public UserHelperClass1(String name, String doorno, String area, String city, String pincode, String state) {
        Name = name;
        Doorno = doorno;
        Area = area;
        this.city = city;
        Pincode = pincode;
        State = state;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDoorno() {
        return Doorno;
    }

    public void setDoorno(String doorno) {
        Doorno = doorno;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return Pincode;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}

