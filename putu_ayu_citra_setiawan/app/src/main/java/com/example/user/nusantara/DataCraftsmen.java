package com.example.user.nusantara;

import android.graphics.drawable.Drawable;

/**
 * Created by User on 06/12/2017.
 */

public class DataCraftsmen {

    private String id_craftsmen,nama_craftsmen,kerajinan,namadaerah;
    private int gbr_kerajinan;

    public DataCraftsmen(String id_craftsmen,String nama_craftsmen,String kerajinan,String namadaerah,int gbr_kerajinan){
        this.id_craftsmen = id_craftsmen;
        this.nama_craftsmen = nama_craftsmen;
        this.kerajinan = kerajinan;
        this.namadaerah = namadaerah;
        this.gbr_kerajinan = gbr_kerajinan;
    }

    public String getId_craftsmen() {
        return id_craftsmen;
    }
    public void setId_craftsmen(String id_craftsmen) {
        this.id_craftsmen = id_craftsmen;
    }

    public String getNama_craftsmen() {
        return nama_craftsmen;
    }
    public void setNama_craftsmen(String nama_craftsmen) {
        this.nama_craftsmen = nama_craftsmen;
    }

    public String getKerajinan() {
        return kerajinan;
    }
    public void setKerajinan(String kerajinan) {
        this.kerajinan = kerajinan;
    }

    public String getNamadaerah() {
        return namadaerah;
    }
    public void setNamadaerah(String namadaerah) {
        this.namadaerah = namadaerah;
    }

    public int getGbr_kerajinan() {
        return gbr_kerajinan;
    }
    public void setGbr_kerajinan(int gbr_kerajinan) {
        this.gbr_kerajinan = gbr_kerajinan;
    }
}
