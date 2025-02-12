package ss20_case_study.model;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Booking {
    private int id;
    private String code;
    private String customerCode;
    private String codeService;

    public Booking() {
    }

    public Booking(int id, String code, String customerCode, String codeService) {
        this.id = id;
        this.code = code;
        this.customerCode = customerCode;
        this.codeService = codeService;
    }

    public Booking(int id, String code) {
        this.id = id;
        this.code = code;
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

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getInfoToFile() {
        return this.getId() + "," + this.getCode() + "," + this.getCustomerCode() + "," + this.getCodeService();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", codeService='" + codeService + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(customerCode, booking.customerCode) && Objects.equals(codeService, booking.codeService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerCode, codeService);
    }
}
