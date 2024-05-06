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
     * Método para devolver el radio del circulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getRadio() {
        return this.radio;
    }
    
    /**
     * Método para modificar el radio del circulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /**
     * Método para calcular el area del circulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        return Math.PI*(Math.pow(radio, 2));
    }
    
    /**
     * Método para calcular el perimetro del circulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerPerimetro() {
        return 2*Math.PI*radio;
    }
}
