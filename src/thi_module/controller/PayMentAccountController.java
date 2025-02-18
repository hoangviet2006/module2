package thi_module.controller;

import demoQLSP.view.PantsView;
import thi_module.model.PaymentAccount;
import thi_module.model.SavingsAccount;
import thi_module.service.PaymentAccountService;
import thi_module.service.SavingsAccountService;
import thi_module.view.PaymentAccountView;
import thi_module.view.SavingAccountView;

import java.util.List;
import java.util.Scanner;

public class PayMentAccountController {
    Scanner scanner = new Scanner(System.in);
    PaymentAccountService paymentAccountService = new PaymentAccountService();
    public void displayPayment(){
        boolean flag = true;
        while (flag){
            System.out.println("Quản lý tài khoản tiêu dùng" +
                    "\n 1. Thêm Mới" +
                    "\n 2. Xóa" +
                    "\n 3. Xem danh sách các tài khoản" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Quay lại menu chính");
            System.out.println("Chọn chức năng");
            int choose;
            while (true) {
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Lỗi không phải là số,Nhập lại");
                }
            }
            switch (choose){
                case 1:
                    paymentAccountService.addPayment(PaymentAccountView.inputPayment());
                    paymentAccountService.getPayment();
                    break;
                case 2:
                    boolean checkDelete = paymentAccountService.deletePayment(PantsView.inputName());
                    if (checkDelete){
                        System.out.println("Xóa thành công");
                    }else {
                        System.out.println("Không tìm thấy tên cần xóa");
                    }
                    break;
                case 3:
                    List<PaymentAccount> list = paymentAccountService.getPayment();
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 4:
                    List<PaymentAccount> paymentAccountList= paymentAccountService.searchPayment(SavingAccountView.inputName());
                    for (int i = 0; i < paymentAccountList.size(); i++) {
                        System.out.println(paymentAccountList.get(i));
                    }
                    break;
                case 5:
                    flag=false;
            }
        }
    }
}
