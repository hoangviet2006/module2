package ss20_case_study.model;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(int id, String code, String name, double area, double rentalCost, int maxPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(id, code, name, area, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }
    public House(String[] field) {
        super(Integer.parseInt(field[0]), field[1],field[2],
                Double.parseDouble(field[3]), Double.parseDouble(field[4]),
                Integer.parseInt(field[5]), field[6]);
        this.roomStandard = field[7];
        this.numberOfFloors = Integer.parseInt(field[8]);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getInfoToFile() {
        return this.getId()+","+ this.getCode()+","+ this.getName()+","+this.getArea()+","+this.getRentalCost()+","+this.getMaxPeople()+","+this.getRentalType()+","+ this.getRoomStandard() + "," + this.getNumberOfFloors();
    }

    @Override
    public String toString() {
        return super.toString()+ "roomStandard= " + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
