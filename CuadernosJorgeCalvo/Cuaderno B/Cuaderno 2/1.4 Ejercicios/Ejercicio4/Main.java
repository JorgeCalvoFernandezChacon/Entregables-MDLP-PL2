package Ejercicio4;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Uso: <operacion> <fichero>");
                return;
            }

            String operacion = args[0];
            String nombreFichero = args[1];

            Gson gson = new Gson();
            if (operacion.equalsIgnoreCase("init")) {
                // Nueva asignatura
                Asignatura asignatura = new Asignatura("Metodologías de Programación");

                // Añadimos estudiantes
                asignatura.agregarEstudiante(new Estudiante("Pedro", "Dominguez"));
                asignatura.agregarEstudiante(new Estudiante("Juanito", "Picapiedra"));

                // 3. Guardamos el objeto compuesto (Asignatura -> Lista de Estudiantes)

                FileWriter writer = new FileWriter(nombreFichero);
                gson.toJson(asignatura, writer);
                writer.close();

                System.out.println("Fichero creado.");

            } else if (operacion.equalsIgnoreCase("show")) {

                FileReader reader = new FileReader(nombreFichero);
                Asignatura cargada = gson.fromJson(reader, Asignatura.class);
                reader.close();

                if (cargada != null) {
                    System.out.println("Asignatura: " + cargada.NombreAsignatura);
                    System.out.println("Lista de estudiantes:");
                    // 2. Recorremos la lista interna que Gson ha reconstruido
                    for (Estudiante e : cargada.estudiantes) {
                        System.out.println("- " + e.getNombre() + " (" + e.getApellido() + " años)");
                    }
                } else {
                    System.out.println("No se pudo cargar el fichero.");
                }

            } else {
                System.out.println("Operación no válida. Usa 'init' o 'show'.");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
