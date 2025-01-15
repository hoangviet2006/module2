package ss4_oop.bai_tap;

public class FanTest {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeedMedium();
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(false);
        System.out.println(fan);
    }
}
