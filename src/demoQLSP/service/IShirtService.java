package demoQLSP.service;

import demoQLSP.model.Pants;
import demoQLSP.model.Shirt;

import java.util.List;

public interface IShirtService {
    List<Shirt> getShirt();
    void addShirt(Shirt shirt);
    boolean editShirt(String name, Shirt shirt);
    boolean deleteShirt(String name);
    List<Shirt> searchShirt(String name);
}
