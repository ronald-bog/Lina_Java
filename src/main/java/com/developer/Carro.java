package com.developer;

public class Carro {

private String color;
    private int year;
    private String marca;
    private String modelo;

    public Carro(String color, int year, String marca, String modelo){
        this.color = color;
        this.year = year;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String encender(){
        return "El carro esta encendido";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
