package MeanOfTransportation.service;

import MeanOfTransportation.model.MeanOfTransportation;

import java.util.ArrayList;

public class MeanOfTransportationService implements IMeanOfTransportation {
     private  static ArrayList<MeanOfTransportation> meanOfTransportations = new ArrayList<>();
    static {
        meanOfTransportations.add(new MeanOfTransportation(1,"Xe Máy"));
        meanOfTransportations.add(new MeanOfTransportation(2,"Xe Oto"));
        meanOfTransportations.add(new MeanOfTransportation(3,"Xe Đạp"));
        meanOfTransportations.add(new MeanOfTransportation(4,"Máy Bay"));
    }

    @Override
    public ArrayList<MeanOfTransportation> getAll() {
        return meanOfTransportations;
    }

    @Override
    public void add(MeanOfTransportation meanOfTransportation) {
        meanOfTransportations.add(meanOfTransportation);

    }

    @Override
    public boolean delete(String string) {
        for (int i = 0; i < meanOfTransportations.size(); i++) {
            if (meanOfTransportations.get(i).getName().equals(string)){
                meanOfTransportations.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<MeanOfTransportation> search(String string) {
        ArrayList<MeanOfTransportation> newArrayList = new ArrayList<>();
        for (int i = 0; i < meanOfTransportations.size(); i++) {
            if (meanOfTransportations.get(i).getName().contains(string)){
                newArrayList.add(meanOfTransportations.get(i));
            }
        }
        return newArrayList;
    }
}
