package bai_lam_them.model;

public class Truck extends Vehicle implements Comparable<Truck> {

    private int payload;

    public Truck() {
    }

    public Truck(int licensePlate, String manufacturer, int yearOfManufacture, String owner, int payload) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.payload = payload;
    }


    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public String getInforToFile() {
        return  this.getLicensePlate() + "," + this.getManufacturer() + "," + this.getYearOfManufacture() + "," + this.getOwner() + "," + this.getPayload();
    }

    @Override
    public String toString() {
        return " Truck{" + super.toString() +
                ", Payload= " + payload +
                '}' + '\n';
    }

    @Override
    public int compareTo(Truck o) {
        return this.getPayload() - o.getPayload();
    }
}
