package ss20_case_study.model;

public abstract class Human {
    private  String fullName;
    private  String date;
    private  String gender;
    private  String CMND;
    private  String phoneNumber;
    private  String email;

    public Human() {
    }

    public Human(String fullName, String date, String gender, String CMND, String phoneNumber, String email) {
        this.fullName = fullName;
        this.date = date;
        this.gender = gender;
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                " fullName: " + fullName  +
                ", date: " + date  +
                ", gender: " + gender  +
                ", CMND: " + CMND +
                ", phoneNumber: " + phoneNumber +
                ", email: " + email  +" ";
    }
}
