package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1_1 {
    public static void ejecutar() {
        try {
            Scanner in = new Scanner(new File("archivo_inexistente.in"));
            System.out.println("Archivo abierto exitosamente.");
        } catch (FileNotFoundException ex) {
            System.out.println("Capturado en Ejemplo 1.1: El archivo no fue encontrado.");
        }
    }
}
