package com.example.java;

import com.example.java.Models.Arbol;
import com.example.java.Models.Decoracion;
import com.example.java.Models.Flor;
import com.example.java.Models.Floristeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Floristeria floristeria;
    static int menu,material;
    static String name,color;
    static Double precio,altura;
    static List<Arbol> arbolList= new ArrayList<>();
    static List<Flor> florList= new ArrayList<>();
    static List<Decoracion> decoracionList= new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Nombre de la Floristeria");
        name = sc.next();
        floristeria = crearFloristeria(name);

        do{
            System.out.println("1. Añadir Árbol\n" +
                    "2. Añadir Flor\n" +
                    "3. Añadir Decoración\n" +
                    "4. Stock\n" +
                    "5. Salir\n");

            menu = sc.nextInt();

            switch (menu){
                case 1:
                    afegirArbre();
                    break;
                case 2:
                    afegirFlor();
                    break;
                case 3:
                    afegirDecoracio();
                    break;
                case 4:
                    System.out.println(floristeria);
                    break;
                case 5:
                    System.out.println("Que tenga un buen día");
            }
        } while (menu!=5);



    }

    private static void afegirDecoracio() {

        System.out.println("Introduce el material (0. Madera, 1. Plastico");
        material = sc.nextInt();
        if (material<0 || material>1){
            System.out.println("Sólo Madera o Plastico");
            return;
        }
        System.out.println("Introduce el precio");
        precio = sc.nextDouble();
        Decoracion decoracion = new Decoracion(precio,material);
        decoracionList.add(decoracion);
        floristeria.setDecoracionList(decoracionList);

    }

    private static void afegirFlor() {

        System.out.println("Introduce el color");
        color = sc.next();
        System.out.println("Introduce el precio");
        precio = sc.nextDouble();
        Flor flor = new Flor(precio,color);
        florList.add(flor);
        floristeria.setFlorList(florList);

    }

    private static void afegirArbre() {

        System.out.println("Introduce la Altura");
        altura = sc.nextDouble();
        System.out.println("Introduce el precio");
        precio = sc.nextDouble();
        Arbol arbol = new Arbol(precio,altura);
        arbolList.add(arbol);
        floristeria.setArbolList(arbolList);

    }

    private static Floristeria crearFloristeria(String name) {

        floristeria = new Floristeria(name);
        return floristeria;

    }
}
