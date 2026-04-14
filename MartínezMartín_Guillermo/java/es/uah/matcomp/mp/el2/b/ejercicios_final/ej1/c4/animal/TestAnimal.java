package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c4.animal;
import es.uah.matcomp.mp.el2.b.ejercicios_final.GsonUtil;

public class TestAnimal {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String nombreFichero = args[1];

        String carpetaPaquete = "src/main/java/es/uah/matcomp/mp/el2/a/ejercicios_final/ej1/c4/animal/";
        String rutaCompleta = carpetaPaquete + nombreFichero;

        if (operacion.equalsIgnoreCase("init")) {
            Dog miPerro = new Dog("Toby");

            GsonUtil.guardar(rutaCompleta, miPerro);
            System.out.println("Fichero de animal creado en: " + rutaCompleta);

        } else if (operacion.equalsIgnoreCase("show")) {
            Dog cargado = GsonUtil.cargar(rutaCompleta, Dog.class);

            if (cargado != null) {
                System.out.println("--- Datos del Animal Cargado ---");
                System.out.println("Nombre: " + cargado.name);

                System.out.print("Saludo normal: ");
                cargado.greets();

                System.out.print("Saludo a otro perro: ");
                cargado.greets(new Dog("Buddy"));
            } else {
                System.out.println("Error: No se encontró el archivo del animal.");
            }
        } else {
            System.out.println("Operación no reconocida.");
        }
    }
}