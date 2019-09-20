package com.example.myrecyclerview.model;

public class Recycler_Model {

    private String title;
    private String imgUrl;

    public Recycler_Model(String title, String imgUrl) {
        this.title = title;
        this.imgUrl = imgUrl;
    }

    public Recycler_Model() {
    }

    public String getTitle(){return title;}
    public void setTitle (String title){this.title = title;}
    public String getImgUrl(){return imgUrl;}
    public void setImgUrl (String imgUrl){this.imgUrl = imgUrl;}




}