package quan_ly_thu_vien.service;

import quan_ly_thu_vien.model.Client;
import quan_ly_thu_vien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ClientService implements IClientService {
    private final String CLIENT_FILE = "D:\\codegym\\module2\\src\\quan_ly_thu_vien\\data\\Client.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(CLIENT_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Client client = new Client(array[0],array[1], array[2], Integer.parseInt(array[3]));
            clients.add(client);
        }
        return clients;
    }

    @Override
    public void addClient(Client client) {
        List<String> stringList = new ArrayList<>();
        stringList.add(client.getInforToFile());
        ReadAndWriteFile.writeFile(CLIENT_FILE, stringList, APPEND);
    }

    @Override
    public boolean editBook(String bookTitle, Client client) {
        List<Client> list = getAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBookTitle().equals(bookTitle)) {
                list.set(i,client);
                break;
            }
        }
        List<String> stringList =new ArrayList<>();
        for (Client s: list){
            stringList.add(s.getInforToFile());
        }
        ReadAndWriteFile.writeFile(CLIENT_FILE,stringList,NOT_APPEND);
        return true;
    }

    @Override
    public boolean deleteBook(String bookTitle) {
        List<Client> clients  = getAll();
        boolean check = false;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getBookTitle().equals(bookTitle)){
                check = true;
                clients.remove(i);
                break;
            }
        }
        if (check){
            List<String> list = new ArrayList<>();
            for (Client client: clients){
                list.add(client.getInforToFile());
            }
            ReadAndWriteFile.writeFile(CLIENT_FILE,list,APPEND);
        }
        return false;
    }

    @Override
    public List<Client> searchBook(String bookTitle) {
        List<Client> clients = new ArrayList<>();
        List<Client> clientList = getAll();
        for (int i = 0; i < clientList.size(); i++) {
            if (clientList.get(i).getBookTitle().contains(bookTitle)){
                clients.add(clientList.get(i));
                break;
            }
        }
        return clients;
    }
}
