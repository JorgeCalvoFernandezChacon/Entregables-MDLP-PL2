package es.uah.matcomp.mp.el2.b.ejercicios_final.ej4;

public class Asignatura {
    String nombreAsignatura;
    // Aquí está la clave: un objeto que contiene una lista de otros objetos
    java.util.List<Estudiante> estudiantes = new java.util.ArrayList<>();

    public Asignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public void agregarEstudiante(Estudiante e) {
        this.estudiantes.add(e);
    }
}
