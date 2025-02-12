package ss20_case_study.service;

import ss20_case_study.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployee();
    void addEmployee(Employee employee);
    boolean editEmployee(String name, Employee employee);
}
