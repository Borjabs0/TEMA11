package com.borjabolufer.Tema11.ejercicios.ejercicio01;

/**
 * La clase Punto representa un punto en un plano cartesiano, definido por sus coordenadas x e y.
 */
public class Punto {
    private double x; // Coordenada x del punto
    private double y; // Coordenada y del punto

    /**
     * Constructor de la clase Punto.
     *
     * @param x Coordenada x del punto.
     * @param y Coordenada y del punto.
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor por defecto de la clase Punto.
     * Inicializa las coordenadas x e y a 0.
     */
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Método getter para obtener la coordenada x del punto.
     *
     * @return La coordenada x del punto.
     */
    public double getX() {
        return x;
    }

    /**
     * Método getter para obtener la coordenada y del punto.
     *
     * @return La coordenada y del punto.
     */
    public double getY() {
        return y;
    }

    /**
     * Método setter para establecer la coordenada x del punto.
     *
     * @param x La nueva coordenada x del punto.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Método setter para establecer la coordenada y del punto.
     *
     * @param y La nueva coordenada y del punto.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Método para calcular la distancia entre el punto x  y el punto y dado.
     *
     * @param punto El punto con el que se desea calcular la distancia.
     * @return La distancia entre este punto y el punto dado.
     */
    public double distancia(Punto punto) {
        double distanciaX = this.x - punto.x;
        double distanciaY = this.y - punto.y;
        return Math.sqrt(Math.pow(punto.x - x, 2 ) + Math.pow(punto.y - y, 2));
    }

    /**
     * Método toString para obtener una representación en forma de cadena del objeto Punto.
     *
     * @return Una cadena que representa el objeto Punto.
     */
    @Override
    public String toString() {
        return "(" +
                x +
                ", " +
                y +
                ')';
    }
}
