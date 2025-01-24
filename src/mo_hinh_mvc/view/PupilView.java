package mo_hinh_mvc.view;

import mo_hinh_mvc.model.Pupil;

import java.util.ArrayList;
import java.util.Scanner;

public class PupilView {
    public static Scanner scanner = new Scanner(System.in);

    public static Pupil inputPupil() {
        int id = 0;
        boolean isNumber;
        System.out.println("nhập id");
        do {
            try {
                String input = scanner.nextLine();
                id = Integer.parseInt(input);
                isNumber = false;
            } catch (Exception e) {
                System.out.println("Nhập lại id phải là số");
                isNumber = true;
            }
        } while (isNumber);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập điểm toán");
        int scoreToan = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập điểm lý");
        int scoreLy = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hóa");
        int scoreHoa = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày sinh");
        int birthDay = Integer.parseInt(scanner.nextLine());
        Pupil pupil = new Pupil(id, name, scoreToan, scoreLy, scoreHoa, birthDay);
        return pupil;
    }

    public static String inputName() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        return name;
    }

    public static int inputId() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static Pupil inputPupilEdit() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập điểm toán");
        int scoreToan = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập điểm lý");
        int scoreLy = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hóa");
        int scoreHoa = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày sinh");
        int birthDay = Integer.parseInt(scanner.nextLine());
        Pupil pupil = new Pupil(name, scoreToan, scoreLy, scoreHoa, birthDay);
        return pupil;
    }
}
