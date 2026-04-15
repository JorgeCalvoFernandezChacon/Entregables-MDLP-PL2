package Ejercicio1;

public class Cat4 extends Animal4{
    public Cat4(String name){
        super(name);
    }
    public String getNombre(){
        return name;
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}