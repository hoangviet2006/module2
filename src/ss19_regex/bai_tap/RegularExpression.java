package ss19_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String STUDENT_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public RegularExpression() {
        pattern = Pattern.compile(STUDENT_REGEX);
    }

    public boolean checkValidate(String string) {
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
