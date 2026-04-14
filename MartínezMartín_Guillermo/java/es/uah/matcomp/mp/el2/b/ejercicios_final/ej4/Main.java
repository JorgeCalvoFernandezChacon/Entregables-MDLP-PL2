package es.uah.matcomp.mp.el2.b.ejercicios_final.ej4;
import es.uah.matcomp.mp.el2.b.ejercicios_final.GsonUtil;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String nombreFichero = args[1];
        String rutaFichero = "src/main/java/es/uah/matcomp/mp/el2/a/ejercicios_final/ej4/";

        if (operacion.equalsIgnoreCase("init")) {
            // 1. Creamos la asignatura
            Asignatura asignatura = new Asignatura("Metodologías de Programación");

            // 2. Creamos y añadimos estudiantes
            asignatura.agregarEstudiante(new Estudiante("Guillermo", 19));
            asignatura.agregarEstudiante(new Estudiante("Diego", 18));

            // 3. Guardamos el objeto compuesto (Asignatura -> Lista de Estudiantes)

            GsonUtil.guardar(rutaFichero + nombreFichero, asignatura);
            System.out.println("Fichero '" + nombreFichero + "' creado con la asignatura y sus alumnos.");

        } else if (operacion.equalsIgnoreCase("show")) {
            // 1. Cargamos el objeto completo
            Asignatura cargada = GsonUtil.cargar(rutaFichero + nombreFichero, Asignatura.class);

            if (cargada != null) {
                System.out.println("Asignatura: " + cargada.nombreAsignatura);
                System.out.println("Lista de estudiantes:");
                // 2. Recorremos la lista interna que Gson ha reconstruido
                for (Estudiante e : cargada.estudiantes) {
                    System.out.println("- " + e.nombre + " (" + e.edad + " años)");
                }
            } else {
                System.out.println("No se pudo cargar el fichero.");
            }

        } else {
            System.out.println("Operación no válida. Usa 'init' o 'show'.");
        }
    }
}
