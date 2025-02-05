package ss19_regex.bai_tap;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;
    public static String PHONENUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public PhoneNumber() {
        pattern = Pattern.compile(PHONENUMBER_REGEX);
    }

    public boolean checkPhoneNumber(String phoneNumber) {
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
