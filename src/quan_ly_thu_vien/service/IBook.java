package quan_ly_thu_vien.service;

import quan_ly_thu_vien.model.Book;

import java.util.List;

public interface IBook {
    List<Book> getBookAll();

    void addBook(Book book);

    boolean editBook(String code, Book book);

    boolean deleteBook(String code);

    List<Book> searchBook(String nameBook);

}
