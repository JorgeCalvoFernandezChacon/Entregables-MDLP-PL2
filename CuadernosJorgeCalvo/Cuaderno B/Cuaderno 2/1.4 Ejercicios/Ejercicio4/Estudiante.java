package Ejercicio4;

public class Estudiante {
    private String nombre;
    public String apellido;

    public Estudiante(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void setNombre(String newNombre){
        nombre = newNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String newApellido){
        apellido = newApellido;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNombreCompleto(){
        return nombre+" "+apellido;
    }
}
