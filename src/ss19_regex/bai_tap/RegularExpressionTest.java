package ss19_regex.bai_tap;

public class RegularExpressionTest {
    private static RegularExpression regularExpression;
    public static String[] strings = new String[]{"C0223G", "A0323K"};
    public static String[] strings1 = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        regularExpression = new RegularExpression();
        for (String string:strings){
            boolean check = regularExpression.checkValidate(string);
            System.out.println("Tên "+ string+" check: "+check);
        }
        for (String string:strings1){
            boolean check  =regularExpression.checkValidate(string);
            System.out.println("tên "+string +" check: "+check);
        }
    }
}
