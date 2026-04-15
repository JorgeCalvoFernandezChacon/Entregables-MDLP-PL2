package org.example;

public class Ejemplo1_4 {
    public static void ejecutar() {
        System.out.println("Intentando conectar a la Base de Datos...");
        try {
            // Simulamos un error durante la conexión
            int simularFallo = 10 / 0;
            System.out.println("Conexión establecida.");
        }
        catch (Exception ex) {
            System.out.println("Ejemplo 1.6 - Hubo un problema al conectar con el servidor.");
        }
        finally {
            // Esto se ejecuta siempre
            System.out.println("Ejemplo 1.6 (Finally) - Cerrando el puerto de red por seguridad.");
        }
    }
}
