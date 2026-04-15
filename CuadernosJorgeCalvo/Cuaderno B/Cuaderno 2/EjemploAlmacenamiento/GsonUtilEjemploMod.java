import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class GsonUtilEjemploMod {
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
        String rutaArchivo = "usuario.json";
        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);

        if (usuarioCargado != null) {
            System.out.println("Nombre: " + usuarioCargado.nombre);
            System.out.println("Edad: " + usuarioCargado.edad);
            System.out.println("Correo: " + usuarioCargado.correo);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<args.length;i++)
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        System.out.println("Argumentos: \n" + sb);
    }
    // Clase Usuario para los ejemplos
    static class Usuario {
        String nombre;
        int edad;
        String correo;
        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
// Getters y setters no incluidos por brevedad
    }
}

