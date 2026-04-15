package Ejercicio1;
public class Ball1 {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball1(float x, float y, int radius, float xDelta, float yDelta){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }
    public float getX() {
        return x;
    }
    public void setX(float newX) {
        x = newX;
    }
    public float getY(){
        return y;
    }
    public void setY(float newY){
        y = newY;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int newRadius){
        radius = newRadius;
    }
    public float getXDelta(){
        return xDelta;
    }
    public void setXDelta(float newXDelta){
        xDelta = newXDelta;
    }
    public float getYDelta(){
        return yDelta;
    }
    public void setYDelta(float newYDelta){
        yDelta = newYDelta;
    }
    public void move(){
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal(){
        xDelta = -xDelta;
    }
    public void reflectVertical(){
        yDelta = -yDelta;
    }
    public String toString(){
        return "Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+")]";
    }
}