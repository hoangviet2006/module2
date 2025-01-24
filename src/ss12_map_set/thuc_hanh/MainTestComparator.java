package ss12_map_set.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;
import java.util.List;

public class MainTestComparator {
    public static void main(String[] args) {
        StudentComparable student = new StudentComparable("Kien",30);
        StudentComparable student1 = new StudentComparable("Nam", 26);
        StudentComparable student2 = new StudentComparable("Anh", 38 );
        StudentComparable student3 = new StudentComparable("Tung", 38);

        List<StudentComparable> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (StudentComparable student4 : list){
            System.out.println(student4.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(StudentComparable st : list){
            System.out.println(st.toString());
        }
    }
}
