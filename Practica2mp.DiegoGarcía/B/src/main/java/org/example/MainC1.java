package org.example;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainC1 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        // Creamos las instancias de las clases
        DateC1 miFecha = new DateC1(15, 4, 2026);
        CircleC1 miCirculo = new CircleC1(5.5);
        try (FileWriter writerFecha = new FileWriter("fecha.json");
             FileWriter writerCirculo = new FileWriter("circulo.json")) {
            // Guardamos cada objeto en un archivo distinto
            gson.toJson(miFecha, writerFecha);
            gson.toJson(miCirculo, writerCirculo);

            System.out.println("Los archivos 'fecha.json' y 'circulo.json' se han guardado.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader readerFecha = new FileReader("fecha.json");
             FileReader readerCirculo = new FileReader("circulo.json")) {
            // Reconstruimos los objetos leyendo los archivos
            DateC1 fechaCargada = gson.fromJson(readerFecha, DateC1.class);
            CircleC1 circuloCargado = gson.fromJson(readerCirculo, CircleC1.class);

            System.out.println("\n--- Objetos cargados desde los archivos ---");
            if (fechaCargada != null) {
                System.out.println(fechaCargada.toString());
            }
            if (circuloCargado != null) {
                System.out.println(circuloCargado.toString());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
