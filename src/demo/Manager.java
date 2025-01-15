package demo;

public class Manager {
    private static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "Việt1");
        students[1] = new Student(2, "Việt2");
        students[2] = new Student(3, "Việt3");
    }

    public Student[] getAll() {
        return students;
    }

    public void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public boolean delete(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && id == students[i].getId()) {
                students[i] = null;
                return true;
            }else {
                System.out.println("Không thấy sinh viên");
            }
        }
        return false;
    }

    public boolean search(int id ) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && id == students[i].getId()) {
                System.out.println("ID bạn vừa tìm: "+students[i]);
                return true;
            }else {
                System.out.println("Không thấy sinh viên");
            }
        }
        return false;
    }


}
