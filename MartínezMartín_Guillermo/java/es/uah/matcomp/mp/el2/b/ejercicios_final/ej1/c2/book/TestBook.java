package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c2.book;
import es.uah.matcomp.mp.el2.b.ejercicios_final.GsonUtil;

public class TestBook {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Faltan parámetros.");
            System.out.println("Uso: <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String nombreFichero = args[1];

        // Ruta del nuevo paquete c2.book
        String carpetaPaquete = "src/main/java/es/uah/matcomp/mp/el2/a/ejercicios_final/ej1/c2/book/";
        String rutaCompleta = carpetaPaquete + nombreFichero;

        if (operacion.equalsIgnoreCase("init")) {
            // 1. Creamos primero el autor
            Author autor = new Author("Guillermo", "guillermo@uah.es", 'm');

            // 2. Creamos el libro pasando el autor por el constructor (Composición)
            Book miLibro = new Book("Libro de ejemplo", autor, 4.99, 1);

            // 3. Guardamos el libro completo
            GsonUtil.guardar(rutaCompleta, miLibro);
            System.out.println("Fichero del libro creado en: " + rutaCompleta);

        } else if (operacion.equalsIgnoreCase("show")) {
            // Cargamos el libro (Gson reconstruirá el Autor dentro automáticamente)
            Book cargado = GsonUtil.cargar(rutaCompleta, Book.class);

            if (cargado != null) {
                System.out.println("--- Datos del Libro ---");
                System.out.println("Título: " + cargado.getName());
                System.out.println("Precio: " + cargado.getPrice() + "€");
                System.out.println("Stock: " + cargado.getQty());

                // Accedemos a los datos del objeto interno Author
                Author a = cargado.getAuthor();
                System.out.println("--- Datos del Autor ---");
                System.out.println("Nombre: " + a.getName());
                System.out.println("Email: " + a.getEmail());
                System.out.println("Género: " + a.getGender());
            } else {
                System.out.println("Error: No se encontró el archivo del libro.");
            }
        } else {
            System.out.println("Operación no reconocida.");
        }
    }
}
