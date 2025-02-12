package ss20_case_study.controller;

import ReadAndWriteFile.ReadAndWriteFile;
import ss20_case_study.model.*;
import ss20_case_study.service.*;
import ss20_case_study.service.impl.*;
import ss20_case_study.view.BookingView;

import java.util.*;

public class BookingController {
    public static Scanner scanner = new Scanner(System.in);
    private ICustomerService customerService = new CustomerService();
    private IVillaService villaService = new VillaService();
    private HouseService houseService = new HouseService();
    private RoomService roomService = new RoomService();
    private BookingService bookingService = new BookingService();
    private static final String FILE = "D:\\codegym\\module2\\src\\ss20_case_study\\data\\facility.csv";
    private static final String CONTRACT_FILE = "D:\\codegym\\module2\\src\\ss20_case_study\\data\\contract.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    public void displayBooking() {

        boolean flagg = true;
        while (flagg) {
            System.out.println("--------Booking------" +
                    "\n 1. Hiển Thị danh sách booking" +
                    "\n 2. Booking" +
                    "\n 3. Làm Hợp Đồng" +
                    "\n 4. Hiển Thị Hợp Đồng" +
                    "\n 5. Quay lại menu chính ");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Set<Booking> bookingSet = bookingService.getBooking();
                    for (Booking booking : bookingSet) {
                        System.out.println(booking);
                    }
                    break;
                case 2:
                    Booking booking = BookingView.inputBooking();
                    System.out.println("Danh sách khách hàng");
                    List<Customer> customers = customerService.getCustomer();
                    for (int i = 0; i < customers.size(); i++) {
                        System.out.println((i + 1) + customers.get(i).toString());
                    }
                    System.out.println("Chọn khách hàng");
                    int cusChoose = Integer.parseInt(scanner.nextLine());
                    Customer customer = customers.get(cusChoose - 1);
                    booking.setCustomerCode(customer.getCustomerCode());

                    System.out.println("Danh sách dịch vụ");
                    Map<Villa, Integer> villas = villaService.getMap();
                    Map<House, Integer> houseIntegerMap = houseService.getMap();
                    Map<Room, Integer> roomIntegerMap = roomService.getMap();

                    int index = 1;
                    for (Villa villa : villas.keySet()) {
                        System.out.println((index + ". Mã dịch vụ: " + villa.getCode() + "   tên dịch vụ: " + villa.getName() + "  Số lần thuê: " + villas.get(villa)));
                        index++;
                    }

                    for (House house : houseIntegerMap.keySet()) {
                        System.out.println((index + ". Mã dịch vụ: " + house.getCode() + "   tên dịch vụ: " + house.getName() + "  Số lần thuê: " + houseIntegerMap.get(house)));
                        index++;
                    }


                    for (Room room : roomIntegerMap.keySet()) {
                        System.out.println((index + ". Mã dịch vụ: " + room.getCode() + "  tên dịch vụ: " + room.getName() + "  số lần thuê: " + roomIntegerMap.get(room)));
                        index++;
                    }

                    String facilityCode = "";
                    boolean flag = true;
                    while (flag) {
                        System.out.println("Nhập mã dịch vụ cần chọn");
                        facilityCode = scanner.nextLine();
                        for (Villa villa : villas.keySet()) {
                            if (facilityCode.equals(villa.getCode())) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            for (House villa : houseIntegerMap.keySet()) {
                                if (facilityCode.equals(villa.getCode())) {
                                    flag = false;
                                    break;
                                }
                            }
                        }
                        if (flag) {
                            for (Room villa : roomIntegerMap.keySet()) {
                                if (facilityCode.equals(villa.getCode())) {
                                    flag = false;
                                    break;
                                }
                            }
                        }
                        if (flag) {
                            System.out.println("Mã dịch vụ không tồn tại");
                        }
                    }
                    booking.setCodeService(facilityCode);
                    Set<Booking> bookingSet1 = bookingService.getBooking();
                    boolean check = false;
                    for (Booking booking1 : bookingSet1) {
                        if (booking1.getCodeService().equals(booking.getCodeService()) && booking1.getCustomerCode().equals(booking.getCustomerCode())) {
                            check = true;
                            System.out.println("Booking không thành công");
                            break;
                        }
                    }
                    if (!check) {
                        bookingService.addBooking(booking);
                        System.out.println("Booking thành công");
                        List<String> list = ReadAndWriteFile.readFile(FILE);
                        String[] array;
                        int indexI;
                        for (int i = 0; i < list.size(); i++) {
                            array = list.get(i).split(",");
                            if (array[1].equals(facilityCode)) {
                                int value = Integer.parseInt(array[array.length - 1]);
                                indexI = i;
                                value++;
                                array[array.length - 1] = (value) + "";
                                list.set(indexI, String.join(",", array));
                                break;
                            }
                        }
                        ReadAndWriteFile.writeFile(FILE, list, NOT_APPEND);
                    }
                    break;
                case 3:
                    bookingService.createContract();
                    System.out.println("Đã tạo hợp đồng");
                    break;
                case 4:
                    List<String> stringList = ReadAndWriteFile.readFile(CONTRACT_FILE);
                    String[] array;
                    for (int i = 0; i < stringList.size(); i++) {
                        array = stringList.get(i).split(",");
                        System.out.println("     Hợp Đồng"+ "\n" +
                                "id: " + array[0] + "\n" +
                                "Mã Booking : " + array[1] + "\n" +
                                "Mã Khách Hàng: " + array[2] + "\n" +
                                "Mã Dịch Vụ: " + array[3]);
                    }
                    break;
                case 5:
                    flagg = false;
            }
        }
    }
}
