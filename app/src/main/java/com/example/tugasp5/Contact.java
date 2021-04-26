package com.example.tugasp5;

public class Contact {
    private String Name;
    private String Phone;
    private String Detail;
    private int Photo;

    public Contact(String name, String phone, String detail, int photo){
        Name = name;
        Phone = phone;
        Photo = photo;
        Detail = detail;
    }

    //getter

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getDetail() {
        return Detail;
    }

    public int getPhoto() {
        return Photo;
    }

    //setter


    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
