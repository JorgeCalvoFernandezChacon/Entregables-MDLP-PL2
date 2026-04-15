package org.example;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainC4 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        // Creamos las instancias de las clases
        CircleC4 miCirculo = new CircleC4(8.5);
        AnimalC4 miAnimal = new AnimalC4("Pantera");
        String archivoCirculo = "circulo_c4.json";
        String archivoAnimal = "animal_c4.json";
        try (FileWriter writerCirculo = new FileWriter(archivoCirculo);
             FileWriter writerAnimal = new FileWriter(archivoAnimal)) {
            // Guardamos cada objeto en un archivo distinto
            gson.toJson(miCirculo, writerCirculo);
            gson.toJson(miAnimal, writerAnimal);
            System.out.println("Archivos '" + archivoCirculo + "' y '" + archivoAnimal + "' creados correctamente.");
        }
        catch (IOException e) {
            System.out.println("Error al escribir los archivos.");
            e.printStackTrace();
        }
        try (FileReader readerCirculo = new FileReader(archivoCirculo);
             FileReader readerAnimal = new FileReader(archivoAnimal)) {
            // Reconstruimos los objetos leyendo los archivos
            CircleC4 circuloCargado = gson.fromJson(readerCirculo, CircleC4.class);
            AnimalC4 animalCargado = gson.fromJson(readerAnimal, AnimalC4.class);
            System.out.println("\n--- Objetos cargados desde los archivos ---");
            if (circuloCargado != null) {
                System.out.println("Círculo: " + circuloCargado.toString());
            }

            if (animalCargado != null) {
                System.out.println("¡Animal cargado correctamente!");
                animalCargado.greets();
            }
        }
        catch (IOException e) {
            System.out.println("Error al leer los archivos.");
            e.printStackTrace();
        }
    }
}
