package test_mo_hinh_mvc.model;

public abstract class Patient {
     private int id;
     private String name;
     private int yearOld;
     private String dateOfAdmission;
     private String dischargeDate;

    public Patient() {
    }

    public Patient(int id, String name, int yearOld, String dateOfAdmission, String dischargeDate) {
        this.id = id;
        this.name = name;
        this.yearOld = yearOld;
        this.dateOfAdmission = dateOfAdmission;
        this.dischargeDate = dischargeDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    @Override
    public String toString() {
        return  "\n"+
                "   + Id= " + id +"\n"+
                "   + Name= " + name  +"\n"+
                "   + YearOld= " + yearOld +"\n"+
                "   + DateOfAdmission= " + dateOfAdmission +"\n"+
                "   + DischargeDate= " + dischargeDate ;
    }
}
