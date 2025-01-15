package demo;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Manager manager = new Manager();


    public void displayMenu() {
        while (true) {
            System.out.println("-----chọn chức năng------" +
                    "\n 1. Hiển thị danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xóa" +
                    "\n 4.Tìm kiem" +
                    "\n 5. Thoát");
            System.out.println("-----Chọn chức năng-------");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    Student[] students = manager.getAll();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 2:
                    System.out.println("----Nhập Id-----");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("----Nhập tên----");
                    String name = scanner.nextLine();
                    Student student = new Student(id, name);
                    manager.add(student);
                    break;
                case 3:
                    System.out.println("----nhập id muốn xóa---");
                    int index = Integer.parseInt(scanner.nextLine());
                    manager.delete(index);
                    break;
                case 4:
                    System.out.println("----nhập id muốn tìm---");
                    int Index = Integer.parseInt(scanner.nextLine());
                    manager.search(Index);
                    break;
                default:
                    System.exit(0);
            }

        }
    }
}
