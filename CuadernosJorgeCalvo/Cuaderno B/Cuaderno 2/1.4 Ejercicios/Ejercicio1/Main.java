package Ejercicio1;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.*;

public class Main {
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

                Datos datos = new Datos();

                // Ejemplos
                datos.getGatos().add(new Cat4("Michi"));
                datos.getEmpleados().add(new Employee1(3920,"Pedro", "Blas", 1000 ));
                datos.getPuntos().add(new MyPoint2(3, 1));
                datos.getPelotas().add(new Ball1(1,1,1,2,3));

                FileWriter writer = new FileWriter(fichero);
                gson.toJson(datos, writer);
                writer.close();

                System.out.println("Fichero creado.");

            } else if (operacion.equals("show")) {

                FileReader reader = new FileReader(fichero);

                Datos datos = gson.fromJson(reader, Datos.class);

                reader.close();

                for (Dog4 d : datos.getPerros()) {
                    System.out.println("Perro: " + d.getNombre());
                }

                for (Cat4 c : datos.getGatos()) {
                    System.out.println("Gato: " + c.getNombre());
                }

                for (Employee1 e : datos.getEmpleados()) {
                    System.out.println(e);
                }

                for (MyPoint2 p : datos.getPuntos()) {
                    System.out.println(p);
                }

                for (Ball1 b : datos.getPelotas()) {
                    System.out.println(b);
                }

                for (Author2 b : datos.getAutores()) {
                    System.out.println(b);
                }

                for (Person3 b : datos.getPersonas()) {
                    System.out.println(b);
                }

                for (Animal3 b : datos.getAnimales3()) {
                    System.out.println(b);
                }
            } else {
                System.out.println("Operación no válida.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
