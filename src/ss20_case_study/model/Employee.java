package ss20_case_study.model;

public class Employee extends Human {
    private String employeeCode;
    private String level;
    private String location;
    private int wage;

    public Employee() {
    }

    public Employee(String fullName, String date, String gender, String CMND, String phoneNumber, String email, String employeeCode, String level, String location, int wage) {
        super(fullName, date, gender, CMND, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getInfoToEmployee() {
        return this.getFullName() + "," + this.getDate() + "," + this.getGender() + "," + this.getCMND() + "," + this.getPhoneNumber() + "," + this.getEmail() + "," + this.getEmployeeCode() + "," + this.getLevel() + "," + this.getLocation() + "," + this.getWage();
    }

    @Override
    public String toString() {
        return "Employee " + super.toString() + "," +
                "employeeCode: " + employeeCode +
                ", level: " + level +
                ", location: " + location +
                ", wage: " + wage ;
    }
}
