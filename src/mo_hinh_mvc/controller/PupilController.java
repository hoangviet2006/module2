package mo_hinh_mvc.controller;

import mo_hinh_mvc.model.Pupil;
import mo_hinh_mvc.service.PupilService;
import mo_hinh_mvc.view.PupilView;

import java.util.ArrayList;
import java.util.Scanner;

public class PupilController {
    public static Scanner scanner = new Scanner(System.in);
    public static PupilService pupilService = new PupilService();

    public void displayAll() {
        while (true) {
            System.out.println("----------Chọn chức năng---------" +
                    "\n 1. Hiển Thị" +
                    "\n 2. Thêm" +
                    "\n 3. Sửa " +
                    "\n 4. Xóa" +
                    "\n 5. Tìm Kiếm" +
                    "\n 6. Thoát");
            System.out.println("----------Chọn chức năng---------");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    pupilService.getPupilAll();
                    break;
                case 2:
                    Pupil pupil = PupilView.inputPupil();
                    pupilService.addPupil(pupil);
                    System.out.println("Thêm học viên thành công");
                    break;
                case 3:
                    int editPupil = PupilView.inputId();
                    Pupil newPupil = PupilView.inputPupilEdit();
                    boolean checkEdit = pupilService.editPupil(editPupil, newPupil);
                    if (checkEdit) {
                        System.out.println("Chỉnh sửa thành công");
                    } else {
                        System.out.println("không tìm thấy id cần chỉnh sửa");
                    }
                    break;
                case 4:
                    String nameDelete = PupilView.inputName();
                    boolean checkDelete = pupilService.deletePupil(nameDelete);
                    if (checkDelete) {
                        System.out.println("xóa thành công");
                    } else {
                        System.out.println("không tìm thấy tên cần xóa");
                    }
                    break;
                case 5:
                    String nameSearch = PupilView.inputName();
                    ArrayList<Pupil> newPupilSearch = pupilService.searchPupil(nameSearch);
                    if (newPupilSearch.size() > 0) {
                        System.out.println(newPupilSearch);
                    } else {
                        System.out.println("không tìm thấy tên vừa nhập");
                    }
                    break;
            }
        }
    }

}
