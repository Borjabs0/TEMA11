package com.borjabolufer.Tema11.ejercicios.ejercicio04;

public class Lavadora extends Electrodomestico {
    private float carga;
    private static final float CARGA_DEFAULT = 5f;

    public Lavadora() {
        super();
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(float precioBase, float peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}