package ss19_regex.bai_tap;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    private static String[] array = new String[]{"(84)-(0978489648)"};
    private static String[] array1 = new String[]{" (a8)-(22222222)","(84)-(22b22222)"," (84)-(9978489648)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String s: array){
            boolean checkPhoneNumber = phoneNumber.checkPhoneNumber(s);
            System.out.println("Số điện thoại: "+s+" check: "+checkPhoneNumber);
        }
        for (String s: array1){
            boolean checkPhoneNumber = phoneNumber.checkPhoneNumber(s);
            System.out.println("Số điện thoại: "+s+" check: "+checkPhoneNumber);
        }
    }
}
