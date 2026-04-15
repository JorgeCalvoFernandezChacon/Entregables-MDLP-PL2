package Ejercicio1;

public abstract class Animal4 {
    protected String name;

    public Animal4(String name){
        this.name = name;
    }
    public String getNombre(){
        return name;
    }

    public abstract void greets();
}

