package quan_ly_sach.model;

public class Book {
    private int stt;
    private String code;
    private String name;
    private int price;

    public Book() {
    }

    public Book(int stt, String code, String name, int price) {
        this.stt = stt;
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInforToFile() {
        return this.getStt() + "," + this.getCode() + "," + this.getName() + "," + this.getPrice();
    }

    @Override
    public String toString() {
        return "Book{" +
                "stt=" + stt +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
