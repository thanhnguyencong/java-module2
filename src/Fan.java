public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    int speed = slow;
    private boolean on;
    private double radius = 5;
    private String color = "blue";
    public static void main(String[] args) {
        Fan fan1 =  new Fan();
        fan1.setSpeed(fan1.getFast());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMedium());
        fan2.setOn(true);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
    public byte getFast() {
        return fast;
    }
    public byte getMedium() {
        return medium;
    }
    public byte getSlow() {
        return slow;
    }
    public double getRadius() {
        return radius;
    }
    public int getSpeed() {
        return speed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public Fan() {
    }
    public String toString() {
        if (on) {
            return "Speed: " + speed + ", color: " + color + ", radius: " + radius + " fan is on ";
        } else {
            return " fan is off ";
        }
    }
}
