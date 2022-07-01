package com.upchiapas.models;

public class Departamento {

  int capacidadPersonas;
  double dimenciones;
  String banoIndividual;
  String internet;
  String semiAmueblado;
  String clima;
  String ubicacion;
  String contacto;
  String notasExtras;

  public Departamento(int capacidadPersonas, double dimenciones, String banoIndividual, String internet, String semiAmueblado, String clima, String ubicacion, String contacto, String notasExtras) {
    this.capacidadPersonas = capacidadPersonas;
    this.dimenciones = dimenciones;
    this.banoIndividual = banoIndividual;
    this.internet = internet;
    this.semiAmueblado = semiAmueblado;
    this.clima = clima;
    this.ubicacion = ubicacion;
    this.contacto = contacto;
    this.notasExtras = notasExtras;
  }

  public int getCapacidadPersonas() {
    return capacidadPersonas;
  }

  public void setCapacidadPersonas(int capacidadPersonas) {
    this.capacidadPersonas = capacidadPersonas;
  }

  public double getDimenciones() {
    return dimenciones;
  }

  public void setDimenciones(double dimenciones) {
    this.dimenciones = dimenciones;
  }

  public String getBanoIndividual() {
    return banoIndividual;
  }

  public void setBanoIndividual(String banoIndividual) {
    this.banoIndividual = banoIndividual;
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
    return "Departamento{" +
            "capacidadPersonas=" + capacidadPersonas +
            ", dimenciones=" + dimenciones +
            ", banoIndividual='" + banoIndividual + '\'' +
            ", internet='" + internet + '\'' +
            ", semiAmueblado='" + semiAmueblado + '\'' +
            ", clima='" + clima + '\'' +
            ", ubicacion='" + ubicacion + '\'' +
            ", contacto='" + contacto + '\'' +
            ", notasExtras='" + notasExtras + '\'' +
            '}';
  }
}
