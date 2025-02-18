package thi_module.model;

public class PaymentAccount extends BankAccount {
    protected int cardNumber;
    protected int amount;

    public PaymentAccount() {
    }

    public PaymentAccount(int id, String code, String name, String accountCreationDate, int cardNumber, int amount) {
        super(id, code, name, accountCreationDate);
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getInfoToFile() {
        return this.getId() + "," + this.getCode()+","+this.getName()+","+this.getAccountCreationDate()+","+this.getAmount()+","+this.getCardNumber();
    }


    @Override
    public String toString() {
        return "--------PaymentAccount--------- " + "\n" +
                "id= " + id + "\n" +
                "cardNumber= " + cardNumber + "\n" +
                "name= " + name + "\n" +
                "date= " + accountCreationDate + "\n" +
                "amount= " + amount + "\n" +
                "code= " + code
                ;
    }
}
