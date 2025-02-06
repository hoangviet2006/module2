package bai_lam_them.view;

import bai_lam_them.model.Truck;

import java.util.Scanner;

public class TrunkView {
    public static Scanner scanner = new Scanner(System.in);


    public static Truck inputTrunk() {
        System.out.println("Nhập Biển Kiểm soát");
        int licensePlate = 0;
        while (true) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại biển kiểm soát");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }

        System.out.println("Nhập hãng sản xuất");
        String manufacturer = "";
        while (true) {
            manufacturer = scanner.nextLine().trim();
            if (!manufacturer.isEmpty() && manufacturer.matches("^[A-ZÀ-Ỹ][a-zà-ỹ]+(\s[A-ZÀ-Ỹ][a-zà-ỹ]+)*$")) {
                break;
            } else {
                System.out.println("Lỗi không phải chữ, nhập lại: ");
            }
        }

        System.out.println("Nhập năm sản xuất");
        int yearOfManufacture = 0;
        while (true) {
            try {
                yearOfManufacture = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại năm sản xuất phù hợp");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }

        System.out.println("Nhập chủ sở hữu");
        String owner = "";
        while (true) {
            owner = scanner.nextLine().trim();
            if (!owner.isEmpty() && owner.matches("^[A-ZÀ-Ỹ][a-zà-ỹ]+(\s[A-ZÀ-Ỹ][a-zà-ỹ]+)*$")) {
                break;
            } else {
                System.out.println("Lỗi không phải chữ, nhập lại: ");
            }
        }

        System.out.println("Nhập trọng tải của xe");
        int payload = 0;
        while (true) {
            try {
                payload = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại trọng tải của xe");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }
        Truck truck = new Truck(licensePlate, manufacturer, yearOfManufacture, owner, payload);
        return truck;
    }

    public static int inputlicensePlate() {
        System.out.println("Nhập biển số xe");
        int licensePlate = 0;
        while (true) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại biển kiểm soát");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }
        return licensePlate;
    }

    public static Truck editTrunk() {
        System.out.println("Nhập Biển Kiểm soát mới của xe: ");
        int licensePlate = 0;
        while (true) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại biển kiểm soát");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }

        System.out.println("Nhập hãng sản xuất mới của xe: ");
        String manufacturer = "";
        while (true) {
            manufacturer = scanner.nextLine().trim();
            if (!manufacturer.isEmpty() && manufacturer.matches("^[A-ZÀ-Ỹ][a-zà-ỹ]+(\s[A-ZÀ-Ỹ][a-zà-ỹ]+)*$")) {
                break;
            } else {
                System.out.println("Lỗi không phải chữ, nhập lại: ");
            }
        }
        System.out.println("Nhập năm sản xuất mới của xe: ");
        int yearOfManufacture = 0;
        while (true) {
            try {
                yearOfManufacture = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại năm sản xuất phù hợp");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }
        System.out.println("Nhập chủ sở hữu mới của xe: ");
        String owner = "";
        while (true) {
            owner = scanner.nextLine().trim();
            if (!owner.isEmpty() && owner.matches("^[A-ZÀ-Ỹ][a-zà-ỹ]+(\s[A-ZÀ-Ỹ][a-zà-ỹ]+)*$")) {
                break;
            } else {
                System.out.println("Lỗi không phải chữ, nhập lại: ");
            }
        }
        System.out.println("Nhập trọng tải của xe mới của xe: ");
        int payload = 0;
        while (true) {
            try {
                payload = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại trọng tải của xe");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }
        Truck truck = new Truck(licensePlate, manufacturer, yearOfManufacture, owner, payload);
        return truck;
    }
}

