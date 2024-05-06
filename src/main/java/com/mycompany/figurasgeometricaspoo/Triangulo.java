package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;

     /**
     * Constructor de la clase Triangulo.
     *
     * @param nombre
     * @param color
     * @param base
     * @param altura
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método para devolver la base del triangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getBase() {
        return this.base;
    }
    
    /**
     * Método para devolver la altura del triangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
    */
    public double getAltura() {
        return this.altura;
    }
    
    /**
     * Método para modificar la base y altura del triangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setLados(double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Método para calcular el area del triangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        return (base*altura)/2;
    }
    
    /**
     * Método para calcular el perimetro del triangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerPerimetro() {
        return (base+altura)+ Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}

