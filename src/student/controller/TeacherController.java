package student.controller;

import student.model.Teacher1;
import student.service.impl.TeacherService;
import student.view.TeacherView;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();
    private static final int show = 1;
    private static final int add = 2;
    private static final int delete = 3;
    private static final int search =4;
    private static final int back = 5;
    public void displayMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("--------Quản lý giáo viên-----------" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm" +
                    "\n 3. Xóa" +
                    "\n 4.Tìm kiếm" +
                    "\n 5. Thoát");
            System.out.println("-------chọn chức năng--------");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case show:
                    Teacher1[] teachers = teacherService.getAll();
                    TeacherView.displayMenu(teachers);
                    break;
                case add:
                    Teacher1 teacher = TeacherView.inputDataForTeacher();
                    teacherService.addTeacher(teacher);
                    break;
                case delete:
                    int idDelete = TeacherView.idTeacher();
                    boolean check = teacherService.delete(idDelete);
                    if (check) {
                        System.out.println("----xóa thành công-----");
                    } else {
                        System.out.println("-----không tìm thấy id-------");
                    }
                    break;
                case search:
                    String searchTeacher = TeacherView.searchTeach();
                    Teacher1[] teacherList = teacherService.search(searchTeacher);
                    TeacherView.displayMenu(teacherList);
                    break;
                case back:
                    flag = false;
            }
        }

    }

}
