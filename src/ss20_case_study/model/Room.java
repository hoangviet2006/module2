package ss20_case_study.model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }


    public Room(int id, String code, String name, double area, double rentalCost, int maxPeople, String rentalType, String freeService) {
        super(id, code, name, area, rentalCost, maxPeople, rentalType);
        this.freeService = freeService;
    }
    public Room(String[] field) {
        super(Integer.parseInt(field[0]), field[1],field[2],
                Double.parseDouble(field[3]), Double.parseDouble(field[4]),
                Integer.parseInt(field[5]),field[6]);
        this.freeService = field[7];

    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String getInfoToFile() {
          return this.getId()+","+ this.getCode()+","+ this.getName()+","+this.getArea()+","+this.getRentalCost()+","+this.getMaxPeople()+","+this.getRentalType()+","+ this.getFreeService();
    }

    @Override
    public String toString() {
        return super.toString()+
                "freeService= " + freeService + '\'' +
                '}';
    }
}
