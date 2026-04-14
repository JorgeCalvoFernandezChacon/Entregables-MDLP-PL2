package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c3.point;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {}


    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] result = new float[2]; // construct an array of 2 elements
        result[0] = x;
        result[1] = y;
        return result; // return the array
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
