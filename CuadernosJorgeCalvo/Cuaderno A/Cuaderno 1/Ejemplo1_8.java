public class Ejemplo1_8 {

    public static void ejecutar() {
        System.out.println("--- Ejecutando Ejemplo 1.8: Mi propia Excepción ---");
        try {
            comprobarNumero(9);
            comprobarNumero(8);
        } catch (MyException ex) {
            ex.printStackTrace();
        }
    }

    public static void comprobarNumero(int numero) throws MyException {
        if (numero == 8) {
            throw new MyException("Has acertado el numero magico");
        }
        System.out.println("El numero " + numero + " no es magico.");
    }
}
