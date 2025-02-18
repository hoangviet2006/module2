package demoQLSP.model;

public class Pants extends Product {
    protected int size;
    protected String material;

    public Pants() {
    }

    public Pants(int id, String name, double price, String brand, int size, String material) {
        super(id, name, price, brand);
        this.size = size;
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getInfoToFile() {
        return this.getId()+","+this.getName() + "," + this.getPrice() + "," + this.getBrand() + "," + this.getSize() + "," + this.getMaterial()+","+"Quần";
    }

    @Override
    public String toString() {
        return "---------Pants---------" + "\n" +
                "       id: "+id+"\n" +
                "       name: " + name + "\n" +
                "       price: " + price + "\n" +
                "       brand: " + brand + "\n" +
                "       size: " + size + "\n" +
                "       material: " + material;
    }
}
