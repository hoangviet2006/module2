package ss20_case_study.controller;

import ss20_case_study.model.Room;
import ss20_case_study.service.impl.RoomService;
import ss20_case_study.view.RoomView;

import java.util.Map;
import java.util.Scanner;

public class RoomController {
    private static Scanner scanner = new Scanner(System.in);
    private static RoomService roomService = new RoomService();

    public void displayRoom() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý Room" +
                    "\n 1. Hiển thị room" +
                    "\n 2. Thêm room" +
                    "\n 3. Quay lại menu chính");
            System.out.println("Chọn chức năng");
            int choose;
            while (true) {
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng chọn lại chức năng!");
                }

            }
            switch (choose) {
                case 1:
                    Map<Room,Integer> roomList = roomService.getMap();
                    for (Room room : roomList.keySet()) {
                        System.out.println("Mã dịch vụ: "+room.getCode()+"  tên dịch vụ: "+room.getName()+"  Số lần thuê: "+roomList.get(room));
                    }
                    break;
                case 2:
                    roomService.addRoom(RoomView.inputRoom());
                    break;
                case 3:
                    flag=false;
            }
        }
    }

}
