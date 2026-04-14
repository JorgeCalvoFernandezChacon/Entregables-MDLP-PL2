package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c4.animal;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
