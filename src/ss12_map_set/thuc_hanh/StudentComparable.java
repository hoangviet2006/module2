package ss12_map_set.thuc_hanh;

public class StudentComparable implements Comparable<StudentComparable>{
    private String name;
    private int age;

    public StudentComparable() {
    }

    public StudentComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentComparable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(StudentComparable o) {
        return 0;
    }
}
