package com.borjabolufer.Tema11.ejercicios.ejercicio04;

public enum Colores {
    BLANCO, NEGRO, ROJO, AZUL, GRIS;

    @Override
    public String toString() {
        return switch (this){
            case BLANCO ->  "Blanco";
            case NEGRO -> "Negro";
            case ROJO -> "Rojo";
            case AZUL -> "Azul";
            case GRIS -> "Gris";
        };
    }
}
