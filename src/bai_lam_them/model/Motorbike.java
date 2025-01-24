package bai_lam_them.model;

public class Motorbike extends Vehicle implements Comparable<Motorbike>{


    private int power;

    public Motorbike() {
    }

    public Motorbike(int licensePlate, String manufacturer, int yearOfManufacture, String owner, int power) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.power = power;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return " Motorbike {" +
                super.toString()  +
                ", Power= " + power +
                '}' +'\n';
    }

    @Override
    public int compareTo(Motorbike o) {
        return this.getPower()-o.getPower();
    }
}
