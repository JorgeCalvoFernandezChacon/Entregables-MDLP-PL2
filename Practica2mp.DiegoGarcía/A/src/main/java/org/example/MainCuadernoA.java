package org.example;

public class MainCuadernoA {
    public static void main(String[] args) {
        System.out.println("========== INICIO DE LA PRÁCTICA ==========\n");
        System.out.println("--- Ejecutando Ejemplo 1.1 ---");
        Ejemplo1_1.ejecutar();
        System.out.println("\n--- Ejecutando Ejemplo 1.2 ---");
        try {
            Ejemplo1_2.ejecutar();
        } catch (ArithmeticException e) {
            System.out.println("--> Excepción devuelta hasta el Main: / by zero");
        }
        System.out.println("\n--- Ejecutando Ejemplo 1.3 ---");
        Ejemplo1_3.ejecutar();
        System.out.println("\n--- Ejecutando Ejemplo 1.6 ---");
        Ejemplo1_4.ejecutar();
        System.out.println("\n--- Ejecutando Ejemplo 1.7 ---");
        Ejemplo1_5.ejecutar();
        System.out.println("\n--- Ejecutando Ejemplo 1.8 ---");
        Ejemplo1_6.ejecutar();
        System.out.println("\n========== FIN DE LA PRÁCTICA ==========");
    }
}
