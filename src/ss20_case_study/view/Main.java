package ss20_case_study.view;

import ss20_case_study.controller.*;
import ss20_case_study.service.impl.BookingService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HouseController houseController = new HouseController();
        VillaController villaController = new VillaController();
        RoomController roomController = new RoomController();
        CustomerController customerController = new CustomerController();
        EmployeeController employeeController = new EmployeeController();
        BookingController bookingController = new BookingController();
        BookingService bookingService = new BookingService();
        while (true){
            System.out.println("Quản Lý Facility" +
                    "\n 1. Quản lý house" +
                    "\n 2. Quản lý villa" +
                    "\n 3. Quản lý room" +
                    "\n 4. Quản lý khách hàng" +
                    "\n 5. Quản lý nhân viên" +
                    "\n 6. Booking - Hợp Đồng" +
                    "\n 7. Làm Hợp Đồng" +
                    "\n 8. Thoát");
            System.out.println("Chọn chức năng");
            int choose;
            while (true){
                try {
                    choose=Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException numberFormatException){
                    System.out.println("Lỗi không phải số! vui lòng nhập lại");
                }
            }
            if (choose>7|| choose<1){
                System.out.println("Chọn lại chức năng");
            }
            switch (choose){
                case 1:
                    houseController.displayHouse();
                    break;
                case 2:
                    villaController.displayVilla();
                    break;
                case 3:
                    roomController.displayRoom();
                    break;
                case 4:
                    customerController.displayCustomer();
                    break;
                case 5:
                    employeeController.displayEmployee();
                    break;
                case 6:
                    bookingController.displayBooking();
                    break;
                case 7:
                    bookingService.createContract();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
