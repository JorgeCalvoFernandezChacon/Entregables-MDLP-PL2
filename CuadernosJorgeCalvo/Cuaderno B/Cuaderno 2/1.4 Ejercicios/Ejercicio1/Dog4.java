package Ejercicio1;

public class Dog4 extends Animal4{
    public Dog4 (String name){
        super(name);
    }
    public String getNombre(){
        return name;
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog4 another){
        System.out.println("Woooof");
    }
}