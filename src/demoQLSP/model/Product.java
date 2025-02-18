package demoQLSP.model;

public class Product {
    protected int id;
    protected String name;
    protected double price;
    protected String brand;

    public Product() {
    }

    public Product(int id, String name, double price, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "-----------Product-----------" + "\n" +
                "       id: "+id+"\n" +
                "       name: " + name + "\n" +
                "       price: " + price + "\n" +
                "       brand: '" + brand;
    }
}
