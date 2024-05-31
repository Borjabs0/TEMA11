package com.borjabolufer.Tema11.ejercicios.ejercicio04;

public class Electrodomestico {
    protected float precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;

    private static final float PRECIO_BASE_DEFAULT = 100f;
    private static final String COLOR_DEFAULT = Colores.BLANCO.toString();
    private static final char CONSUMO_ENERGETICO_DEFAULT = 'F';
    private static final float PESO_DEFAULT = 5f;

    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_DEFAULT;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
        this.peso = PESO_DEFAULT;
    }

    public Electrodomestico(float precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
    }

    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }
    private void comprobarColor(String color) {
        try {
            this.color = Colores.valueOf(color.toUpperCase()).toString();
        } catch (IllegalArgumentException e) {
            this.color = Colores.BLANCO.toString();
        }
    }

    public float precioFinal() {
        float precioFinal = this.precioBase;

        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }

        if (this.peso >= 0 && this.peso < 20) {
            precioFinal += 10;
        } else if (this.peso >= 20 && this.peso < 50) {
            precioFinal += 50;
        } else if (this.peso >= 50 && this.peso < 80) {
            precioFinal += 80;
        } else if (this.peso >= 80) {
            precioFinal += 100;
        }

        return precioFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
