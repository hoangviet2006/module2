package quan_ly_thu_vien.controller;

import quan_ly_thu_vien.model.Book;
import quan_ly_thu_vien.model.Client;
import quan_ly_thu_vien.service.BookService;
import quan_ly_thu_vien.service.ClientService;
import quan_ly_thu_vien.view.BookView;
import quan_ly_thu_vien.view.ClientView;

import java.util.List;
import java.util.Scanner;

public class ClientController {
    public static Scanner scanner = new Scanner(System.in);
    BookService bookService = new BookService();
    ClientService clientService = new ClientService();

    public void display() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản Lý Khách Hàng" +
                    "\n 1. Hiển Thị sách đã Thuê" +
                    "\n 2. Thuê sách" +
                    "\n 3. Sửa sách" +
                    "\n 4. Xóa sách" +
                    "\n 5. Tìm Kiếm sách đã thuê" +
                    "\n 6. Quay lại menu chính");
            System.out.println("Chọn Chức Năng");
            int count;
            while (true){
                try {
                    count = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Lỗi không phải số");
                }
            }
            switch (count) {
                case 1:
                    List<Client> clients = clientService.getAll();
                    for (int i = 0; i < clients.size(); i++) {
                        System.out.println(clients.get(i));
                    }
                    break;
                case 2:
                    Client client = ClientView.inputClient();
                    clientService.addClient(client);
                    break;
                case 3:
                    String inputBookTitleEdit = ClientView.InputBookTitle();
                    Book newBook = BookView.inputBook();
                    boolean checkEdit = bookService.editBook(inputBookTitleEdit, newBook);
                    if (checkEdit) {
                        System.out.println("Chỉnh sửa thành công");
                    } else {
                        System.out.println("Không tìm thấy tên sách");
                    }
                    break;
                case 4:
                    String inputBookTitleDelete = ClientView.InputBookTitle();
                    boolean checkDelete = bookService.deleteBook(inputBookTitleDelete);
                    if (checkDelete) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Không tìm thấy tên sách");
                    }
                    break;
                case 5:
                    String inputBookTitleSearch = ClientView.InputBookTitle();
                    clientService.searchBook(inputBookTitleSearch);
                    break;
                case 6:
                    flag = false;
            }

        }
    }
}
