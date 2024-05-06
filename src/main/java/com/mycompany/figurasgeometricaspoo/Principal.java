package com.mycompany.figurasgeometricaspoo;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    /**
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingrese el nombre de la figura");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el color de la figura");
        String color = sc.nextLine();
        System.out.println("Ingrese el tipo de figura: \n1) Circulo \n2) Rectangulo \n3) Triangulo");
        int figura = sc.nextInt();
        
        switch (figura){
            case 1:
                System.out.println("Ingrese el radio del circulo");
                double radio = sc.nextDouble();
                Circulo miCirculo = new Circulo(nombre,color,radio); 
                System.out.println("El area del circulo es: "+miCirculo.obtenerArea());
                System.out.println("El perimetro del circulo es: "+miCirculo.obtenerPerimetro());
                break;
            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectangulo");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectangulo");
                double lado2 = sc.nextDouble();
                Rectangulo miRectangulo = new Rectangulo(nombre,color,lado1,lado2); 
                System.out.println("El area del rectangulo es: "+miRectangulo.obtenerArea());
                System.out.println("El perimetro del circulo es: "+miRectangulo.obtenerPerimetro());
                break;
            case 3:
                System.out.println("Ingrese el valor de la base del triangulo");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triangulo");
                double altura = sc.nextDouble();
                Triangulo miTriangulo = new Triangulo(nombre,color,base,altura);
                System.out.println("El area del triangulo es: "+miTriangulo.obtenerArea());
                System.out.println("El perimetro del trangulo es: "+miTriangulo.obtenerPerimetro());
                break;
            default:
                System.out.println("Opción incorrecta.");
                break;
        }
    }
}
