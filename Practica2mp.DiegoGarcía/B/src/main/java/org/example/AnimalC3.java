package org.example;

public class AnimalC3 {
    private String name;
    public AnimalC3(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "Animal[name=\"" + name + "\"]";
    }
}
