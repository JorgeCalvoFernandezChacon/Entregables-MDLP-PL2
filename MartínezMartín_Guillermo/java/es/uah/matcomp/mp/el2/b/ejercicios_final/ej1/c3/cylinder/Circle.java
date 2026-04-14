package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c3.cylinder;

public class Circle {
    /*
    Definimos la(s) variable(s)
     */
    private double radius = 1.0;
    private String color = "red";

    /*
    Creamos el por defecto
     */
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}