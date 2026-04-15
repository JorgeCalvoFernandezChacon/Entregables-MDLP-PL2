package org.example;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainAlumno {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: java -jar Proyecto.jar <operacion> <fichero>");
            return;
        }
        String operacion = args[0];
        String fichero = args[1];
        Gson gson = new Gson();
        if (operacion.equals("init")) {
            Alumno alumnoPorDefecto = new Alumno("Alumno de Prueba", 12345);
            // Crea el archivo y guarda el alumno con valores por defecto
            try (FileWriter writer = new FileWriter(fichero)) {
                gson.toJson(alumnoPorDefecto, writer);
                System.out.println("Fichero inicializado con éxito en: " + fichero);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (operacion.equals("show")) {
            // Solo lee el JSON, no crea ni guarda nada
            try (FileReader reader = new FileReader(fichero)) {
                Alumno alumnoCargado = gson.fromJson(reader, Alumno.class);
                if (alumnoCargado != null) {
                    // Esto imprimirá los datos que haya encontrado en el archivo JSON
                    System.out.println("Datos del alumno:");
                    System.out.println("Nombre: " + alumnoCargado.nombre);
                    System.out.println("Matrícula: " + alumnoCargado.matricula);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo. ¿Seguro que existe?");
            }
        } else {
            System.out.println("Operación no reconocida. Usa 'init' o 'show'.");
        }
    }
}
