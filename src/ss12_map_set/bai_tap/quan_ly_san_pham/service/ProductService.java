package ss12_map_set.bai_tap.quan_ly_san_pham.service;

import ss12_map_set.bai_tap.quan_ly_san_pham.model.Phone;

import java.util.ArrayList;
import java.util.Collections;

public class ProductService implements IProductService {
    public static ArrayList<Phone> phones = new ArrayList<>();

    static {
        phones.add(new Phone(1, "iphone", 15000000));
        phones.add(new Phone(2, "sam sung", 25000000));
        phones.add(new Phone(3, "nokia", 30000000));
    }

    @Override
    public ArrayList<Phone> getAll() {
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i) != null) {
                Collections.sort(phones);
                System.out.println(phones.get(i));
            }
        }
        return phones;
    }

    @Override
    public void add(Phone phone) {
        phones.add(phone);
    }

    @Override
    public boolean deleteProduct(int id) {
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getId()==id){
                phones.remove(phones.get(i));
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Phone> searchProduct(String product) {
       ArrayList<Phone> newPhone = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getProduct().equals(product)){
                newPhone.add(phones.get(i));
            }
        }
        return newPhone;
    }

    @Override
    public boolean editProduct(int id,Phone phone) {
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getId()==id){
                phones.set(i,phone);
                return true;
            }
        }
        return false;
    }
    public boolean checkId(int id){
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getId()==id){
                return true;
            }
        }
        return false;
    }
}
