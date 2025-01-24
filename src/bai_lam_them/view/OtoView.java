package bai_lam_them.view;

import bai_lam_them.model.Oto;

import java.util.Scanner;

public class OtoView {
    public static Scanner scanner = new Scanner(System.in);


    public static Oto inputOto() {
        System.out.println("Nhập Biển Kiểm soát");
        int licensePlate = 0;
        while (true) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại biển kiểm soát");
            }
        }

        System.out.println("Nhập hãng sản xuất");
        String Manufacturer ="";
        while (true){
            try {
                Manufacturer = scanner.nextLine();
                break;
            }catch (IllegalArgumentException e){
                System.out.println("Vui lòng nhập lại hãng sản xuất");
            }
        }

        System.out.println("Nhập năm sản xuất");
        int YearOfManufacture = 0;
        while (true){
            try {
                YearOfManufacture = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập lại năm sản xuất phù hợp");
            }
        }

        System.out.println("Nhập chủ sở hữu");
        String Owner ="";
        while (true){
            try {
                Owner = scanner.nextLine();
                break;
            }catch (IllegalArgumentException e){
                System.out.println("Vui lòng nhập tên chủ sở hữu phù hợp");
            }
        }

        System.out.println("Nhập số chổ ngồi");
        int numberOfSeats =0;
        while (true){
            try {
                numberOfSeats = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập lại số chổ ngồi của xe  phù hợp");
            }
        }

        System.out.println("Nhập kiểu xe");
        String VehicleType ="";
        while (true){
            try {
                VehicleType = scanner.nextLine();
                break;
            }catch (IllegalArgumentException e){
                System.out.println("vui lòng nhập kiểu xe phù hợp(vd: xe dịch vụ)");
            }
        }

        Oto oto = new Oto(licensePlate, Manufacturer, YearOfManufacture, Owner, numberOfSeats, VehicleType);
        return oto;
    }

    public static int InputlicensePlate() {
        System.out.println("Nhập biển số xe");
        int licensePlate = 0;
        while (true) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại biển kiểm soát");
            }
        }
        return licensePlate;
    }

    public static Oto inputOtoEdit() {
        System.out.println("Nhập Biển Kiểm soát mới của xe: ");
        int licensePlate = 0;
        while (true) {
            try {
                licensePlate = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại biển kiểm soát");
            }
        }


        System.out.println("Nhập hãng sản xuất mới của xe: ");
        String Manufacturer ="";
        while (true){
            try {
                Manufacturer = scanner.nextLine();
                break;
            }catch (IllegalArgumentException e){
                System.out.println("Vui lòng nhập lại hãng sản xuất");
            }
        }


        System.out.println("Nhập năm sản xuất mới của xe: ");
        int YearOfManufacture = 0;
        while (true){
            try {
                YearOfManufacture = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập lại năm sản xuất phù hợp");
            }
        }


        System.out.println("Nhập chủ sở hữu mới của xe: ");
        String Owner ="";
        while (true){
            try {
                Owner = scanner.nextLine();
                break;
            }catch (IllegalArgumentException e){
                System.out.println("Vui lòng nhập tên chủ sở hữu phù hợp");
            }
        }


        System.out.println("Nhập số chổ ngồi mới của xe: ");
        int numberOfSeats =0;
        while (true){
            try {
                numberOfSeats = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập lại số chổ ngồi của xe  phù hợp");
            }
        }
        System.out.println("Nhập kiểu xe mới của xe: ");
        String VehicleType ="";
        while (true){
            try {
                VehicleType = scanner.nextLine();
                break;
            }catch (IllegalArgumentException e){
                System.out.println("vui lòng nhập kiểu xe phù hợp(vd: xe dịch vụ)");
            }
        }
        Oto oto = new Oto(licensePlate, Manufacturer, YearOfManufacture, Owner, numberOfSeats, VehicleType);
        return oto;
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
            }
        }
        return licensePlate;
    }


}
