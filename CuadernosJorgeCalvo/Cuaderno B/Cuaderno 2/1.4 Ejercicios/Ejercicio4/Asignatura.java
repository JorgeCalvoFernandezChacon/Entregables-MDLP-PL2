package Ejercicio4;

public class Asignatura {
    public String NombreAsignatura;

    // Creamos una nueva lista para agregar los estudiantes.
    java.util.List<Estudiante> estudiantes = new java.util.ArrayList<>();

    public Asignatura(String nombreAsignatura) {
        this.NombreAsignatura = nombreAsignatura;
    }

    public void agregarEstudiante(Estudiante e) {
        this.estudiantes.add(e);
    }
}
