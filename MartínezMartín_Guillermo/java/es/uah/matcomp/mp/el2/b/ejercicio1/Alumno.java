package es.uah.matcomp.mp.el2.b.ejercicio1;

public class Alumno {
    // Variables
    private String nombre;
    private String apellidos;
    private String dni;
    private int curso;

    // Constructor
    public Alumno(String nombre, String apellidos, String dni, int curso) {
        this.nombre =nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.curso = curso;
    }
    // Getters
    public String getApellidos() {
        return apellidos;
    }
    public int getCurso() {
        return curso;
    }
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    // Setters
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
