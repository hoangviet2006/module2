package student.controller;

import student.service.impl.StudentService;
import student.model.Student;
import student.view.StudentView;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private StudentService studentService = new StudentService();
    private static final int show = 1;
    private static final int add = 2;
    private static final int delete = 3;
    private static final int search =4;
    private static final int back = 5;


    public void displayMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("--------Quản lý học viên-----------" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm" +
                    "\n 3. Xóa" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Quay lại menu chính");
            System.out.println("-------chọn chức năng--------");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case show:
                    Student[] students = studentService.getAll();
                    StudentView.display(students);
                    break;
                case add:
                    Student students1 = StudentView.addStudent();
                    studentService.add(students1);
                    break;
                case delete:
                    int deleteId = StudentView.inputId();
                    boolean idDelete = studentService.delete(deleteId);
                    if (idDelete) {
                        System.out.println("xóa thành công");
                    } else {
                        System.out.println("không tìm thấy id");
                    }
                    break;
                case search:
                    String nameSearch = StudentView.inputName();
                    Student[] searchList = studentService.search(nameSearch);
                    StudentView.display(searchList);
                    break;
                case back:
                    flag = false;

            }
        }

    }

}
