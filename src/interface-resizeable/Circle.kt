package `interface-resizeable`

    public class Circle implements Resizeable {
        private double radius;
        private final double PI = 3.14;

        Circle(double radius) {
            this.radius = radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return this.radius;
        }

        public double getArea() {
            return Math.pow(this.radius, 2) * PI;
        }

        @Override
        public void Resize() {
            int ratio = (int) Math.floor(Math.random() * 100);
            this.radius *= ratio;
            System.out.println("circle's area="+this.getArea());
        }
    }