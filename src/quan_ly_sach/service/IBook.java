package quan_ly_sach.service;

import quan_ly_sach.model.Book;

import java.util.List;

public interface IBook {
    List<Book> getBookAll();

    void addBook(Book book);

    boolean editBook(String code,Book book);

    boolean deleteBook(String code);

    List<Book> searchBook(String code);

}
