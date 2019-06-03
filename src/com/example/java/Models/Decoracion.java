package com.example.java.Models;

public class Decoracion extends Elemento{

    private static String[] listmaterial ={"Madera", "Plastico"};
    private String material;

    public Decoracion(Double precio,int mat) {
        super(precio);
        material = listmaterial[mat];
    }

    public static String[] getListmaterial() {
        return listmaterial;
    }

    public static void setListmaterial(String[] listmaterial) {
        Decoracion.listmaterial = listmaterial;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "{" + "material=" + material + ", precio=" + getPrecio() + '}';
    }
}
