package com.slidergozapotillo;

public class MyParroquiasdata {

    private String parrNombre;
    private String coorDato;
    private Integer imaImagenParr;

    public MyParroquiasdata(String parrNombre,String coorDato,Integer imaImagenParr) {
        this.parrNombre = parrNombre;
        this.coorDato = coorDato;
        this.imaImagenParr = imaImagenParr;
    }

    public String getParrNombre() {
        return parrNombre;
    }

    public void setParrNombre(String parrNombre) {
        this.parrNombre = parrNombre;
    }

    public String getCoorDato() {
        return coorDato;
    }

    public void setCoorDato(String coorDato) {
        this.coorDato = coorDato;
    }

    public Integer getImaImagenParr() {
        return imaImagenParr;
    }

    public void setImaImagenParr(Integer imaImagenParr) {
        this.imaImagenParr = imaImagenParr;
    }
}
