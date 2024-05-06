package com.mycompany.figurasgeometricaspoo;

public class Rectangulo extends FiguraGeometrica {
    
    private double lado1;
    private double lado2;

     /**
     * Constructor de la clase Rectangulo.
     *
     * @param nombre
     * @param color
     * @param lado1
     * @param lado2
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Método para devolver el lado 1 del rectangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getLado1() {
        return this.lado1;
    }
    
    /**
     * Método para devolver el lado 2 del rectangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
    */
    public double getLado2() {
        return this.lado2;
    }
    
    /**
     * Método para modificar los lados del rectangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setLados(double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    /**
     * Método para calcular el area del rectangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        return (lado1*lado2);
    }
    
    /**
     * Método para calcular el perimetro del rectangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerPerimetro() {
        return 2*(lado1+lado2);
    }
}

