package thi_module.model;

public class SavingsAccount extends BankAccount {
    protected int savingsAmount;
    protected String savingsDate;
    protected int interestRate;
    protected String term;

    public SavingsAccount() {
    }

    public SavingsAccount(int id, String code, String name, String accountCreationDate, int savingsAmount, String savingsDate, int interestRate, String term) {
        super(id, code, name, accountCreationDate);
        this.savingsAmount = savingsAmount;
        this.savingsDate = savingsDate;
        this.interestRate = interestRate;
        this.term = term;
    }

    public int getSavingsAmount() {
        return savingsAmount;
    }

    public void setSavingsAmount(int savingsAmount) {
        this.savingsAmount = savingsAmount;
    }

    public String getSavingsDate() {
        return savingsDate;
    }

    public void setSavingsDate(String savingsDate) {
        this.savingsDate = savingsDate;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getInfoToFile() {
        return this.getId() + "," + this.getCode()+","+this.getName()+","+this.getAccountCreationDate()+","+this.getSavingsAmount()+","+savingsDate+","+this.getInterestRate()+","+ getTerm();
    }
    @Override
    public String toString() {
        return "SavingsAccount{" +
                ", id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", accountCreationDate='" + accountCreationDate + '\'' +
                "savingsAmount=" + savingsAmount +
                ", savingsDate='" + savingsDate + '\'' +
                ", interestRate=" + interestRate +
                ", term='" + term + '\'' +
                '}';
    }
}
