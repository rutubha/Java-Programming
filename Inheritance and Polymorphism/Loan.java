class Loan {
    private double ammount;
    private int id;
    private static int branch_code = 82;
    
    public Loan() {
        this.ammount = 1000;
        this.id = 1;
    }

    public Loan(double ammount, int id) {
        this.ammount = ammount;
        this.id = id;
    }

    public double getLoanDetails() {
        return this.ammount;
    }

    public void clearLoanAmount(double ammount) {
        this.ammount -= ammount;
        System.out.println("Now your loan amount is $"+ ammount);    
    }

    @Override
    public String toString() {
        return "Amount " + this.ammount + ", id " + this.id + ", BrCOD " + Loan.branch_code;
    }
}
