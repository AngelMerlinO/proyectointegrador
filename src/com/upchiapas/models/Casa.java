package com.upchiapas.models;

public class Casa {

    int pisos;
    int cuartos;
    int banos;
    double dimensiones;
    String areaDeLavado;
    String cochera;
    String ubicacion;
    String contacto;
    String notasExtras;

    public Casa(int pisos, int cuartos, int banos, double dimensiones, String areaDeLavado, String cochera, String ubicacion, String contacto, String notasExtras) {
        this.pisos = pisos;
        this.cuartos = cuartos;
        this.banos = banos;
        this.dimensiones = dimensiones;
        this.areaDeLavado = areaDeLavado;
        this.cochera = cochera;
        this.ubicacion = ubicacion;
        this.contacto = contacto;
        this.notasExtras = notasExtras;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public double getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getAreaDeLavado() {
        return areaDeLavado;
    }

    public void setAreaDeLavado(String areaDeLavado) {
        this.areaDeLavado = areaDeLavado;
    }

    public String getCochera() {
        return cochera;
    }

    public void setCochera(String cochera) {
        this.cochera = cochera;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNotasExtras() {
        return notasExtras;
    }

    public void setNotasExtras(String notasExtras) {
        this.notasExtras = notasExtras;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "pisos=" + pisos +
                ", cuartos=" + cuartos +
                ", banos=" + banos +
                ", dimensiones=" + dimensiones +
                ", areaDeLavado='" + areaDeLavado + '\'' +
                ", cochera='" + cochera + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", contacto='" + contacto + '\'' +
                ", notasExtras='" + notasExtras + '\'' +
                '}';
    }
}
