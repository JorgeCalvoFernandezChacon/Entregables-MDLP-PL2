package es.uah.matcomp.mp.el2.b.ejercicio1;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    // Método para guardar un objeto en un archivo JSON
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Método para cargar un objeto desde un archivo JSON
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("DEBUG: args[0] es '" + (args.length > 0 ? args[0] : "VACÍO") + "'");
        // 1. Validar que nos pasan los dos parámetros necesarios
        if (args.length < 2) {
            System.out.println("Error: Faltan parámetros.");
            System.out.println("Uso: <operacion> <fichero>");
            return;
        }
        String operacion = args[0];
        String rutaFichero = args[1];
        if (operacion.equalsIgnoreCase("init")) {
            // Crear objeto con valores por defecto
            Alumno defecto = new Alumno("Guillermo", "Martínez", "03223194C", 1);
            guardarObjetoEnArchivo(rutaFichero, defecto);
            System.out.println("Fichero inicializado correctamente en: " + rutaFichero);
        } else if (operacion.equalsIgnoreCase("show")) {
            Alumno cargado = cargarObjetoDesdeArchivo(rutaFichero, Alumno.class);
            if (cargado != null) {
                System.out.println("--- Datos del Usuario ---");
                System.out.println("Nombre: " + cargado.getNombre());
                System.out.println("Apellidos: " + cargado.getApellidos());
                System.out.println("DNI: " + cargado.getDni());
                System.out.println("Curso: " + cargado.getCurso() + "º");
            } else {
                System.out.println("Error: No se pudo leer el fichero.");
            }
        } else {
            System.out.println("Operación no reconocida. Usa 'init' o 'show'.");
        }
    }
}
