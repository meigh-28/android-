package com.example.myrecyclerview.model;


import android.provider.ContactsContract;

import java.util.ArrayList;

public class Recycler_repository {

    private static Recycler_repository instance;
    private ArrayList<ContactsContract.Contacts> dataSet = new ArrayList<>();

    public static Recycler_repository getInstance() {
        return instance;
    }

    public void setContacts(){
        String imgUrl;
        dataSet.add(new contact(imgUrl="")
                );


    }

}


