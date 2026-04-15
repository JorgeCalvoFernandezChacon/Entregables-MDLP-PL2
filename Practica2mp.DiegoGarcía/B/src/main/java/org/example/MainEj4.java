package org.example;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainEj4 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        // Creamos la estructura (Array de Estudiantes)
        EstudianteEj4[] listaAlumnos = {
                new EstudianteEj4("Carlos"),
                new EstudianteEj4("Lucía")
        };
        // Metemos ese array dentro de la Asignatura
        AsignaturaEj4 programacion = new AsignaturaEj4("Metodología de la Programación", listaAlumnos);
        // Guardamos en json
        try (FileWriter writer = new FileWriter("asignatura.json")) {
            gson.toJson(programacion, writer);
            System.out.println("Archivo 'asignatura.json' creado con éxito.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        // Cargamos desde json
        try (FileReader reader = new FileReader("asignatura.json")) {
            AsignaturaEj4 asigCargada = gson.fromJson(reader, AsignaturaEj4.class);
            System.out.println("\n--- Datos cargados ---");
            System.out.println("Asignatura: " + asigCargada.nombreAsignatura);
            System.out.println("Primer alumno: " + asigCargada.alumnos[0].nombre);
            System.out.println("Segundo alumno: " + asigCargada.alumnos[1].nombre);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//¿Qué estructura tiene el fichero resultante?  Tendrá una estructura jerárquica.
// La raíz será el objeto Asignatura con llaves {}.
// Dentro, habrá una clave "nombreAsignatura" y una clave "alumnos".
// La clave "alumnos" contendrá un array [] en cuyo interior habrá varios objetos Estudiante {}

//¿Puedo modificar los alumnos en el fichero resultante, y obtener unos nuevos objetos cargando el fichero de vuelta?
// Si abres el archivo asignatura.json con IntelliJ, cambias "Carlos" por "Marcos",
// guardas el archivo de texto y vuelves a ejecutar la parte del programa que lee,
// Java construirá un nuevo objeto Estudiante en memoria con el nombre "Marcos".