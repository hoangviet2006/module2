package ss3_array.thuc_hanh;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah"};
        System.out.println("Nhập vào tên học viên");
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(studentName)){
                System.out.println("Học viên :  " +studentName+ " đứng vị trí : "+ i);
                check =true;
                break;
            }
        }
        if (!check){
            System.out.println("Học viên không có trong mảng");
        }
    }
}
