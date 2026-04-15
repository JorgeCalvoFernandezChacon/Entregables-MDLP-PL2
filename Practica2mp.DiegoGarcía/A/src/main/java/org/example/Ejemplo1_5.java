package org.example;

public class Ejemplo1_5 {
    public static void ejecutar() {
        try {
            String[] colores = {"Rojo", "Verde"};
            System.out.println(colores[5]); // Intentamos acceder al 6º color
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ejemplo 1.7a - Ese color no existe en la paleta.");
        }

        try {
            String coche = null;
            System.out.println(coche.length()); // Intentamos medir algo que no existe
        }
        catch (NullPointerException e) {
            System.out.println("Ejemplo 1.7b - El objeto coche no ha sido inicializado.");
        }


        try {
            int precio = Integer.parseInt("Veinte euros"); // No es un número válido
        }
        catch (NumberFormatException e) {
            System.out.println("Ejemplo 1.7c - No se pudo convertir la palabra a número.");
        }


        try {
            Object animal = "Perro";
            Integer patas = (Integer) animal; // Un texto no es un entero
        }
        catch (ClassCastException e) {
            System.out.println("Ejemplo 1.7d - Error al intentar transformar tipos incompatibles.");
        }
    }
}
