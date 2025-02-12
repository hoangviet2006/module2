package ss20_case_study.model;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(int id, String code, String name, double area, double rentalCost, int maxPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(id, code, name, area, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }
    public Villa(String[] field) {
        super(Integer.parseInt(field[0]), field[1],field[2],
                Double.parseDouble(field[3]), Double.parseDouble(field[4]),
                Integer.parseInt(field[5]),field[6]);
        this.roomStandard = field[7];
        this.poolArea=Double.parseDouble(field[8]);
        this.numberOfFloors = Integer.parseInt(field[9]);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public String getInfoToFile(){
        return this.getId()+","+ this.getCode()+","+ this.getName()+","+this.getArea()+","+this.getRentalCost()+","+this.getMaxPeople()+","+this.getRentalType()+","+ this.getRoomStandard()+","+this.getPoolArea()+","+this.getNumberOfFloors();
    }
    @Override
    public String toString() {
        return super.toString()+ "roomStandard=" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
