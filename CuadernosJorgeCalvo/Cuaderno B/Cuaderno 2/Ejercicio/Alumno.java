public class Alumno {
    private String nombre;
    private int edad;

    public Alumno(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void setNombre(String newNombre){
        nombre = newNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int newEdad){
        edad = newEdad;
    }
    public int getEdad(){
        return edad;
    }
    public String toString(){
        return "Nombre: "+nombre+", edad: "+ edad+".";
    }
}
