public class Ejemplo1_6 {

    public static void ejecutar() {
        System.out.println("--- Ejecutando Ejemplo 1.4/1.6: Jerarquía y Finally ---");

        try {
            int[] lista = new int[3];
            System.out.println("Accediendo al índice 5...");
            System.out.println(lista[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción no verificada capturada: " + e.toString());
        } catch (Exception e) {
            System.out.println("Excepción general capturada: " + e.getMessage());
        } finally {
            System.out.println("Este bloque finally se ejecuta siempre.");
        }

        System.out.println("Flujo post-excepción continuado.");
    }
}