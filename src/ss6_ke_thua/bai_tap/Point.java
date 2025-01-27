package ss6_ke_thua.bai_tap;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;
    private float[] arr = new float[2];

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getArr(){
        return new float[] {x,y};
    }

    @Override
    public String
    toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
