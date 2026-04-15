package org.example;

public class CircleC4 {
    protected double radius;
    public CircleC4(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}