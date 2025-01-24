package ss12_map_set.bai_tap.quan_ly_san_pham.model;

public class Phone implements Comparable<Phone>{
    private int id;
    private String product;
    private int price;

    public Phone() {
    }

    public Phone(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public Phone(int id, String product, int price) {
        this.id = id;
        this.product = product;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Phone o) {
        return this.getPrice()-o.getPrice();
    }
}
