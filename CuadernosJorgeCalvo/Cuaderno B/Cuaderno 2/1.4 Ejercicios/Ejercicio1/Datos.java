package Ejercicio1;
import java.util.ArrayList;

public class Datos {
    private ArrayList<Dog4> perros;
    private ArrayList<Cat4> gatos;
    private ArrayList<Employee1> empleados;
    private ArrayList<MyPoint2> puntos;
    private ArrayList<Ball1> pelotas;
    private ArrayList<Author2> autores;
    private ArrayList<Person3> personas;
    private ArrayList<Animal3> animales3;

    public Datos() {
        perros = new ArrayList<>();
        gatos = new ArrayList<>();
        empleados = new ArrayList<>();
        puntos = new ArrayList<>();
        pelotas = new ArrayList<>();
        autores = new ArrayList<>();
        personas = new ArrayList<>();
        animales3 = new ArrayList<>();
    }

    // Animales
    public ArrayList<Dog4> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Dog4> perros) {
        this.perros = perros;
    }
    public ArrayList<Cat4> getGatos() {
        return gatos;
    }

    public void setGatos(ArrayList<Cat4> gatos) {
        this.gatos = gatos;
    }

    // Empleados
    public ArrayList<Employee1> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Employee1> empleados) {
        this.empleados = empleados;
    }

    // Puntos
    public ArrayList<MyPoint2> getPuntos() {
        return puntos;
    }

    public void setPuntos(ArrayList<MyPoint2> puntos) {
        this.puntos = puntos;
    }

    // Pelotas
    public ArrayList<Ball1> getPelotas() {
        return pelotas;
    }

    public void setPelotas(ArrayList<Ball1> pelotas) {
        this.pelotas = pelotas;
    }

    // Autores
    public ArrayList<Author2> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Author2> autores) {
        this.autores = autores;
    }

    // Personas
    public ArrayList<Person3> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Person3> personas) {
        this.personas = personas;
    }

    // Animales
    public ArrayList<Animal3> getAnimales3() {
        return animales3;
    }

    public void setAnimales3(ArrayList<Animal3> animales3) {
        this.animales3 = animales3;
    }
}

