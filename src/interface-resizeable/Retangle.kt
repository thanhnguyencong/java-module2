package `interface-resizeable`

public class Rectangle implements Resizeable {
    double height;
    double weight;
    Rectangle( double height,double weight){
        this.weight=weight;
        this.height=height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }
    public double getArea(){
        return this.weight*this.height;
    }
    @Override
    public void Resize() {
        int ratio = (int) Math.floor(Math.random() * 100);
        this.weight*=ratio;
        this.height*=ratio;
        System.out.println("rectangle's area="+this.getArea());
    }
}