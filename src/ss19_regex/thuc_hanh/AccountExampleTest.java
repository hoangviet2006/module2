package ss19_regex.thuc_hanh;

public class AccountExampleTest {
    public static AccountExample accountExample;
    public static final String[] s = new String[]{"123abc_", " _abc123", "______", "123456", "abcdefgh"};
    public static final String[] s1 = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String string : s) {
            boolean check = accountExample.validate(string);
            System.out.println("account " + string + check);
        }
        for (String string : s1) {
            boolean check = accountExample.validate(string);
            System.out.println("account "+string+ check);
        }
    }
}
