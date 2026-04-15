package Ejercicio1;

public class MyPoint2 {
    private int x= 0;
    private int y = 0;

    public MyPoint2(){}
    public MyPoint2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int newX){
        x = newX;
    }
    public int getY(){
        return y;
    }
    public void setY(int newY){
        y = newY;
    }
    public int[] getXY(){
        return new int[]{x,y};
    }
    public void setXY(int newX, int newY){
        x = newX;
        y = newY;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public double distance(int x, int y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
    public double distance(MyPoint2 another){
        return Math.sqrt((this.x-another.x)*(this.x-another.x)+(this.y-another.y)*(this.y-another.y));
    }
    public double distance(){
        return Math.sqrt((this.x)*(this.x)+(this.y)*(this.y));
    }
}
