package thi_module.model;

public abstract class BankAccount {
    protected  int id;
    protected String code;
    protected String name;
    protected String accountCreationDate;

    public BankAccount() {
    }

    public BankAccount(int id, String code, String name, String accountCreationDate) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.accountCreationDate = accountCreationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(String accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date='" + accountCreationDate + '\'' +
                '}';
    }
}
