package bai_lam_them.view;

import bai_lam_them.model.Motorbike;

import java.util.Scanner;

public class MotorbikeView {
    public static Scanner scanner = new Scanner(System.in);


    public static Motorbike inputMotorbike() {
        int licensePlate;
        System.out.println("Nhập biển kiểm soát");
        while (true) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại biển kiểm soát ");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }


        System.out.println("Nhập hãng sản xuất");
        String Manufacturer;
        while (true) {
            Manufacturer = scanner.nextLine().trim();
            if (!Manufacturer.isEmpty() && Manufacturer.matches("^[A-ZÀ-Ỹ][a-zà-ỹ]+(\s[A-ZÀ-Ỹ][a-zà-ỹ]+)*$")) {
                break;
            } else {
                System.out.println("Lỗi không phải chữ, nhập lại: ");
            }
        }
        int YearOfManufacture;
        System.out.println("Nhập năm sản xuất");
        while (true) {
            try {
                YearOfManufacture = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại năm sản xuất");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }


        System.out.println("Nhập chủ sỡ hữu");
        String Owner;
        while (true) {
            Owner = scanner.nextLine().trim();
            if (!Owner.isEmpty() && Owner.matches("^[A-ZÀ-Ỹ][a-zà-ỹ]+(\s[A-ZÀ-Ỹ][a-zà-ỹ]+)*$")) {
                break;
            } else {
                System.out.println("Lỗi không phải chữ, nhập lại: ");
            }
        }


        int power ;
        System.out.println("Nhập mã lực của xe");
        while (true) {
            try {
                power = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại mã lực của xe");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }
        Motorbike motorbike = new Motorbike(licensePlate, Manufacturer, YearOfManufacture, Owner, power);
        return motorbike;

    }

    public static int InputlicensePlate() {
        int licensePlate;
        System.out.println("Nhập biển kiểm soát");
        while (true) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại biển kiểm soát ");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }
        return licensePlate;
    }


    public static Motorbike editMotorbike() {
        int licensePlate;
        System.out.println("Nhập biển kiểm soát");
        while (true) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
              break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại biển kiểm soát ");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }


        System.out.println("Nhập hãng sản xuất");
        String Manufacturer;
        while (true) {
            Manufacturer = scanner.nextLine().trim();
            if (!Manufacturer.isEmpty() && Manufacturer.matches("^[A-ZÀ-Ỹ][a-zà-ỹ]+(\s[A-ZÀ-Ỹ][a-zà-ỹ]+)*$")) {
                break;
            } else {
                System.out.println("Lỗi không phải chữ, nhập lại: ");
            }
        }


        int YearOfManufacture;
        System.out.println("Nhập năm sản xuất");
        while (true) {
            try {
                YearOfManufacture = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại năm sản xuất");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }


        System.out.println("Nhập chủ sỡ hữu");
        String Owner;
        while (true) {
            Owner = scanner.nextLine().trim();
            if (!Owner.isEmpty() && Owner.matches("^[A-ZÀ-Ỹ][a-zà-ỹ]+(\s[A-ZÀ-Ỹ][a-zà-ỹ]+)*$")) {
                break;
            } else {
                System.out.println("Lỗi không phải chữ, nhập lại: ");
            }
        }


        int power;
        System.out.println("Nhập mã lực của xe");
        while (true) {
            try {
                power = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại mã lực của xe");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }

        Motorbike motorbike = new Motorbike(licensePlate, Manufacturer, YearOfManufacture, Owner, power);
        return motorbike;
    }
}

