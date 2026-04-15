package org.example;

public class AsignaturaEj4 {
    String nombreAsignatura;
    EstudianteEj4[] alumnos; // Aquí conectamos con la otra clase
    public AsignaturaEj4(String nombreAsignatura, EstudianteEj4[] alumnos) {
        this.nombreAsignatura = nombreAsignatura;
        this.alumnos = alumnos;
    }
}
