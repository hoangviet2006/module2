package ss20_case_study.service;

import ss20_case_study.model.Customer;
import ss20_case_study.model.Employee;

import java.util.List;

public interface ICustomerService {
    List<Customer> getCustomer();
    void addCustomer(Customer customer);
    boolean editCustomer(String name, Customer customer);
}
