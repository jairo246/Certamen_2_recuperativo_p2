package com.example.jairo.certamenrecuperativo_2;

/**
 * Created by Jairo on 14-12-2016.
 */

public class Registro {

    String ID;
    String JOKE;

    public Registro(String ID, String JOKE) {
        this.ID = ID;
        this.JOKE = JOKE;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getJOKE() {
        return JOKE;
    }

    public void setJOKE(String JOKE) {
        this.JOKE = JOKE;
    }
}
