package org.example;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainC2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        // Creamos las instancias de las clases
        CustomerC2 miCliente = new CustomerC2(101, "Ana Martinez", 15);
        AuthorC2 miAutor = new AuthorC2("J.R.R. Tolkien", "tolkien@middleearth.com");
        String archivoCliente = "cliente_c2.json";
        String archivoAutor = "autor_c2.json";
        try (FileWriter writerCliente = new FileWriter(archivoCliente);
             FileWriter writerAutor = new FileWriter(archivoAutor)) {
            // Guardamos cada objeto en un archivo distinto
            gson.toJson(miCliente, writerCliente);
            gson.toJson(miAutor, writerAutor);
            System.out.println("Archivos '" + archivoCliente + "' y '" + archivoAutor + "' guardados correctamente.");
        }
        catch (IOException e) {
            System.out.println("Error al escribir los archivos.");
            e.printStackTrace();
        }
        try (FileReader readerCliente = new FileReader(archivoCliente);
             FileReader readerAutor = new FileReader(archivoAutor)) {
            // Reconstruimos los objetos leyendo los archivos
            CustomerC2 clienteCargado = gson.fromJson(readerCliente, CustomerC2.class);
            AuthorC2 autorCargado = gson.fromJson(readerAutor, AuthorC2.class);
            System.out.println("\n--- Objetos cargados desde los archivos ---");
            if (clienteCargado != null) {
                System.out.println("Cliente: " + clienteCargado.toString());
            }
            if (autorCargado != null) {
                System.out.println("Autor: " + autorCargado.toString());
            }
        }
        catch (IOException e) {
            System.out.println("Error al leer los archivos.");
            e.printStackTrace();
        }
    }
}
