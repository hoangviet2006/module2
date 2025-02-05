package quan_ly_sach.controller;

import quan_ly_sach.model.Book;
import quan_ly_sach.service.BookService;
import quan_ly_sach.view.BookView;
import ss16.bai_tap.bai_1.service.BirdService;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public  class BookController {
    public  static Scanner scanner = new Scanner(System.in);
    public static BookService bookService = new BookService();
    public  void display(){
        while (true){
            System.out.println("Chọn chức năng" +
                    "\n 1. Hiển Thị" +
                    "\n 2. Thêm" +
                    "\n 3. Sửa" +
                    "\n 4. Xóa" +
                    "\n 5. Tìm Kiếm" +
                    "\n 6. Thoát");
            System.out.println("Chọn Chức Năng");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count){
                case 1:
                    List<Book> bookList =bookService.getBookAll();
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
                    }
                    break;
                case 2:
                    Book book = BookView.inputBook();
                    bookService.addBook(book);
                    break;
                case 3:
                    String inputCode = BookView.inputCode();
                    Book book1 = BookView.inputBook();
                    boolean checkEdit = bookService.editBook(inputCode,book1);
                    if (checkEdit){
                        System.out.println("Chỉnh Sửa Thành Công");
                    }else {
                        System.out.println("Không tìm thấy mã sách");
                    }
                    break;
                case 4:
                    String inputCodeDelete = BookView.inputCode();
                    boolean checkDelete = bookService.deleteBook(inputCodeDelete);
                    if (checkDelete){
                        System.out.println("Xóa thành công");
                    }else {
                        System.out.println("Không tìm thấy mã sách");
                    }
                    break;
                case 5:
                    String inputCodeSearch = BookView.inputCode();
                    bookService.searchBook(inputCodeSearch);
                    break;
            }
        }
    }

}
