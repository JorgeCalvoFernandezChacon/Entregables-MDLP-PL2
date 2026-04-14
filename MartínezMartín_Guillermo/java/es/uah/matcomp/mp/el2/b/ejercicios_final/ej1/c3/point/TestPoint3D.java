package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c3.point;
import es.uah.matcomp.mp.el2.b.ejercicios_final.GsonUtil;

public class TestPoint3D {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Faltan parámetros.");
            System.out.println("Uso: <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String nombreFichero = args[1];

        String carpetaPaquete = "src/main/java/es/uah/matcomp/mp/el2/a/ejercicios_final/ej1/c3/point/";
        String rutaCompleta = carpetaPaquete + nombreFichero;

        if (operacion.equalsIgnoreCase("init")) {
            Point3D punto = new Point3D(1.0f, 2.0f, 3.0f);

            GsonUtil.guardar(rutaCompleta, punto);
            System.out.println("Fichero de punto creado en: " + rutaCompleta);

        } else if (operacion.equalsIgnoreCase("show")) {
            Point3D cargado = GsonUtil.cargar(rutaCompleta, Point3D.class);

            if (cargado != null) {
                System.out.println("--- Datos del Punto Cargado ---");
                System.out.println("Representación: " + cargado.toString());

                float[] coords = cargado.getXYZ();
                System.out.println("Coordenadas desde array: X=" + coords[0] + ", Y=" + coords[1] + ", Z=" + coords[2]);
            } else {
                System.out.println("Error: No se encontró el archivo del punto.");
            }
        } else {
            System.out.println("Operación no reconocida.");
        }
    }
}