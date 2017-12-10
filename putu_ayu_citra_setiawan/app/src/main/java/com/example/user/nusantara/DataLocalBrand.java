package com.example.user.nusantara;

import android.graphics.drawable.Drawable;

/**
 * Created by User on 07/12/2017.
 */

public class DataLocalBrand {
    private String idlocalbrand,namalocalbrand,namadaerah;
    private int gbr_localbrand;


    public DataLocalBrand(String idlocalbrand, String namalocalbrand, String namadaerah, int gbr_localbrand){
        this.idlocalbrand = idlocalbrand;
        this.namadaerah = namadaerah;
        this.namalocalbrand = namalocalbrand;
        this.gbr_localbrand = gbr_localbrand;
    }

    public String getIdlocalbrand() {
        return idlocalbrand;
    }
    public void setIdlocalbrand(String idlocalbrand) {
        this.idlocalbrand = idlocalbrand;
    }

    public String getNamalocalbrand() {
        return namalocalbrand;
    }
    public void setNamalocalbrand(String namalocalbrand) {
        this.namalocalbrand = namalocalbrand;
    }

    public int getGbr_localbrand() {
        return gbr_localbrand;
    }
    public void setGbr_localbrand(int gbr_localbrand) {
        this.gbr_localbrand = gbr_localbrand;
    }

    public String getNamadaerah() {
        return namadaerah;
    }
    public void setNamadaerah(String namadaerah) {
        this.namadaerah = namadaerah;
    }
}
