package ss21_product.model;

public class ImportedProducts extends Product {
    protected int importTax;

    public ImportedProducts(int id, String name, double price, int quantity, int importTax) {
        super(id, name, price, quantity);
        this.importTax = importTax;
    }

    public ImportedProducts() {
    }

    public int getImportTax() {
        return importTax;
    }

    public void setImportTax(int importTax) {
        this.importTax = importTax;
    }

    public String getInfoToFile() {
        return this.getId() + "," + this.getName() + "," + this.getPrice() + "," + this.getQuantity() + "," + this.getImportTax() + ", NK";
    }

    @Override
    public String toString() {
        return "----------ImportedProducts----------" + "\n" +
                "-      id: " + id + "\n" +
                "-      name: " + name + "\n" +
                "-      price: " + price + "\n" +
                "-      quantity: " + quantity + "\n" +
                "-      importTax: " + importTax;
    }
}
