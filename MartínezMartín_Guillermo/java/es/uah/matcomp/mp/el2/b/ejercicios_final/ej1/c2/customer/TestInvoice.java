package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c2.customer;
import es.uah.matcomp.mp.el2.b.ejercicios_final.GsonUtil;

public class TestInvoice {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Faltan parámetros.");
            System.out.println("Uso: <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String nombreFichero = args[1];

        // Ruta del paquete customer
        String carpetaPaquete = "src/main/java/es/uah/matcomp/mp/el2/a/ejercicios_final/ej1/c2/customer/";
        String rutaCompleta = carpetaPaquete + nombreFichero;

        if (operacion.equalsIgnoreCase("init")) {
            // 1. Creamos primero el cliente (Customer)
            Customer cliente = new Customer(102, "Jorge Calvo", 0);
            // 2. Creamos la factura asociada a ese cliente (Composición)
            Invoice factura = new Invoice(500, cliente, 1000.0);

            // 3. Guardamos la factura
            GsonUtil.guardar(rutaCompleta, factura);
            System.out.println("Fichero de factura creado en: " + rutaCompleta);

        } else if (operacion.equalsIgnoreCase("show")) {
            // Cargamos la factura
            Invoice cargada = GsonUtil.cargar(rutaCompleta, Invoice.class);

            if (cargada != null) {
                System.out.println("--- Datos de la Factura ---");
                System.out.println("ID Factura: " + cargada.getId());
                System.out.println("Importe Bruto: " + cargada.getAmount() + "€");

                // Acceso a datos del cliente a través de la factura
                System.out.println("Cliente: " + cargada.getCustomerName());
                System.out.println("Descuento aplicado: " + cargada.getCustomerDiscount() + "%");

                // Probamos tu método de cálculo de descuento
                System.out.println("Total con descuento: " + cargada.getAmountAfterDiscount() + "€");
            } else {
                System.out.println("Error: No se encontró el archivo de la factura.");
            }
        } else {
            System.out.println("Operación no reconocida.");
        }
    }
}
