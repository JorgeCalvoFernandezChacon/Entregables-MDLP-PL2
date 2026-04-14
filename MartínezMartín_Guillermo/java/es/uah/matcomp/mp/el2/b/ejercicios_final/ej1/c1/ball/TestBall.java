package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c1.ball;
import es.uah.matcomp.mp.el2.b.ejercicios_final.GsonUtil;

public class TestBall {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Faltan parámetros.");
            System.out.println("Uso: <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String nombreFichero = args[1];

        // Ruta para que se guarde en la misma carpeta del paquete
        String carpetaPaquete = "src/main/java/es/uah/matcomp/mp/el2/a/ejercicios_final/ej1/c1/ball/";
        String rutaCompleta = carpetaPaquete + nombreFichero;

        if (operacion.equalsIgnoreCase("init")) {
            // Creamos una pelota con valores de prueba
            // Constructor: Ball(x, y, radius, xDelta, yDelta)
            Ball miPelota = new Ball(1.5f, 2.0f, 5, 0.2f, 2.4f);

            // Guardamos usando la utilidad de Gson
            GsonUtil.guardar(rutaCompleta, miPelota);
            System.out.println("Fichero de pelota creado en: " + rutaCompleta);

        } else if (operacion.equalsIgnoreCase("show")) {
            // Cargamos la pelota desde el JSON
            Ball cargada = GsonUtil.cargar(rutaCompleta, Ball.class);

            if (cargada != null) {
                System.out.println("--- Datos de la Pelota ---");
                System.out.println("Posición: (" + cargada.getX() + ", " + cargada.getY() + ")");
                System.out.println("Radio: " + cargada.getRadius());
                System.out.println("Delta: [x=" + cargada.getXDelta() + ", y=" + cargada.getYDelta() + "]");
            } else {
                System.out.println("Error: No se encontró el archivo de la pelota.");
            }
        } else {
            System.out.println("Operación no reconocida.");
        }
    }
}