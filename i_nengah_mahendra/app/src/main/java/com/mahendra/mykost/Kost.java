package com.mahendra.mykost;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MAHENDRA on 12/8/2017.
 */

public class Kost {
    private int image;
    private String name;
    private String price;
    private String address;
    private String deskripsi;

    public Kost(int image, String name, String price, String address, String deskripsi) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.address = address;
        this.deskripsi = deskripsi;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {this.name = name;}

    public String getPrice() {
        return price;
    }

    public void setPrice(String description) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String description) {this.address = address;}

    public String getDeskripsi() {return deskripsi;}

    public void  setDeskripsi(String description){this.deskripsi = deskripsi;}

}

