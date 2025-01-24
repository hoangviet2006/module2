package ss12_map_set.bai_tap.quan_ly_san_pham.service;

import ss12_map_set.bai_tap.quan_ly_san_pham.model.Phone;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Phone> getAll();

    void add(Phone phone);

    boolean deleteProduct(int id);

    ArrayList<Phone> searchProduct(String product);

    boolean editProduct(int id,Phone phone);
}
