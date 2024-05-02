package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
    
    private double radio;

     /**
     * Constructor de la clase Pantalon.
     *
     * @param nombre
     * @param color
     * @param radio
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Método para 
     * Redefine el método obtenerArea de la clase padre FiguraGeometrica.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return super.obtenerArea();
    }
    
    /**
     * Método para 
     * Redefine el método obtenerPerimetro de la clase padre FiguraGeometrica.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return super.obtenerPerimetro();
    }
}
