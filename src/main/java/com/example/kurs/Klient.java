package com.example.kurs;

public class Klient {
    private String vid;
    private String model;
    private int price;

    public Klient(String vid, String model, int price) {
        this.vid = vid;
        this.model = model;
        this.price = price;
    }


    public String getVid() {
        return vid ;
    }

    public void setVid(String name ) {
        this.vid = vid;
    }

    public String getModel() {
        return model ;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price ;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

