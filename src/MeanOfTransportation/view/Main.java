package MeanOfTransportation.view;

import MeanOfTransportation.controller.MeanOfTransportationController;
import MeanOfTransportation.model.MeanOfTransportation;

public class Main {
    public static void main(String[] args) {
        MeanOfTransportationController meanOfTransportationController = new MeanOfTransportationController();
        meanOfTransportationController.displayMenu();
    }
}
