package inheritance.point;

public class Point{
    float x = 0.0f;
    float y = 0.0f;
    public Point (float x, float y){
        this.x = x;
        this.y = y;
    }
    Point(){
    }
    public double getSize(){
        return Math.sqrt(x*x + y*y);
    }

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
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(float[] arr){
        arr= new float[]{this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

