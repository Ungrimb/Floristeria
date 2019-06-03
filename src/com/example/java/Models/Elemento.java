package com.example.java.Models;

public class Elemento {

    private Double precio;

    public Elemento(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "precio=" + precio +
                '}';
    }
}
