package ss5_AccessModerfeir.bai_tap;

public class Student {
    private String name = "John";
    private String classes = "C02";
    

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    public static void main(String[] args) {
        System.out.println("tên ban đầu: " + new Student().name);
        System.out.println("Lớp ban đầu: " + new Student().classes);
        Student student = new Student();
        student.setName("Hoàng");
        student.setClasses("C11");
        System.out.println("Tên mới là: "+student.getName());
        System.out.println("Lớp mới là: "+student.getClasses());

    }


}

