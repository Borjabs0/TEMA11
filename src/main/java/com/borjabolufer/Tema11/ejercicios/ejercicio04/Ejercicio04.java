package com.borjabolufer.Tema11.ejercicios.ejercicio04;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio04 {
    public static void main(String[] args) {
        List<Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(new Television(1000, 20));
        electrodomesticos.add(new Lavadora(1000, 20));
        electrodomesticos.add(new Television(500, "Blanco", 'B', 100, 55, true));
        electrodomesticos.add(new Lavadora(1000, 20));
        electrodomesticos.add(new Television(1000, 20));
        electrodomesticos.add(new Lavadora(1000, 20));
        electrodomesticos.add(new Lavadora(1000, 20));
        electrodomesticos.add(new Television(1000, 20));
        electrodomesticos.add(new Electrodomestico(1000, "Negro", 'A', 100));
        electrodomesticos.add(new Lavadora(1000, 20));
        for (Electrodomestico electrodomestico : electrodomesticos){
            System.out.println(electrodomestico.precioFinal() + "€");
        }

        double totalElectrodomesticos = 0;
        double totalTelevisores = 0;
        double totalLavadoras = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof  Television){
                totalTelevisores += electrodomestico.precioFinal();
                System.out.println("TELEVISOR");
                System.out.println(electrodomestico.toString());
            }
            else if(electrodomestico instanceof Lavadora){
                totalLavadoras += electrodomestico.precioFinal();
                System.out.println("LAVADORA");
                System.out.println(electrodomestico.toString());
            }else {
                System.out.println("ELECTRODOMESTICO");
                System.out.println(electrodomestico.toString());
            }
            totalElectrodomesticos += electrodomestico.precioFinal();
        }
        System.out.println("Total de electrodomesticos: " + totalElectrodomesticos);
        System.out.println("Total de televisores: " + totalTelevisores);
        System.out.println("Total de lavadoras: " + totalLavadoras);
    }
}
