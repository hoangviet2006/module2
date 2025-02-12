package ss20_case_study.controller;

import ss20_case_study.model.Employee;
import ss20_case_study.service.impl.EmployeeService;
import ss20_case_study.view.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public Scanner scanner = new Scanner(System.in);
    public EmployeeService employeeService = new EmployeeService();
    public void displayEmployee() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý nhân viên" +
                    "\n 1. Hiển thị nhân viên" +
                    "\n 2. Thêm nhân viên" +
                    "\n 3. Chỉnh sửa nhân viên" +
                    "\n 4. Quay lại menu chính");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    List<Employee> employees = employeeService.getEmployee();
                    for (int i = 0; i < employees.size(); i++) {
                        System.out.println(employees.get(i));
                    }
                    break;
                case 2:
                    employeeService.addEmployee(EmployeeView.inputEmployee());
                    break;
                case 3:
                    String name=EmployeeView.inputName();
                    List<Employee> employeeList = employeeService.getEmployee();
                    boolean checkName = false;
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (employeeList.get(i).getFullName().equals(name)){
                            checkName=true;
                            boolean check = employeeService.editEmployee(name, EmployeeView.inputEmployee());
                            if (check) {
                                System.out.println("Chỉnh sửa thành công");
                                employeeService.getEmployee();
                            }
                        }
                    }
                    if (!checkName){
                        System.out.println("Không tìm thấy tên nhân viên");
                    }


                    break;
                case 4:
                    flag=false;
            }
        }
    }
}
