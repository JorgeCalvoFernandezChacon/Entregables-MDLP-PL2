import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1_1 {

    public static void ejecutar() {
        System.out.println("--- Ejecutando Ejemplo 1.1: Manejo de FileNotFoundException ---");

        // Intentamos abrir un archivo que no existe para ver el manejo
        File archivo = new File("archivo_inexistente.txt");

        try {
            // Esta línea lanzaría un error si no estuviera dentro de un try
            Scanner lector = new Scanner(archivo);
            System.out.println("Archivo leído con éxito.");
            lector.close();
        } catch (FileNotFoundException ex) {
            // Separamos la gestión del error de la lógica principal
            System.out.println("¡Error capturado!: El archivo no se ha encontrado en el disco.");
            System.out.println("Mensaje oficial: " + ex.getMessage());
        }

        System.out.println("El programa continúa su flujo normal gracias al catch.\n");
    }
}