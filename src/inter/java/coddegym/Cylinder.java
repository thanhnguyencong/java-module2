package inter.java.coddegym;

 class Cylinder extends Circle {
     double height = 5.0;

     Cylinder(double height) {
         this.height = height;
     }

     public Cylinder(double height, double radius, String color, boolean filled) {
         super(radius, color, filled);
         this.height = height;
     }

     public Cylinder(double radius, String color, boolean filled) {
         super(radius, color, filled);
     }

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }
     public double getArea() {
         return radius * radius * Math.PI * 2 + height * Math.PI;
     }

     public double getVolume() {
         return 2 * radius * Math.PI * height;
     }
     @Override
     public String toString() {
         return "A Cylinder with radius="
                 + getRadius()
                 + ", and height= "
                 + getHeight()
                 + super.toString();
     }
 }
