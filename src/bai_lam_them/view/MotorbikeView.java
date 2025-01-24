package bai_lam_them.view;

import bai_lam_them.model.Motorbike;

import java.util.Scanner;

public class MotorbikeView {
    public static Scanner scanner = new Scanner(System.in);


    public static Motorbike inputMotorbike() {
        int licensePlate = 0;
        boolean check = false;
        System.out.println("Nhập biển kiểm soát");
        while (!check) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
                check = true;
            } catch (Exception e) {
                System.out.println("Nhập lại biển kiểm soát ");
                check = false;
            }
        }
        boolean check1 = false;
        System.out.println("Nhập hãng sản xuất");
        String Manufacturer = "";
        while (!check1) {
            try {
                Manufacturer = scanner.nextLine();
                check1 = true;
            } catch (Exception e) {
                System.out.println("Nhập lại hãng sản xuất");
                check1 = false;
            }
        }
        boolean check2 = false;
        int YearOfManufacture = 0;
        System.out.println("Nhập năm sản xuất");
        while (!check2) {
            try {
                YearOfManufacture = Integer.parseInt(scanner.nextLine());
                check2 = true;
            } catch (Exception e) {
                System.out.println("Nhập lại năm sản xuất");
                check2 = false;
            }
        }
        System.out.println("Nhập chủ sỡ hữu");
        boolean check3 = false;
        String Owner = "";
        while (!check3) {
            try {
                Owner = scanner.nextLine();
                check3 = true;
            } catch (Exception e) {
                System.out.println("Nhập lại chủ sở hữu");
                check3 = false;
            }
        }
        int power = 0;
        boolean check4 = false;
        System.out.println("Nhập mã lực của xe");
        while (!check4) {
            try {
                power = Integer.parseInt(scanner.nextLine());
                check4 = true;
            } catch (Exception e) {
                System.out.println("Nhập lại mã lực của xe");
                check4 = false;
            }
        }
        Motorbike motorbike = new Motorbike(licensePlate, Manufacturer, YearOfManufacture, Owner, power);
        return motorbike;

    }

    public static int InputlicensePlate() {
        int licensePlate = 0;
        boolean check = false;
        System.out.println("Nhập biển kiểm soát");
        while (!check) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
                check = true;
            } catch (Exception e) {
                System.out.println("Nhập lại biển kiểm soát ");
                check = false;
            }
        }
        return licensePlate;
    }


    public static Motorbike editMotorbike() {
        int licensePlate = 0;
        boolean check = false;
        System.out.println("Nhập biển kiểm soát");
        while (!check) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
                check = true;
            } catch (Exception e) {
                System.out.println("Nhập lại biển kiểm soát ");
                check = false;
            }
        }
        boolean check1 = false;
        System.out.println("Nhập hãng sản xuất");
        String Manufacturer = "";
        while (!check1) {
            try {
                Manufacturer = scanner.nextLine();
                check1 = true;
            } catch (Exception e) {
                System.out.println("Nhập lại hãng sản xuất");
                check1 = false;
            }
        }
        boolean check2 = false;
        int YearOfManufacture = 0;
        System.out.println("Nhập năm sản xuất");
        while (!check2) {
            try {
                YearOfManufacture = Integer.parseInt(scanner.nextLine());
                check2 = true;
            } catch (Exception e) {
                System.out.println("Nhập lại năm sản xuất");
                check2 = false;
            }
        }
        System.out.println("Nhập chủ sỡ hữu");
        boolean check3 = false;
        String Owner = "";
        while (!check3) {
            try {
                Owner = scanner.nextLine();
                check3 = true;
            } catch (Exception e) {
                System.out.println("Nhập lại chủ sở hữu");
                check3 = false;
            }
        }
        int power = 0;
        boolean check4 = false;
        System.out.println("Nhập mã lực của xe");
        while (!check4) {
            try {
                power = Integer.parseInt(scanner.nextLine());
                check4 = true;
            } catch (Exception e) {
                System.out.println("Nhập lại mã lực của xe");
                check4 = false;
            }
        }
        Motorbike motorbike = new Motorbike(licensePlate, Manufacturer, YearOfManufacture, Owner, power);
        return motorbike;
    }



}

