package com.borjabolufer.Tema11.ejercicios.ejercicio02;

import com.borjabolufer.Tema11.ejercicios.ejercicio01.Punto; // Importa la clase Punto del ejercicio anterior

import java.util.List;

/**
 * La clase Poligono representa un polígono definido por una lista de puntos en el plano.
 */
public class Poligono {
    public List<Punto> puntosPoligono; // Lista de puntos que forman el polígono

    /**
     * Constructor de la clase Poligono.
     *
     * @param puntosPoligono La lista de puntos que definen el polígono.
     */
    public Poligono(List<Punto> puntosPoligono) {
        this.puntosPoligono = puntosPoligono;
    }

    /**
     * Método para trasladar el polígono en el plano.
     *
     * @param desplazamientoX Desplazamiento en el eje X.
     * @param desplazamientoY Desplazamiento en el eje Y.
     */
    public void traslada(double desplazamientoX, double desplazamientoY) {
        for (int i = 0; i < puntosPoligono.size(); i++) {
            Punto punto = puntosPoligono.get(i);
            double nuevaX = punto.getX() + desplazamientoX;
            double nuevaY = punto.getY() + desplazamientoY;
            puntosPoligono.set(i, new Punto(nuevaX, nuevaY)); // Actualiza la posición del punto trasladado
            //Mejor utilizar Setters
        }
    }

    /**
     * Método para obtener el número de vértices del polígono.
     *
     * @return El número de vértices del polígono.
     */
    public int numVertices() {
        return puntosPoligono.size();
    }

    /**
     * Método para calcular el perímetro del polígono.
     *
     * @return El perímetro del polígono.
     */
    public double perimetro() {
        double perimetro = 0;
        for (int i = 0; i < puntosPoligono.size(); i++) {
            Punto puntoActual = puntosPoligono.get(i);
            Punto puntoSiguiente = puntosPoligono.get((i + 1) % puntosPoligono.size());
            perimetro += puntoActual.distancia(puntoSiguiente); // Suma la distancia entre puntos adyacentes
        }
        return perimetro;
    }

    /**
     * Método toString para obtener una representación en forma de cadena del objeto Poligono.
     *
     * @return Una cadena que representa el objeto Poligono.
     */
    @Override
    public String toString() {
        return "Poligono{" +
                "puntosPoligono=" + puntosPoligono +
                '}';
    }
}
