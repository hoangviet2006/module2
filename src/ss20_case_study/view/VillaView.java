package ss20_case_study.view;

import ss20_case_study.model.Room;
import ss20_case_study.model.Villa;

import java.util.Scanner;

public class VillaView {
    static Scanner scanner = new Scanner(System.in);

    public static Villa inputVilla() {
        System.out.println("Nhập id");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số! Nhập lại");
            }
        }

        System.out.println("Nhập mã dịch vụ theo định dạng (VL-nnnn, nnnn là mã số)");
        String code;
        while (true) {

            code = scanner.nextLine();
            if (!code.isEmpty() && code.matches("^[A-Z]{2}-\\d{4}$")) {
                break;
            } else {
                System.out.println("Vui lòng nhập lại mã  dịch vụ hợp lý!");
            }

        }

        System.out.println("Nhập tên dịch vụ");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                if (!name.isEmpty() && name.matches("^[A-Za-zÀ-Ỹà-ỹ\\s]+$")) {
                    break;
                } else {
                    System.out.println("Không phải là chữ! Vui lòng nhập lại tên dịch vụ hợp lý!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi không phải là chữ ");
            }
        }

        System.out.println("Nhập diện tích phòng");
        double area;
        while (true) {
            try {
                area = Double.parseDouble(scanner.nextLine());
                if (area <= 0) {
                    System.out.println("Diện tích phòng phải lớn hơn 0! Vui lòng nhập lại");
                    continue;
                }
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là chữ! Nhập lại");
            }
        }

        System.out.println("Nhập chi phí thuê phòng");
        double rentalCost;
        while (true) {
            try {
                rentalCost = Double.parseDouble(scanner.nextLine());
                if (rentalCost <= 0) {
                    System.out.println("Chi phí thuê phòng phải lớn hơn 0! Vui lòng nhập lại");
                    continue;
                }
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số! Nhập lại");
            }
        }

        System.out.println("Nhập số người tối đa");
        int maxPeople;
        while (true) {
            try {
                maxPeople = Integer.parseInt(scanner.nextLine());
                if (maxPeople <= 0) {
                    System.out.println("Số người tối đa phải lớn hơn 0! Vui lòng nhập lại");
                    continue;
                }
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số! Nhập lại");
            }
        }

        System.out.println("Nhập loại hình cho thuê");
        String rentalType;
        while (true) {
            try {
                rentalType = scanner.nextLine();
                if (!rentalType.isEmpty() && rentalType.matches("^[A-Za-zÀ-Ỹà-ỹ\\s]+$")) {
                    break;
                } else {
                    System.out.println("Lỗi ! Vui lòng nhập lại loại hình cho thuê hợp lý");
                }
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi không phải là chữ! Nhập lại");
            }
        }

        System.out.println("Nhập tiêu chuẩn của phòng");
        String roomStandard;
        while (true) {
            try {
                roomStandard = scanner.nextLine();
                if (!roomStandard.isEmpty() && roomStandard.matches("^[A-Za-zÀ-Ỹà-ỹ\\s]+$")) {
                    break;
                } else {
                    System.out.println("Lỗi! vui lòng nhập lại tiêu chuẩn của phòng");
                }
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi không phai là chữ! nhập lại");
            }
        }

        System.out.println("Nhập diện tích hồ bơi");
        double poolArea;
        while (true) {
            try {
                poolArea = Double.parseDouble(scanner.nextLine());
                if (poolArea <= 0) {
                    System.out.println("Diện tích hồ bơi phải lớn hơn 0! Vui lòng nhập lại");
                    continue;
                }
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số! Nhập lại");
            }
        }

        System.out.println("Nhập số tầng của villa");
        int numberOfFloors;
        while (true) {
            try {
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors <= 0) {
                    System.out.println("Số tầng của villa phải lớn hơn 0! Vui lòng nhập lại");
                    continue;
                }
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số! Nhập lại");
            }
        }

        Villa villa = new Villa(id,code,name,area,rentalCost,maxPeople,rentalType,roomStandard,poolArea,numberOfFloors);
        return villa;
    }

    public static int inputId() {
        System.out.println("Nhập id");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số! Nhập lại");
            }
        }
        return id;
    }
}
