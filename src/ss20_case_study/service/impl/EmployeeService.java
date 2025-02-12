package ss20_case_study.service.impl;

import ReadAndWriteFile.ReadAndWriteFile;
import ss20_case_study.model.Employee;
import ss20_case_study.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static final String EMPLOYEE_FILE = "D:\\codegym\\module2\\src\\ss20_case_study\\data\\human.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    @Override
    public List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(EMPLOYEE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            if (array.length == 10) {
                Employee employee = new Employee(array[0], array[1], array[2],array[3], array[4], array[5], array[6], array[7], array[8], Integer.parseInt(array[9]));
                employees.add(employee);
            }
        }
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoToEmployee());
        ReadAndWriteFile.writeFile(EMPLOYEE_FILE, stringList, APPEND);
    }

    @Override
    public boolean editEmployee(String name, Employee employee) {
        boolean check  =false;
        List<Employee> employees = getEmployee();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFullName().equals(name)) {
                check=true;
                employees.set(i, employee);
            }
        }
        if (check){
            List<String> stringList = new ArrayList<>();
            for (Employee employee1: employees){
                stringList.add(employee1.getInfoToEmployee());
            }
            ReadAndWriteFile.writeFile(EMPLOYEE_FILE,stringList,NOT_APPEND);
        }
        return check;
    }
}
