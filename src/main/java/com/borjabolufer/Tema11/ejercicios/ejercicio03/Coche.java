package com.borjabolufer.Tema11.ejercicios.ejercicio03;

import java.util.Arrays;

/**
 * La clase Coche representa un coche con una matrícula única, velocidad actual, marcha actual
 * y un conjunto de marchas con sus respectivas velocidades máximas.
 */
public class Coche {
    private final static int NUMERO_DE_MARCHAS = 7;
    private final String matricula;
    private float velocidadActual;
    private int marchaActual;
    private int[] marchas;

    /**
     * Constructor de la clase Coche.
     *
     * @param matricula La matrícula del coche.
     */
    public Coche(String matricula) {
        this.matricula = matricula;
        this.velocidadActual = 0f;
        this.marchaActual = 0;

        // Inicialización de las marchas con sus velocidades máximas
        this.marchas = new int[NUMERO_DE_MARCHAS];
        for (int i = 0; i < NUMERO_DE_MARCHAS; i++) {
            this.marchas[i] = (i) * 20;
        }
    }

    /**
     * Método getter para obtener la matrícula del coche.
     *
     * @return La matrícula del coche.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Método getter para obtener la velocidad actual del coche.
     *
     * @return La velocidad actual del coche.
     */
    public float getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * Método getter para obtener la marcha actual del coche.
     *
     * @return La marcha actual del coche.
     */
    public int getMarchaActual() {
        return marchaActual;
    }

    /**
     * Método getter para obtener el conjunto de marchas con sus respectivas velocidades máximas.
     *
     * @return El conjunto de marchas del coche.
     */
    public int[] getMarchas() {
        return marchas;
    }

    /**
     * Método para acelerar el coche.
     *
     * @param aceleracion La cantidad de aceleración aplicada.
     */
    public void acelerar(float aceleracion) {
        if (aceleracion < 0) {
            velocidadActual = 0;
        } else {
            velocidadActual += aceleracion;
        }
    }

    /**
     * Método para frenar el coche.
     *
     * @param frenar La cantidad de frenado aplicada.
     */
    public void frenar(float frenar) {
        if (frenar <= 0) {
            return;
        }
        velocidadActual -= frenar;
    }

    /**
     * Método para cambiar la marcha del coche.
     *
     * @param cambioMarcha La nueva marcha a la que se quiere cambiar.
     */
    public void cambioDeMarcha(int cambioMarcha) {
        if (cambioMarcha < 0) {
            marchaActual = 0;
        } else if (cambioMarcha > NUMERO_DE_MARCHAS) {
            marchaActual = NUMERO_DE_MARCHAS;
        } else {
            marchaActual = cambioMarcha;
        }
    }

    /**
     * Método toString para obtener una representación en forma de cadena del objeto Coche.
     *
     * @return Una cadena que representa el objeto Coche.
     */
    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", marchaActual=" + marchaActual +
                ", marchas=" + Arrays.toString(marchas) +
                '}';
    }
}