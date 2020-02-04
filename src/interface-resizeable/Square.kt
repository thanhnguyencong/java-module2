package `interface-resizeable`

public class Square implements Resizeable {
    double size;
    Square(double size) {
        this.size=size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return this.size;
    }
    public double getArea(){
        return Math.pow(this.size,2);
    }

    @Override
    public void Resize() {
        int ratio = (int) Math.floor(Math.random() * 100);
        this.size*=ratio;
        System.out.println("square's area="+this.getArea());
    }
}