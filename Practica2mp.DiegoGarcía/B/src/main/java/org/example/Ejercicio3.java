package org.example;
import com.google.gson.Gson;

public class Ejercicio3 {
    // Clase que contiene un array en su interior
    static class Curso {
        String titulo;
        String[] temas; // Aquí está el array dentro del objeto
        public Curso(String titulo, String[] temas) {
            this.titulo = titulo;
            this.temas = temas;
        }
    }
    public static void main(String[] args) {
        Gson gson = new Gson();
        System.out.println("--- Resultado del Ejercicio 3 ---");
        // PRUEBA A: ¿Qué sucede cuando quiero guardar un array simple?
        String[] colores = {"Rojo", "Verde", "Azul"};
        String jsonArray = gson.toJson(colores);
        System.out.println("Array simple: " + jsonArray);
        // PRUEBA B: ¿Qué sucede si el array está dentro de un objeto?
        String[] temario = {"Variables", "Bucles", "Funciones"};
        Curso miCurso = new Curso("Aprende Java", temario);
        String jsonObjetoConArray = gson.toJson(miCurso);
        System.out.println("Objeto con array: " + jsonObjetoConArray);
    }
}
//Al guardar un array simple: Gson lo traduce utilizando la sintaxis estándar de listas de JSON,
// que consiste en encerrar los elementos entre corchetes [] y separarlos por comas.

//Al guardar un array dentro de un objeto: Gson pone el nombre de la variable como clave
// (en este caso "temas") y como valor coloca exactamente la misma estructura de corchetes [].
