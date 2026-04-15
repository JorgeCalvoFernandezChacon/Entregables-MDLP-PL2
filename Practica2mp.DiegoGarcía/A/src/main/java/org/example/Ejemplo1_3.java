package org.example;

class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class Ejemplo1_3 {
    public static void ejecutar() {
        try {
            mostrarPantallaRegistro();
        } catch (EdadInvalidaException ex) {
            System.out.println("Ejemplo 1.3 - Registro cancelado: " + ex.getMessage());
        }
    }

    public static void mostrarPantallaRegistro() throws EdadInvalidaException {
        solicitarDatosUsuario();
    }

    public static void solicitarDatosUsuario() throws EdadInvalidaException {
        // Simulamos que el usuario introdujo 15 años
        verificarMayoriaEdad(15);
    }

    public static void verificarMayoriaEdad(int edad) throws EdadInvalidaException {
        if (edad < 18) {
            // Aquí nace la excepción y sube por la pila
            throw new EdadInvalidaException("El usuario debe tener al menos 18 años.");
        }
    }
}
