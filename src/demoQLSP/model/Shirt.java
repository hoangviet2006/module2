package demoQLSP.model;

public class Shirt extends Product{
    protected int size;
    protected String color;

    public Shirt() {
    }

    public Shirt(int id, String name, double price, String brand, int size, String color) {
        super(id, name, price, brand);
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getInfoToFile() {
        return this.getId()+","+this.getName() + "," + this.getPrice() + "," + this.getBrand() + "," + this.getSize() + "," + this.getColor()+ "," +"Áo";
    }

    @Override
    public String toString() {
        return "---------Shirt---------" +"\n" +
                "       id: "+id+"\n" +
                "       name: " + name + "\n" +
                "       price: " + price +"\n" +
                "       brand: " + brand+
                "       size: " + size +"\n" +
                "       color: " + color +"\n";
    }
}
