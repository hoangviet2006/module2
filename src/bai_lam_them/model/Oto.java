package bai_lam_them.model;

public class Oto extends Vehicle implements Comparable<Oto> {

    private int numberOfSeats;
    private String vehicleType;

    public Oto() {
    }

    public Oto(int licensePlate, String manufacturer, int yearOfManufacture, String owner, int numberOfSeats, String vehicleType) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return " Oto{" + super.toString() +
                ", numberOfSeats= " + numberOfSeats +
                ", VehicleType= " + vehicleType +
                '}' + '\n';
    }

    public String getInforToFile() {
        return this.getLicensePlate() + "," + this.getManufacturer() + "," + this.getYearOfManufacture() + "," + this.getOwner() + "," + this.getNumberOfSeats() + "," + this.getVehicleType();
    }

    @Override
    public int compareTo(Oto o) {
        return this.getNumberOfSeats() - o.getNumberOfSeats();
    }
}
