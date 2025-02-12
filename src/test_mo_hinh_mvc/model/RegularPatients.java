package test_mo_hinh_mvc.model;

public class RegularPatients extends Patient {
    private int hospitalFees;

    public RegularPatients() {
    }

    public RegularPatients(int id, String name, int yearOld, String dateOfAdmission, String dischargeDate, int hospitalFees) {
        super(id, name, yearOld, dateOfAdmission, dischargeDate);
        this.hospitalFees = hospitalFees;
    }

    public String getInforRegularPatient() {
        return this.getId() + "," + this.getName() + "," + this.getYearOld() + "," + this.getDateOfAdmission() + "," + this.getDischargeDate() + "," + this.getHospitalFees();
    }

    public int getHospitalFees() {
        return hospitalFees;
    }

    public void setHospitalFees(int hospitalFees) {
        this.hospitalFees = hospitalFees;
    }

    @Override
    public String toString() {
        return "- RegularPatients " +super.toString()+"\n"+
                "   + HospitalFees= " + hospitalFees + " milion ";
    }
}
