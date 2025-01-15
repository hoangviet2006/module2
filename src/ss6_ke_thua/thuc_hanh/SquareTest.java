package ss6_ke_thua.thuc_hanh;

public class SquareTest {
    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square);
        Square square1 = new Square(3);
        System.out.println(square1);
        Square square2 = new Square("red",true,6);
        System.out.println(square2);
    }
}
