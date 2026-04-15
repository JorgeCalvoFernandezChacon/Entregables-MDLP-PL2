package org.example;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class GsonUtilEjemplo {
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
        String rutaArchivo = "usuario.json";
        // Solo lo lee, no crea ni guarda nada
        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);
        if (usuarioCargado != null) {
            // Esto imprimirá "María Antonieta" si modificaste el JSON
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);
        }
    }
    static class Usuario {
        String nombre;
        int edad;
        String correo;
    }
}