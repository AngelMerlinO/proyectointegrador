package com.upchiapas.models;

public class Casa {
    double dimesiones;
    int pisos;
    int cuartos;
    int baños;
    String areaDeLavado;
    String cochera;
    String ubicacion;
    String notaExtra;
    String numeroDeContacto;

    public Casa(double dimesiones, int pisos, int cuartos, int baños, String areaDeLavado, String cochera, String ubicacion, String notaExtra, String numeroDeContacto) {
        this.dimesiones = dimesiones;
        this.pisos = pisos;
        this.cuartos = cuartos;
        this.baños = baños;
        this.areaDeLavado = areaDeLavado;
        this.cochera = cochera;
        this.ubicacion = ubicacion;
        this.notaExtra = notaExtra;
        this.numeroDeContacto = numeroDeContacto;
    }

    public double getDimesiones() {
        return dimesiones;
    }

    public void setDimesiones(double dimesiones) {
        this.dimesiones = dimesiones;
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

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
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

    public String getNotaExtra() {
        return notaExtra;
    }

    public void setNotaExtra(String notaExtra) {
        this.notaExtra = notaExtra;
    }

    public String getNumeroDeContacto() {
        return numeroDeContacto;
    }

    public void setNumeroDeContacto(String numeroDeContacto) {
        this.numeroDeContacto = numeroDeContacto;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "dimesiones=" + dimesiones +
                ", pisos=" + pisos +
                ", cuartos=" + cuartos +
                ", baños=" + baños +
                ", areaDeLavado='" + areaDeLavado + '\'' +
                ", cochera='" + cochera + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", notaExtra='" + notaExtra + '\'' +
                ", numeroDeContacto='" + numeroDeContacto + '\'' +
                '}';
    }
}
