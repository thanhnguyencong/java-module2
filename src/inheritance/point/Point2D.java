package inheritance.point;

public class Point2D {
    protected float x=0.0f;
    protected float y=0.0f;
    Point2D(){

    }
    protected void setX( float x) {
        this.x=x;
    }
    protected void setY( float y) {
        this.y=y;
    }
    protected float getX(){
        return this.x;
    }
    protected float getY(){
        return this.y;
    }
    protected void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    protected float[] getXY(float[] arr) {
        arr= new float[]{this.x, this.y};
        return arr;
    }
    public String toString(){
        System.out.println("x="+this.x+"y="+this.y);
        return null;
    }
}