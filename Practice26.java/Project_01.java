interface Transaction{
    void deposit(double amount);
    void withdraw(double amount);

    default void printReceipt(){
        System.out.println("Transaction Successful!");
    }
}

abstract class Account{
    private long accountNumber;
    private String holderName;
    private double balance;

    Account(long accountNumber, String holderName, double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void displayAccount();
}

class SavingsAccount extends Account implements Transaction {
    private double interestRate;

    SavingsAccount(long accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount){
        setBalance(getBalance()+amount);
        System.out.println("Deposit: " + amount);
        System.out.println("Current Balance: " + getBalance());
    }

    @Override
    public void withdraw(double amount){
        setBalance(getBalance()-amount);
        System.out.println("Withdraw: " + amount);
        System.out.println("Current Balance: " + getBalance());
    }

    @Override
    public void displayAccount(){
        System.out.println("----------Saving Account---------");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Holder Name: " + getHolderName());
        System.out.printf("Balance: %.2f%n", getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
class CurrentAccount extends Account implements Transaction {
    private double overdraftLimit;

    CurrentAccount(long accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit: " + amount);
        System.out.println("Current Balance: " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw: " + amount);
        }
        else{
            System.out.println("!!!--Insufficient Balance--!!!");

            }
        }

    @Override
    public void displayAccount() {
        System.out.println("---------Current Account----------");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Holder Name: " + getHolderName());
        System.out.printf("Balance: %.2f%n", getBalance());
        System.out.println("Overdraft Limit: " + overdraftLimit);

    }

}
public class Project_01 {
    public static void main(String[] args) {

        Account a1 = new SavingsAccount(1250895745L, "Abdullah Shaikh", 10000, 12.0);
        SavingsAccount s = (SavingsAccount)a1;
        System.out.println(s.getInterestRate());

        System.out.println();

        Account a2 = new CurrentAccount(1250895745L, "Abdullah Shaikh", 10000, 12.0);
        a2.displayAccount();

        Transaction t  = new SavingsAccount(1250895745L, "Abdullah Shaikh", 10000, 12.0);
        t.deposit(300);
        t.withdraw(2000);
        t.printReceipt();
    }
}




