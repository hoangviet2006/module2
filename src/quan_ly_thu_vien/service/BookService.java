package quan_ly_thu_vien.service;

import quan_ly_thu_vien.model.Book;
import quan_ly_thu_vien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class BookService implements IBook {
    private final String BOOK_FILE = "D:\\codegym\\module2\\src\\quan_ly_thu_vien\\data\\book.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Book> getBookAll() {
        List<Book> bookList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(BOOK_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Book book = new Book(Integer.parseInt(array[0]), array[1], array[2], Integer.parseInt(array[3]));
            bookList.add(book);
        }
        return bookList;
    }

    @Override
    public void addBook(Book book) {
        List<String> stringList = new ArrayList<>();
        stringList.add(book.getInforToFile());
        ReadAndWriteFile.writeFile(BOOK_FILE,stringList, APPEND);
    }

    @Override
    public boolean editBook(String code, Book book) {
        List<Book> bookList = getBookAll();
        for (int i = 0; i < bookList.size(); i++) {
            if (code.equals(bookList.get(i).getCode())){
                bookList.set(  i,book);
                break;
            }
        }
        List<String> stringList =new ArrayList<>();
        for (Book book1: bookList){
            stringList.add(book1.getInforToFile());
        }
        ReadAndWriteFile.writeFile(BOOK_FILE,stringList,NOT_APPEND);
        return true;
    }

    @Override
    public boolean deleteBook(String code) {
        List<Book> bookList = getBookAll();
        boolean check =false;
        for (int i = 0; i < bookList.size(); i++) {
            if (code.equals(bookList.get(i).getCode())){
                check  =true;
                bookList.remove(i);
                break;
            }
        }
       if (check){
           List<String> stringList = new ArrayList<>();
           for (Book book:bookList){
               stringList.add(book.getInforToFile());
           }
           ReadAndWriteFile.writeFile(BOOK_FILE,stringList,NOT_APPEND);
       }
        return false;
    }

    @Override
    public List<Book> searchBook(String code) {
        List<Book> bookList = new ArrayList<>();
        List<Book> list = getBookAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().contains(code)){
                bookList.add(list.get(i));
            }
        }
        return bookList;
    }
}
