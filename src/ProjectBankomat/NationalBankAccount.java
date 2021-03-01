package ProjectBankomat;

public class NationalBankAccount implements BankAccount{
    String fullName;
    int balance;
    String accountNumber;
    String pinCode;

    public NationalBankAccount () {}

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        balance = balance - credit;

    }

    @Override
    public void debetBalance(int debet) {
        balance = balance - debet;

    }

    @Override
    public String accountData() {
        return fullName + " " + ". Balance = " + balance + " " + accountNumber + " " + pinCode + " ";
    }
}
