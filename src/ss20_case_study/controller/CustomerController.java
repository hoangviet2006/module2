package ss20_case_study.controller;

import ss20_case_study.model.Customer;
import ss20_case_study.service.impl.CustomerService;
import ss20_case_study.view.CustomerView;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerController {
    public Scanner scanner = new Scanner(System.in);
    public CustomerService customerService = new CustomerService();

    public void displayCustomer() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý khách hàng" +
                    "\n 1. Hiển thị khách hàng" +
                    "\n 2. Thêm khách hàng" +
                    "\n 3. Chỉnh sửa khách hàng" +
                    "\n 4. quay lại menu chính");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    List<Customer> customers = customerService.getCustomer();
                    for (int i = 0; i < customers.size(); i++) {
                        System.out.println(customers.get(i));
                    }
                    break;
                case 2:
                    customerService.addCustomer(CustomerView.inputCustomer());
                    break;
                case 3:
                    String name = CustomerView.inputName();
                    List<Customer> customerList = customerService.getCustomer();
                    boolean checkName = false;
                    for (int i = 0; i < customerList.size(); i++) {
                        if (customerList.get(i).getFullName().equals(name)) {
                            checkName = true;
                            boolean check = customerService.editCustomer(name, CustomerView.inputCustomer());
                            if (check) {
                                System.out.println("Chỉnh sửa thành công");
                                customerService.getCustomer();
                            }
                        }
                    }
                    if (!checkName){
                        System.out.println("không tìm thấy tên");
                    }
                    break;
                case 4:
                    flag = false;
            }
        }
    }
}
