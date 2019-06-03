package com.example.java.Models;

public class Arbol extends Elemento{

    private Double altura;

    public Arbol(Double precio, Double altura) {
        super(precio);
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "{" + "altura=" + altura + ", precio=" + getPrecio() + '}';
    }
}
