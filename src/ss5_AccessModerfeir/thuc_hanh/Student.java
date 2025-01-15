package ss5_AccessModerfeir.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String college;

    public Student(int i, String n) {
        rollno = i;
        name = n;
    }

    static void change(){
        college = "CodeGym";
    }
    void display(){
        System.out.println(rollno + " "+ name+ " "+ college);
    }
}
