package ss12_map_set.thuc_hanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainTestStudent {
    public static void main(String[] args) {
        Student student = new Student("Việt1",18,"Huế");
        Student student1 = new Student("Việt2",18,"Đà Nẵng");
        Map<Integer,Student> map = new HashMap<>();
        map.put(1,student);
        map.put(2,student1);
        for (Map.Entry<Integer,Student> studentEntry: map.entrySet()){
            System.out.println(studentEntry.toString());
        }
        System.out.println("------Set-----");
        Set<Student> students = new HashSet<>();
        students.add(student);
        students.add(student1);
        students.add(student);
        for (Student student2: students){
            System.out.println(student2);
        }
    }

}
