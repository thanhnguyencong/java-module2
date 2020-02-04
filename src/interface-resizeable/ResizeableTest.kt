package `interface-resizeable`
public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle=new Circle(1.0);
        Square square=new Square(1);
        Rectangle rectangle=new Rectangle(1,2);
        System.out.println("circle's area="+circle.getArea());
        System.out.println("square's area="+square.getArea());
        System.out.println("rectangle's area ="+rectangle.getArea());
        System.out.println("after change:");
        circle.Resize();
        square.Resize();
        rectangle.Resize();

    }
}