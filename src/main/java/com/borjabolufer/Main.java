package com.borjabolufer;

import com.borjabolufer.Tema11.ejercicios.ejercicio01.Punto;
import com.borjabolufer.Tema11.ejercicios.ejercicio02.Poligono;
import com.borjabolufer.Tema11.ejercicios.ejercicio03.Coche;
import com.borjabolufer.Tema11.ejercicios.ejercicio03.CocheCambioAutomatico;
import com.borjabolufer.Tema11.ejercicios.ejercicio03.CocheCambioManual;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //EJERCICIO 2
        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(new Punto(0,0));
        puntos.add(new Punto(2,0));
        puntos.add(new Punto(2,2));
        puntos.add(new Punto(0,2));


        Poligono poligono = new Poligono(puntos);

        System.out.println("POLIGONO DE CUATRO VÉRTICES");
        System.out.println(poligono);
        System.out.println("Perimetro: " + poligono.perimetro());

        System.out.println();

        System.out.println("DESPLAZAMIENTO DE POLIGONO");
        poligono.traslada(4, -3);
        System.out.println("POLIGONO DESPLAZADO: " + poligono);
        System.out.println("Perímetro: " + poligono.perimetro());

        //EJERCICIO 3

        // Solicitar la matrícula del coche
        System.out.println("Introduzca la matricula de su coche");
        String matricula = scanner.nextLine();

        // Preguntar si el coche es con cambio automático o manual
        System.out.print("¿El coche es con cambio automático? (s/n): ");
        String respuesta = scanner.nextLine();
        boolean esAutomatico = false;
        if(respuesta.equals("s")){
            esAutomatico = true;
        } else if (respuesta.equals("n")) {
            esAutomatico = false;
        }
        // Crear el coche con las características indicadas por el usuario
        Coche coche;
        if (esAutomatico) {
            coche = new CocheCambioAutomatico(matricula);
        } else {
            coche = new CocheCambioManual(matricula);
        }
        // Mostrar la información del coche
        System.out.println("\nInformación del coche:");
        coche.acelerar(40);
        System.out.println(coche);

        // Acelerar el coche hasta 60 km/h
        coche.acelerar(60);

        // Si es un coche con cambio manual, cambiar la marcha a tercera
        if (!esAutomatico) {
            ((CocheCambioManual) coche).cambioDeMarcha(3);
        }

        // Mostrar la información del coche después de acelerar y cambiar marcha
        System.out.println("\nInformación del coche después de acelerar y cambiar marcha:");
        System.out.println(coche);
    }
}