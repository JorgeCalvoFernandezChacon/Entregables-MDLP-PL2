package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c1.account;
import es.uah.matcomp.mp.el2.b.ejercicios_final.GsonUtil;

public class TestAccount {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Faltan parámetros.");
            System.out.println("Uso: <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String nombreFichero = args[1];

        // Definimos la ruta del paquete para que se guarde allí mismo
        String carpetaPaquete = "src/main/java/es/uah/matcomp/mp/el2/a/ejercicios_final/ej1/c1/account/";
        String rutaCompleta = carpetaPaquete + nombreFichero;

        if (operacion.equalsIgnoreCase("init")) {
            // Creamos la cuenta con los datos de tu clase
            Account cuentaNueva = new Account("333-XYZ", "Diego García", 2000);

            // Guardamos usando la ruta completa
            GsonUtil.guardar(rutaCompleta, cuentaNueva);
            System.out.println("Fichero creado en: " + rutaCompleta);

        } else if (operacion.equalsIgnoreCase("show")) {
            // Cargamos desde la ruta completa
            Account cargada = GsonUtil.cargar(rutaCompleta, Account.class);

            if (cargada != null) {
                System.out.println("--- Datos de la Cuenta (desde JSON) ---");
                System.out.println("ID: " + cargada.getID());
                System.out.println("Nombre: " + cargada.getName());
                System.out.println("Saldo: " + cargada.getBalance() + "€");
            } else {
                System.out.println("Error: No se encontró el archivo en " + rutaCompleta);
            }
        } else {
            System.out.println("Operación no reconocida.");
        }
    }
}