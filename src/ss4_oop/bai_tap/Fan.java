package ss4_oop.bai_tap;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    private int speed = SLOW;



    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeedLow() {
        this.speed = SLOW;
    }
    public void setSpeedMedium() {
        this.speed = MEDIUM;
    }
    public void setSpeedFAST() {
        this.speed = FAST;
    }

    public String toString() {
        if (on) {
            return "speed: " + speed + " color: " + color + " radius: " + radius + " fan is on";
        } else {
            return "color: " + color + " radius: " + radius + " fan is of";
        }
    }
}
