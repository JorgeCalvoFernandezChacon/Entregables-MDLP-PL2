package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c4.shape;
import es.uah.matcomp.mp.el2.b.ejercicios_final.GsonUtil;

public class TestShape {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Faltan parámetros.");
            System.out.println("Uso: <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String nombreFichero = args[1];

        String carpetaPaquete = "src/main/java/es/uah/matcomp/mp/el2/a/ejercicios_final/ej1/c4/shape/";
        String rutaCompleta = carpetaPaquete + nombreFichero;

        if (operacion.equalsIgnoreCase("init")) {
            Square miCuadrado = new Square(5.0, "green", false);

            GsonUtil.guardar(rutaCompleta, miCuadrado);
            System.out.println("Fichero de forma (Square) creado en: " + rutaCompleta);

        } else if (operacion.equalsIgnoreCase("show")) {
            Square cargado = GsonUtil.cargar(rutaCompleta, Square.class);

            if (cargado != null) {
                System.out.println("--- Datos de la Forma Cargada ---");

                System.out.println("Lado: " + cargado.getSide());
                System.out.println("Color: " + cargado.getColor());
                System.out.println("Relleno: " + (cargado.isFilled() ? "Sí" : "No"));

                System.out.println("Área: " + cargado.getArea());
                System.out.println("Perímetro: " + cargado.getPerimeter());
            } else {
                System.out.println("Error: No se encontró el archivo.");
            }
        } else {
            System.out.println("Operación no reconocida.");
        }
    }
}
