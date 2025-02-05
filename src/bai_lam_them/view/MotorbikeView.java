package bai_lam_them.view;

import bai_lam_them.model.Motorbike;

import java.util.Scanner;

public class MotorbikeView {
    public static Scanner scanner = new Scanner(System.in);


    public static Motorbike inputMotorbike() {
        int licensePlate = 0;
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
        String Manufacturer = "";
        while (true) {
            try {
                Manufacturer = scanner.nextLine();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nhập lại hãng sản xuất");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }

        int YearOfManufacture = 0;
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
        String Owner = "";
        while (true) {
            try {
                Owner = scanner.nextLine();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nhập lại chủ sở hữu");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }


        int power = 0;
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
        int licensePlate = 0;
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
        int licensePlate = 0;
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
        String Manufacturer = "";
        while (true) {
            try {
                Manufacturer = scanner.nextLine();
              break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nhập lại hãng sản xuất");

            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }


        int YearOfManufacture = 0;
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
        String Owner = "";
        while (true) {
            try {
                Owner = scanner.nextLine();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nhập lại chủ sở hữu");
            } catch (Exception e) {
                System.out.println("lỗi khác");
            }
        }


        int power = 0;
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

