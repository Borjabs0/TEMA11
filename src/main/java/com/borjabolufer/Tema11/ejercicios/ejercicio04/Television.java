package com.borjabolufer.Tema11.ejercicios.ejercicio04;

public class Television extends Electrodomestico {
    private int resolucion;
    private boolean smartTV;

    private static final int RESOLUCION_DEFAULT = 20;
    private static final boolean SMARTTV_DEFAULT = false;

    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFAULT;
        this.smartTV = SMARTTV_DEFAULT;
    }

    public Television(float precioBase, float peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEFAULT;
        this.smartTV = SMARTTV_DEFAULT;
    }

    public Television(float precioBase, String color, char consumoEnergetico, float peso, int resolucion, boolean smartTV) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.smartTV = smartTV;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();
        if (resolucion > 40){
            precioFinal *= 0.3f;
        } else if (isSmartTV()) {
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", smartTV=" + smartTV +
                ", precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}