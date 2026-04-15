import java.util.*;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.*;

public class AlumnoMain {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Uso: <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String fichero = args[1];

        Gson gson = new Gson();

        try {
            if (operacion.equals("init")) {

                // Crear alumno por defecto
                Alumno alumno = new Alumno("Juan", 20);

                // Escribir en JSON
                ArrayList<Alumno> lista = new ArrayList<>();

                lista.add(new Alumno("Juan", 20));
                lista.add(new Alumno("Ana", 22));
                lista.add(new Alumno("Luis", 19));

                FileWriter writer = new FileWriter(fichero);
                gson.toJson(lista, writer);
                writer.close();

                System.out.println("Fichero creado.");

            } else if (operacion.equals("show")) {

                // Leer JSON
                Type tipoLista = new TypeToken<ArrayList<Alumno>>(){}.getType();

                FileReader reader = new FileReader(fichero);
                ArrayList<Alumno> lista = gson.fromJson(reader, tipoLista);
                reader.close();
                // Mostrar datos
                for (Alumno a : lista) {
                    System.out.println("Nombre: " + a.getNombre());
                    System.out.println("Edad: " + a.getEdad());
                }
            } else {
                System.out.println("Operación no válida.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}