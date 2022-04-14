import java.util.ArrayList;

class Account { 
    private int id;
    private double balance;
    private static double annualInterestRate = 7.2;
    private java.util.Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.dateCreated = new java.util.Date();
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new java.util.Date();
    }

    public double getBalance() {
        return balance;
    }
    public int getId() {
        return id;
    }

    

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (Account.annualInterestRate / 12.0);
    }

    public double getMonthlyInterest() {
        return ((Account.annualInterestRate / 100.0) / 12.0 ) * this.balance;
    }

    public void withdraw(double ammonut, String description) {
        if(this.balance - ammonut > 0) {
            transactions.add(new Transaction('W', ammonut, this.balance, description));
            this.balance = this.balance - ammonut;
        System.out.println("Your balance is "+this.balance);
        } else {
            System.out.println("Sorry, Inefficeint Balance.");
        } 
    }

    public void deposit(double ammonut, String description) {
        transactions.add(new Transaction('D', ammonut, this.balance, description));
        this.balance = this.balance + ammonut;
        System.out.println("Your balance is "+this.balance);
    }

    public void withdraw(double ammonut) {
        if(this.balance - ammonut > 0) {
            this.balance = this.balance - ammonut;
        System.out.println("Your balance is "+this.balance);
        } else {
            System.out.println("Sorry, Inefficeint Balance.");
        } 
    }

    public void deposit(double ammonut) {
        this.balance = this.balance + ammonut;
        System.out.println("Your balance is "+this.balance);
    }


    @Override
    public String toString() {
        return "Account \n  Id = " + this.id + "\n  Balance = " + this.balance + 
                "\n  AnnualInterestRate = " + Account.annualInterestRate + "\n  Created Date = " + this.dateCreated;
    }
}