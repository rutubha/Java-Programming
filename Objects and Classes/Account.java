import java.util.Calendar;

class Account {
    private int ID = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private String createdDate = "";
    
    Account() { 
        Calendar c = Calendar.getInstance();
        createdDate = c.get(Calendar.DAY_OF_MONTH)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR);
        System.out.println("Account created successfully on date "+createdDate);
    }

    public void setID(int iD) {
        this.ID = iD;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getID() {
        return this.ID;
    }

    double getMonthlyInterestRate() { 
        return (this.annualInterestRate / 12) / 100;
    }

    double getMonthlyInterest() { 
        return this.balance * getMonthlyInterestRate();
    }

    void withdraw(double balance) { 
        this.balance = this.balance - balance;
        System.out.println(balance+" successfully withdraw. Your balnce is "+this.balance);
    }

    void deposite(double balance) { 
        this.balance = this.balance + balance;
        System.out.println(balance+" successfully deposite. Your balnce is "+this.balance);
    }
}
