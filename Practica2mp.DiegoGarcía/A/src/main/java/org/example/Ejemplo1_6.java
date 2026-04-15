package org.example;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

public class Ejemplo1_6 {
    public static void retirarDinero(double saldoActual, double cantidadRetiro) throws SaldoInsuficienteException {
        if (cantidadRetiro > saldoActual) {
            throw new SaldoInsuficienteException("Intentas sacar " + cantidadRetiro + "€ pero solo tienes " + saldoActual + "€.");
        }
        System.out.println("Retiro exitoso. Aquí tienes tus " + cantidadRetiro + "€");
    }
    public static void ejecutar() {
        try {
            retirarDinero(100.0, 20.0);  // Este funcionará
            retirarDinero(100.0, 500.0); // Este lanzará la excepción
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Ejemplo 1.8 - Operación denegada: " + ex.getMessage());
        }
    }
}
