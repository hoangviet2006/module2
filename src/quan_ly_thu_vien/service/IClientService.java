package quan_ly_thu_vien.service;

import quan_ly_thu_vien.model.Client;

import java.util.List;

public interface IClientService {
    List<Client> getAll();

    void addClient(Client client);

    boolean editBook(String bookTitle, Client client);

    boolean deleteBook(String bookTitle);

    List<Client> searchBook(String bookTitle);
}
