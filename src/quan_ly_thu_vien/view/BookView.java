package quan_ly_thu_vien.view;

import quan_ly_thu_vien.model.Book;

import java.util.Scanner;

public class BookView {
    public static Scanner scanner = new Scanner(System.in);

    public static Book inputBook() {
        System.out.println("Nhập id sách");
        int id;
        while (true){
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là số");
            }
        }
        System.out.println("Nhập mã sách");
        String code;
        while (true){
            try {
                code = scanner.nextLine();
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là chữ");
            }
        }
        System.out.println("Nhập tên sách");
        String name;
        while (true){
            try {
                 name=scanner.nextLine();
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là chữ");
            }
        }
        System.out.println("Nhập giá sách");
        int price;
        while (true){
            try {
                price = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là số");
            }
        }
        Book book = new Book(id,code,name,price);
        return book;
    }
    public static String inputCode(){
        System.out.println("Nhập mã sách");
        String code;
        while (true){
            try {
                code = scanner.nextLine();
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là chữ");
            }
        }
        return code;
    }

}
