package ss20_case_study.service.impl;

import ReadAndWriteFile.ReadAndWriteFile;
import ss20_case_study.model.Customer;
import ss20_case_study.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    private static final String CUSTOMER_FILE = "D:\\codegym\\module2\\src\\ss20_case_study\\data\\human.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;
    @Override
    public List<Customer> getCustomer() {
        List<Customer> customers = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(CUSTOMER_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            if (array.length == 9) {
                Customer customer = new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
                customers.add(customer);
            }
        }
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoToCustomer());
        ReadAndWriteFile.writeFile(CUSTOMER_FILE, stringList, APPEND);
    }

    @Override
    public boolean editCustomer(String name, Customer customer) {
        boolean check  =false;
        List<Customer> customers = getCustomer();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getFullName().equals(name)) {
                check=true;
                customers.set(i, customer);
            }
        }
        if (check){
            List<String> stringList = new ArrayList<>();
            for (Customer customer1: customers){
                stringList.add(customer1.getInfoToCustomer());
            }
            ReadAndWriteFile.writeFile(CUSTOMER_FILE,stringList,NOT_APPEND);
        }
        return check;
    }
}
