package com.example.recyclercarddemo;

public class CantanteModelo {

    private String cantante, nacionalidad , edad , estado , fecha ;
    private int imgCantante;





    public CantanteModelo() {}

    public CantanteModelo(String cantante, String nacionalidad, String edad, String estado, String fecha, int imgCantante) {
        this.cantante = cantante;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.estado = estado;
        this.fecha = fecha;
        this.imgCantante = imgCantante;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getImgCantante() {
        return imgCantante;
    }

    public void setImgCantante(int imgCantante) {
        this.imgCantante = imgCantante;
    }
}
