package com.example.listview_recyclerview;

public class item {
    private String name;
    private String email;
    private int image;

    public item(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getImage() {
        return image;
    }
}
