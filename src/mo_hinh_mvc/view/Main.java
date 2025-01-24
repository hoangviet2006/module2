package mo_hinh_mvc.view;

import mo_hinh_mvc.controller.PupilController;

public class Main {
    public static void main(String[] args) {
        PupilController pupilController = new PupilController();
        pupilController.displayAll();
    }
}
