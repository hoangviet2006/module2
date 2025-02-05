package quan_ly_thu_vien.model;

public class Client {
    private String name;
    private String code;
    private String BookTitle;
    private int quantity;

    public Client() {
    }

    public Client(String name, String code, String bookTitle, int quantity) {
        this.name = name;
        this.code = code;
        this.BookTitle = bookTitle;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getInforToFile() {
        return this.getName() + "," + this.getCode() + "," + this.BookTitle + "," + this.getQuantity();
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", BookTitle='" + BookTitle + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
