package MeanOfTransportation.service;

import MeanOfTransportation.model.MeanOfTransportation;

import java.util.ArrayList;

public interface IMeanOfTransportation {

    ArrayList<MeanOfTransportation> getAll();

    void add(MeanOfTransportation meanOfTransportation);

    boolean delete(String string);

    ArrayList<MeanOfTransportation> search(String string);
}
