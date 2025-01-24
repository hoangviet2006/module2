package bai_lam_them.view;

import bai_lam_them.controller.MotorbikeController;
import bai_lam_them.controller.OtoController;
import bai_lam_them.controller.TrunkController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MotorbikeController motorbikeController = new MotorbikeController();
        OtoController otoController = new OtoController();
        TrunkController trunkController = new TrunkController();

        while (true) {
            System.out.println("--------Chọn Chức Năng-----------" +
                    "\n 1. Quản Lý Motorbike" +
                    "\n 2. Quản Lý Oto" +
                    "\n 3. Quản Lý Trunk" +
                    "\n 4. Thoát");
            System.out.println("-------Chọn Chức Năng--------");
            int count;
            while (true) {
                try {
                    count = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng chọn lại chức năng");
                } catch (Exception e) {
                    System.out.println("lỗi khác");
                }
            }
            if (count < 0 || count > 4){
                System.out.println("vui lòng chọn lại chức năng");
            }else {
                switch (count) {
                    case 1:
                        motorbikeController.DisplayMotorbike();
                        break;
                    case 2:
                        otoController.DisplayOto();
                        break;
                    case 3:
                        trunkController.DisplayMotorbike();
                    case 4:
                        System.exit(0);
                }
            }


        }
    }
}

