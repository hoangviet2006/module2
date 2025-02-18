package ss21_product.model;

public class ExportProducts extends Product {
    protected String nation;

        public ExportProducts(int id, String name, double price, int quantity, String nation) {
        super(id, name, price, quantity);
        this.nation = nation;
    }

    public ExportProducts() {
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
    public String getInfoToFile() {
        return this.getId() + "," + this.getName() + "," + this.getPrice() + "," + this.getQuantity() + "," + this.getNation() + ", XK";
    }

    @Override
    public String toString() {
        return "------------ExportProducts------------" + "\n" +
                "-      id: " + id + "\n" +
                "-      name: " + name + "\n" +
                "-      price: " + price + "\n" +
                "-      quantity: " + quantity + "\n" +
                "-      nation: " + nation;
    }
}
