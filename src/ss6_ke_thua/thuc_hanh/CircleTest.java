package ss6_ke_thua.thuc_hanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getPerimeter());
        Circle circle1 =new Circle(3);
        System.out.println(circle1);
        Circle circle2 = new Circle("red",false,3.5);
        System.out.println(circle2);
    }

}
