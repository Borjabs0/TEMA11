package com.borjabolufer.Tema11.ejercicios.ejercicio03;

/**
 * La clase CocheCambioManual representa un tipo de coche en el cual el cambio de marcha debe hacerse manualmente.
 */
public class CocheCambioManual extends Coche {

    /**
     * Constructor de la clase CocheCambioManual.
     *
     * @param matricula La matrícula del coche.
     */
    public CocheCambioManual(String matricula) {
        super(matricula);
    }

    /**
     * Sobrescribe el método cambioDeMarcha de la clase Coche.
     * Permite cambiar de marcha manualmente si el valor proporcionado es mayor o igual a 0.
     *
     * @param cambioMarcha La nueva marcha a la que se quiere cambiar.
     */
    @Override
    public void cambioDeMarcha(int cambioMarcha) {
        if (cambioMarcha < 0) {
            return; // Si el valor es negativo, no se realiza el cambio de marcha
        }
        super.cambioDeMarcha(cambioMarcha); // Realiza el cambio de marcha llamando al método de la clase base
    }
}
