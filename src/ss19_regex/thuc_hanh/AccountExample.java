package ss19_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public AccountExample() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }

    public boolean validate(String string) {
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
