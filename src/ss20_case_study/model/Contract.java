package ss20_case_study.model;

public class Contract {
    private int id;
    private String code;
    private Customer customer;
    private Facility facility;

    public Contract() {
    }

    public Contract(int id, String code, Customer customer, Facility facility) {
        this.id = id;
        this.code = code;
        this.customer = customer;
        this.facility = facility;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Contract = " +
                "id:" + id +
                ", code:'" + code +
                ", customer:  " + customer.getCustomerCode() +"-" +customer.getFullName() +
                ", facility.csv:" + facility.getCode() + "-" + facility.getName();

    }
}
