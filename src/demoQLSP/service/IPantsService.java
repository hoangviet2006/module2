package demoQLSP.service;

import demoQLSP.model.Pants;

import java.util.List;

public interface IPantsService {
    List<Pants> getPants();
    void addPants(Pants pants);
    boolean editPants(String name, Pants pants);
    boolean deletePants(String name);
    List<Pants> searchPants(String name);
}
