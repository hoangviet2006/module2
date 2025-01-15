package ss6_ke_thua.bai_tap;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //bài 1
        Circle circle =new Circle(3,"red");
        System.out.println(circle);
        System.out.println(circle.getAcreage());
        Cylinder cylinder =new Cylinder(5,"yellow",9);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());

        // bài 2

        Point2D point2D =new Point2D(3,6);
        System.out.println(Arrays.toString(point2D.getXY()));
        Point3D point3D =new Point3D(3,6,9);
        System.out.println(point3D);

        // bài 3

        MoveablePoint moveablePoint =new MoveablePoint(3,4,5,6);
        System.out.println(moveablePoint.move());
    }
}
