package ss20_case_study.model;

public class Customer extends Human {
    private String CustomerCode;
    private String typeOfGuest;
    private String address;

    public Customer(String fullName, String date, String gender, String CMND, String phoneNumber, String email, String customerCode, String typeOfGuest, String address) {
        super(fullName, date, gender, CMND, phoneNumber, email);
        this.CustomerCode = customerCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfoToCustomer() {
        return this.getFullName() + "," + this.getDate() + "," + this.getGender() + "," + this.getCMND() + "," + this.getPhoneNumber() + "," + this.getEmail() + "," + this.getCustomerCode() + "," + this.getTypeOfGuest() + "," + this.getAddress();
    }

    @Override
    public String toString() {
        return " Customer " + super.toString()+","+
                "CustomerCode:  " + CustomerCode +
                ", typeOfGuest: " + typeOfGuest  +
                ", address: " + address  ;
    }
}
