package com.example.java.Models;

public class Flor extends Elemento{

    private String color;

    public Flor(Double precio, String color) {
        super(precio);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" + "color=" + color + ", precio=" + getPrecio() + '}';
    }
}
