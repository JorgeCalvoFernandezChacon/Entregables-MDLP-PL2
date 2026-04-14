package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c3.point;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        super();
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] result = new float[3]; // construct an array of 2 elements
        result[0] = getX();
        result[1] = getY();
        result[2] = z;
        return result; // return the array
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
