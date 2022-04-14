class Loan{ 
    double annualInterestRate;
    double loanAmount;
    int numberOfYears;
    java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){ 
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException1 {
        if(annualInterestRate <= 0) {
            throw new IllegalArgumentException1("interest must be greater than 0");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) throws IllegalArgumentException1 {
        if(loanAmount <= 0) {
            throw new IllegalArgumentException1("Amount must be greater than 0");
        }
        this.loanAmount = loanAmount;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException1 {
        if(numberOfYears <= 0) {
            throw new IllegalArgumentException1("Year must be greater than 0");
        }else {

            this.numberOfYears = numberOfYears;
        }
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class IllegalArgumentException1 extends Exception {
    IllegalArgumentException1 (String exceptionTxt) {
        super(exceptionTxt);
    }
}

