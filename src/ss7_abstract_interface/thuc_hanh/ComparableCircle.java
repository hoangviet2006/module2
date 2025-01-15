package ss7_abstract_interface.thuc_hanh;

import ss6_ke_thua.thuc_hanh.Circle;

public class ComparableCircle extends Circle  {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

}
