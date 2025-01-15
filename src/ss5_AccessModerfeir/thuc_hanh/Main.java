package ss5_AccessModerfeir.thuc_hanh;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(11, "Hoàng");
        Student s2 = new Student(22, "Việt");
        s1.display();
        s2.display();
    }
}
