package student.controller;

import student.service.impl.StudentService;
import student.model.Student;
import student.view.StudentView;

import java.util.Scanner;

public class StudentController {
    private static final int SHOW = 1;
    private static final int ADD = 2;
    private static final int DELETE = 3;
    private static final int SEARCH = 4;
    private static final int EDIT = 5;
    private static final int BACK = 6;
    private Scanner scanner = new Scanner(System.in);
    private StudentService studentService = new StudentService();


    public void displayMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("--------Quản lý học viên-----------" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm" +
                    "\n 3. Xóa" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Sửa" +
                    "\n 6. Quay lại menu chính");
            System.out.println("-------chọn chức năng--------");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case SHOW:
                    Student[] students = studentService.getAll();
                    StudentView.display(students);
                    break;
                case ADD:
                    Student students1 = StudentView.inputDataForStudent();
                    studentService.add(students1);
                    break;
                case DELETE:
                    int deleteId = StudentView.inputId();
                    boolean idDelete = studentService.delete(deleteId);
                    if (idDelete) {
                        System.out.println("xóa thành công");
                    } else {
                        System.out.println("không tìm thấy id");
                    }
                    break;
                case SEARCH:
                    String nameSearch = StudentView.inputName();
                    Student[] searchList = studentService.search(nameSearch);
                    StudentView.display(searchList);
                    break;
                case EDIT:
                    System.out.println("nhập id học viên");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên học viên");
                    String name = scanner.nextLine();
                    Student student = new Student(id, name);
                    boolean check = studentService.editStudent(id, student);
                    if (check) {
                        System.out.println("---chỉnh sửa thành công-----");
                    } else {
                        System.out.println("----không tìm thấy id-----");
                    }
                    break;
                case BACK:
                    flag = false;

            }
        }

    }

}
