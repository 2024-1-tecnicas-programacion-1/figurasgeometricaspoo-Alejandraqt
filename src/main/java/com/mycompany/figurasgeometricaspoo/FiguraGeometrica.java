package com.mycompany.figurasgeometricaspoo;

public class FiguraGeometrica {
    
    private String nombre;
    private String color;

    /**
     * Constructor de la clase.
     * 
     * @param nombre nombre de la figura geometrica
     * @param color color de la figura
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
}
