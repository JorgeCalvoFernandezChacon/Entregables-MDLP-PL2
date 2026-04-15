package org.example;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainC3 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        // Creamos las instancias de las clases
        AnimalC3 miAnimal = new AnimalC3("Tigre Siberiano");
        PersonC3 miPersona = new PersonC3("Laura Garcia", "Calle Mayor 123");
        String archivoAnimal = "animal_c3.json";
        String archivoPersona = "persona_c3.json";
        try (FileWriter writerAnimal = new FileWriter(archivoAnimal);
             FileWriter writerPersona = new FileWriter(archivoPersona)) {

            // Guardamos cada objeto en un archivo distinto
            gson.toJson(miAnimal, writerAnimal);
            gson.toJson(miPersona, writerPersona);
            System.out.println("Archivos '" + archivoAnimal + "' y '" + archivoPersona + "' creados correctamente.");
        }
        catch (IOException e) {
            System.out.println("Error al escribir los archivos.");
            e.printStackTrace();
        }
        try (FileReader readerAnimal = new FileReader(archivoAnimal);
             FileReader readerPersona = new FileReader(archivoPersona)) {
            // Reconstruimos los objetos leyendo los archivos
            AnimalC3 animalCargado = gson.fromJson(readerAnimal, AnimalC3.class);
            PersonC3 personaCargada = gson.fromJson(readerPersona, PersonC3.class);
            System.out.println("\n--- Objetos cargados desde los archivos ---");
            if (animalCargado != null) {
                System.out.println("Animal: " + animalCargado.toString());
            }
            if (personaCargada != null) {
                System.out.println("Persona: " + personaCargada.toString());
            }
        }
        catch (IOException e) {
            System.out.println("Error al leer los archivos.");
            e.printStackTrace();
        }
    }
}
