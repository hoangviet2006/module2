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
        String Manufacturer = "";
        while (true) {
            try {
                Manufacturer = scanner.nextLine();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Vui lòng nhập lại hãng sản xuất");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }

        System.out.println("Nhập năm sản xuất");
        int YearOfManufacture = 0;
        while (true) {
            try {
                YearOfManufacture = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại năm sản xuất phù hợp");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }

        System.out.println("Nhập chủ sở hữu");
        String Owner = "";
        while (true) {
            try {
                Owner = scanner.nextLine();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Vui lòng nhập tên chủ sở hữu phù hợp");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }


        System.out.println("Nhập trọng tải của xe");
        int Payload = 0;
        while (true) {
            try {
                Payload = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại trọng tải của xe");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }
        Truck truck = new Truck(licensePlate, Manufacturer, YearOfManufacture, Owner, Payload);
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
        String Manufacturer = "";
        while (true) {
            try {
                Manufacturer = scanner.nextLine();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Vui lòng nhập lại hãng sản xuất");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }
        System.out.println("Nhập năm sản xuất mới của xe: ");
        int YearOfManufacture = 0;
        while (true) {
            try {
                YearOfManufacture = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại năm sản xuất phù hợp");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }
        System.out.println("Nhập chủ sở hữu mới của xe: ");
        String Owner = "";
        while (true) {
            try {
                Owner = scanner.nextLine();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Vui lòng nhập tên chủ sở hữu phù hợp");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }
        System.out.println("Nhập trọng tải của xe mới của xe: ");
        int Payload = 0;
        while (true) {
            try {
                Payload = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại trọng tải của xe");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }
        Truck truck = new Truck(licensePlate, Manufacturer, YearOfManufacture, Owner, Payload);
        return truck;
    }

    public static int inputLicensePlateEDit() {
        System.out.println("Nhập biển số xe cần chỉnh sửa: ");
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
}
