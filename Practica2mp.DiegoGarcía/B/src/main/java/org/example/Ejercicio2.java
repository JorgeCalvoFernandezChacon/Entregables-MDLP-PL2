package org.example;
import com.google.gson.Gson;

public class Ejercicio2 {
    // Clase que usaremos como "objeto interno"
    static class Direccion {
        String calle;
        String ciudad;
        public Direccion(String calle, String ciudad) {
            this.calle = calle;
            this.ciudad = ciudad;
        }
    }
    // Clase principal que contiene el otro objeto
    static class Cliente {
        String nombre;
        Direccion direccion; // Aquí está el objeto dentro de otro objeto
        public Cliente(String nombre, Direccion direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }
    }
    public static void main(String[] args) {
        // Creamos la dirección y el cliente
        Direccion miDireccion = new Direccion("Calle Mayor 10", "Madrid");
        Cliente miCliente = new Cliente("Ana", miDireccion);

        // Transformamos a JSON
        Gson gson = new Gson();
        System.out.println("--- Resultado del Ejercicio 2 ---");
        System.out.println(gson.toJson(miCliente));
    }
}
// Lo que ocurre es que la librería Gson detecta automáticamente que hay un objeto dentro de otro
// y lo maneja sin dar errores. En la cadena JSON resultante, el objeto interno se transforma en
// un nuevo bloque delimitado por llaves {}.
