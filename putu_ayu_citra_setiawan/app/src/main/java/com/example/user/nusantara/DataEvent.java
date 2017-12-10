package com.example.user.nusantara;

import android.graphics.drawable.Drawable;

/**
 * Created by User on 05/12/2017.
 */

public class DataEvent {
    private String id_culture,namaevent,namadaerah;
    private int gbr_event;

    public DataEvent(String id_culture, String namaevent,String namadaerah,int gbr_event){
        this.id_culture = id_culture;
        this.namaevent = namaevent;
        this.namadaerah = namadaerah;
        this.gbr_event = gbr_event;
    }



    /*.. id ..*/
    public String getId_culture() {
        return id_culture;
    }
    public void setId_culture(String id_culture) {
        this.id_culture = id_culture;    }


    /*.. nama event ..*/
    public String getNamaevent() {
        return namaevent;
    }
    public void setNamaevent(String namaevent) {
        this.namaevent = namaevent;
    }


    /*.. gambar event ..*/
    public int getGbr_event() {
        return gbr_event;
    }
    public void setGbr_event(int gbr_event) {
        this.gbr_event = gbr_event;
    }


    /*.. nama daerah ..*/
    public String getNamadaerah() {
        return namadaerah;
    }
    public void setNamadaerah(String namadaerah) {
        this.namadaerah = namadaerah;
    }

}
