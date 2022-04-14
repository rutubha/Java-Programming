class Transaction {
    private char type;
    private java.util.Date date;
    private double ammonut;
    private double balance;
    private String description;
    
    public Transaction(char type, double ammonut, double balance, String description){
        this.type = type;
        if(type == 'W') {
            this.balance = balance - ammonut; 
        } else {
            this.balance = balance + ammonut;
        }
        this.ammonut = ammonut;
        this.description = description;
        this.date = new java.util.Date();
    }

    public char getType() {
        return type;
    }

    public double getAmmonut() {
        return ammonut;
    }

    public double getBalance() {
        return balance;
    }

    public java.util.Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Date " + this.date + ", Balance " + this.balance + ", Amount " + this.ammonut + ",  Type " + (this.type == 'D' ? "Deposite" : "Withdraw");
    }
}
