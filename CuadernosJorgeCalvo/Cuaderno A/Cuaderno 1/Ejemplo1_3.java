import java.io.FileNotFoundException;

public class Ejemplo1_3 {

    public static void ejecutar() {
        System.out.println("--- Ejecutando Ejemplo 1.3: Propagación con throws ---");
        try {
            metodoA();
        } catch (FileNotFoundException e) {
            System.out.println("Excepción capturada en ejecutar(): " + e.getMessage());
        }
    }

    public static void metodoA() throws FileNotFoundException {
        metodoB();
    }

    public static void metodoB() throws FileNotFoundException {
        boolean error = true;
        if (error) {
            throw new FileNotFoundException("Error provocado en metodoB");
        }
    }
}
