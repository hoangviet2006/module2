package quan_ly_thu_vien.controller;

import quan_ly_thu_vien.model.Book;
import quan_ly_thu_vien.service.BookService;
import quan_ly_thu_vien.view.BookView;

import java.util.List;
import java.util.Scanner;

public class BookController {
    public static Scanner scanner = new Scanner(System.in);
    public static BookService bookService = new BookService();

    public void display() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý  sách" +
                    "\n 1. Hiển Thị" +
                    "\n 2. Thêm sách" +
                    "\n 3. Sửa sách" +
                    "\n 4. Xóa sách" +
                    "\n 5. Tìm Kiếm sách" +
                    "\n 6. Quay lại menu chính");
            System.out.println("Chọn Chức Năng");
            int count;
            while (true){
                try {
                    count =  Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException numberFormatException){
                    System.out.println("Lỗi không phải là số");
                }
            }
            switch (count) {
                case 1:
                    List<Book> bookList = bookService.getBookAll();
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
                    }
                    break;
                case 2:
                    Book book = BookView.inputBook();
                    bookService.addBook(book);
                    break;
                case 3:
                    String inputCode = BookView.inputNameBook();
                    Book book1 = BookView.inputBook();
                    boolean checkEdit = bookService.editBook(inputCode, book1);
                    if (checkEdit) {
                        System.out.println("Chỉnh Sửa Thành Công");
                    } else {
                        System.out.println("Không tìm thấy mã sách");
                    }
                    break;
                case 4:
                    String inputCodeDelete = BookView.inputNameBook();
                    boolean checkDelete = bookService.deleteBook(inputCodeDelete);
                    if (checkDelete) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Không tìm thấy mã sách");
                    }
                    break;
                case 5:
                    String inputCodeSearch = BookView.inputNameBook();
                    List<Book> bookList1 = bookService.searchBook(inputCodeSearch);
                    for (int i = 0; i < bookList1.size(); i++) {
                        System.out.println(bookList1.get(i));
                    }
                    break;
                case 6:
                    flag=false;
            }
        }
    }

}
