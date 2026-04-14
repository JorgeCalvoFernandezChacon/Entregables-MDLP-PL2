package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c3.cylinder;
import es.uah.matcomp.mp.el2.b.ejercicios_final.GsonUtil;

public class TestCylinder {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Faltan parámetros.");
            System.out.println("Uso: <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String nombreFichero = args[1];

        String carpetaPaquete = "src/main/java/es/uah/matcomp/mp/el2/a/ejercicios_final/ej1/c3/cylinder/";
        String rutaCompleta = carpetaPaquete + nombreFichero;

        if (operacion.equalsIgnoreCase("init")) {
            Cylinder miCilindro = new Cylinder(1, 5.0, "red");

            GsonUtil.guardar(rutaCompleta, miCilindro);
            System.out.println("Fichero de cilindro creado en: " + rutaCompleta);

        } else if (operacion.equalsIgnoreCase("show")) {
            Cylinder cargado = GsonUtil.cargar(rutaCompleta, Cylinder.class);

            if (cargado != null) {
                System.out.println("--- Datos del Cilindro ---");

                System.out.println("Radio base: " + cargado.getRadius());
                System.out.println("Altura: " + cargado.getHeight());
                System.out.println("Color: " + cargado.getColor());

                System.out.println("Área base: " + cargado.getArea());
                System.out.println("Volumen: " + cargado.getVolume());
            } else {
                System.out.println("Error: No se encontró el archivo del cilindro.");
            }
        } else {
            System.out.println("Operación no reconocida.");
        }
    }
}