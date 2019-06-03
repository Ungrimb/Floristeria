package com.example.java.Models;

import java.util.List;

public class Floristeria {

    private String name;
    private List<Arbol> arbolList;
    private List<Flor> florList;
    private List<Decoracion> decoracionList;

    public Floristeria(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Arbol> getArbolList() {
        return arbolList;
    }

    public void setArbolList(List<Arbol> arbolList) {
        this.arbolList = arbolList;
    }

    public List<Flor> getFlorList() {
        return florList;
    }

    public void setFlorList(List<Flor> florList) {
        this.florList = florList;
    }

    public List<Decoracion> getDecoracionList() {
        return decoracionList;
    }

    public void setDecoracionList(List<Decoracion> decoracionList) {
        this.decoracionList = decoracionList;
    }

    @Override
    public String toString() {
        return "Floristeria{" +
                "NOMBRE:\n'" + name + '\'' +
                "\n, ARBRES:\n     " + arbolList +
                "\n, FLORS:\n     " + florList +
                "\n, DECORACIO:\n     " + decoracionList +
                '}';
    }
}
