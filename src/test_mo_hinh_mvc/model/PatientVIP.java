package test_mo_hinh_mvc.model;

public class PatientVIP extends Patient {
    private int duration;
    private String serviceQuality;

    public PatientVIP() {
    }

        public PatientVIP(int id, String name, int yearOld, String dateOfAdmission, String dischargeDate, int duration,String serviceQuality ) {
        super(id, name, yearOld, dateOfAdmission, dischargeDate);
        this.duration = duration;
        this.serviceQuality=serviceQuality;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(String serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    public String getInforPatientVip() {
        return this.getId() + "," + this.getName() + "," + this.getYearOld() + "," + this.getDateOfAdmission() + "," + this.getDischargeDate() + "," + this.getDuration() + "," + this.getServiceQuality();
    }

    @Override
    public String toString() {
        return "- PatientVIP: " +super.toString()+"\n"+
                "   + Duration= " + duration +"\n"+
                "   + ServiceQuality: " + serviceQuality ;
    }
}
