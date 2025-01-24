package MeanOfTransportation.controller;

import MeanOfTransportation.model.MeanOfTransportation;
import MeanOfTransportation.service.MeanOfTransportationService;
import MeanOfTransportation.view.MeanOfTransportationView;

import java.util.AbstractList;
import java.util.Scanner;

public class MeanOfTransportationController {
    private Scanner scanner = new Scanner(System.in);
    MeanOfTransportationService meanOfTransportationService = new MeanOfTransportationService();

    public void displayMenu() {
        while (true) {
            System.out.println("-------Chọn chức năng-------" +
                    "\n 1. Hiển Thị" +
                    "\n 2. Thêm " +
                    "\n 3. Xóa" +
                    "\n 4. Tìm Kiếm" +
                    "\n 5. Thoát");
            System.out.println("----Chọn Chức Năng-----");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    System.out.println(meanOfTransportationService.getAll());
                    break;
                case 2:
                    MeanOfTransportation meanOfTransportation = MeanOfTransportationView.inPut();
                    meanOfTransportationService.add(meanOfTransportation);
                    break;
                case 3:
                    String name = MeanOfTransportationView.inputName();
                    boolean check = meanOfTransportationService.delete(name);
                    if (check) {
                        System.out.println("--------xóa thành công-------");
                    } else {
                        System.out.println("------Không tìm thấy tên------");
                    }
                    break;
                case 4:
                    String nammSearch = MeanOfTransportationView.inputName();
                    AbstractList<MeanOfTransportation> MeanList = meanOfTransportationService.search(nammSearch);
                    MeanOfTransportationView.Search(MeanList);
                    break;
                case 5:
                    System.exit(0);

            }

        }
    }
}
