package com.borjabolufer.Tema11.ejercicios.ejercicio03;

/**
 * La clase CocheCambioAutomatico representa un tipo de coche que cambia automáticamente de marcha
 * dependiendo de la velocidad actual del coche.
 */
public class CocheCambioAutomatico extends Coche {

    /**
     * Constructor de la clase CocheCambioAutomatico.
     *
     * @param matricula La matrícula del coche.
     */
    public CocheCambioAutomatico(String matricula) {
        super(matricula);
    }

    /**
     * Sobrescribe el método acelerar de la clase Coche.
     * Además de acelerar el coche, ajusta automáticamente la marcha.
     *
     * @param aceleracion La cantidad de aceleración aplicada.
     */
    @Override
    public void acelerar(float aceleracion) {
        super.acelerar(aceleracion);
        ajustarMarchaAutomaticamente(); // Ajusta automáticamente la marcha
    }

    /**
     * Sobrescribe el método frenar de la clase Coche.
     * Además de frenar el coche, ajusta automáticamente la marcha.
     *
     * @param frenar La cantidad de frenado aplicada.
     */
    @Override
    public void frenar(float frenar) {
        super.frenar(frenar);
        ajustarMarchaAutomaticamente(); // Ajusta automáticamente la marcha
    }

    /**
     * Método privado para ajustar la marcha automáticamente dependiendo de la velocidad actual del coche.
     */
    private void ajustarMarchaAutomaticamente() {
        int nuevaMarcha = 0;
        float velocidadActual = getVelocidadActual();
        int[] marchas = getMarchas();
        // Recorre las marchas para encontrar la adecuada según la velocidad actual
        for (int i = 0; i < marchas.length; i++) {
            if (velocidadActual <= marchas[i]) {
                nuevaMarcha = i;
                break;
            }
        }
        // Cambia la marcha automáticamente
        cambioDeMarcha(nuevaMarcha);
    }
}
