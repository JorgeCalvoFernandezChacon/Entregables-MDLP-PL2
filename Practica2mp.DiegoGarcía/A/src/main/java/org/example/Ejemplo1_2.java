package org.example;

public class Ejemplo1_2 {
    public static void ejecutar() {
        System.out.println("Enter ejecutar() [Simula el main del ejemplo]");
        methodA();
        System.out.println("Exit ejecutar()");
    }
    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }
    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }
    public static void methodC() {
        System.out.println("Enter methodC()");
        System.out.println(1 / 0);
        System.out.println("Exit methodC()");
    }
}
