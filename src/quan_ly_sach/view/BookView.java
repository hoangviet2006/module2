package quan_ly_sach.view;

import quan_ly_sach.model.Book;

import java.util.List;
import java.util.Scanner;

public class BookView {
    public static Scanner scanner = new Scanner(System.in);

    public static Book inputBook() {
        System.out.println("Nhập stt sách");
        int stt = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã sách");
        String code = scanner.nextLine();
        System.out.println("Nhập tên sách");
        String name =  scanner.nextLine();
        System.out.println("Nhập giá sách");
        int price = Integer.parseInt(scanner.nextLine());
        Book book = new Book(stt,code,name,price);
        return book;
    }
    public static String inputCode(){
        System.out.println("Nhập mã sách");
        String code = scanner.nextLine();
        return code;
    }

}
