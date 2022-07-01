package com.upchiapas.models;

public class Departamento {


  double dimenciones;
  String bañoIndividual;
  String internet;
  String semiAmueblado;
  int capacidadDePersonas;
  String clima;
  String ubicacion;
  String notaExtra;
  String numeroDeContacto;

  public Departamento(double dimenciones, String bañoIndividual, String internet, String semiAmueblado, int capacidadDePersonas, String clima, String ubicacion, String notaExtra, String numeroDeContacto) {
    this.dimenciones = dimenciones;
    this.bañoIndividual = bañoIndividual;
    this.internet = internet;
    this.semiAmueblado = semiAmueblado;
    this.capacidadDePersonas = capacidadDePersonas;
    this.clima = clima;
    this.ubicacion = ubicacion;
    this.notaExtra = notaExtra;
    this.numeroDeContacto = numeroDeContacto;
  }

  public double getDimenciones() {
    return dimenciones;
  }

  public void setDimenciones(double dimenciones) {
    this.dimenciones = dimenciones;
  }

  public String getBañoIndividual() {
    return bañoIndividual;
  }

  public void setBañoIndividual(String bañoIndividual) {
    this.bañoIndividual = bañoIndividual;
  }

  public String getInternet() {
    return internet;
  }

  public void setInternet(String internet) {
    this.internet = internet;
  }

  public String getSemiAmueblado() {
    return semiAmueblado;
  }

  public void setSemiAmueblado(String semiAmueblado) {
    this.semiAmueblado = semiAmueblado;
  }

  public int getCapacidadDePersonas() {
    return capacidadDePersonas;
  }

  public void setCapacidadDePersonas(int capacidadDePersonas) {
    this.capacidadDePersonas = capacidadDePersonas;
  }

  public String getClima() {
    return clima;
  }

  public void setClima(String clima) {
    this.clima = clima;
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
    return " | Visualización De Los Datos Del Departamento |" + "\n-----------------------------------------" +
            "\nDimenciones = " + dimenciones +
            "\nBaño Individual = '" + bañoIndividual + '\'' +
            "\nInternet = '" + internet + '\'' +
            "\nSemi Amueblado = '" + semiAmueblado + '\'' +
            "\nCapacidad De Personas = " + capacidadDePersonas +
            "\nClima = '" + clima + '\'' +
            "\nUbicacion = '" + ubicacion + '\'' +
            "\nNota Extra = '" + notaExtra + '\'' +
            "\nNumero De Contacto = '" + numeroDeContacto + '\'';
  }
}

