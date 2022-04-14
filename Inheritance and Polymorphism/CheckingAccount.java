class CheckingAccount  extends Account {
    private double overDraft = 0;
    public CheckingAccount() {
        super();
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double ammonut) {
        if(this.getBalance() - ammonut > 0) {
            super.withdraw(ammonut);
        } else {
            this.overDraft = this.getBalance() - ammonut;
            this.setBalance(this.overDraft);
            System.out.println("Your account is overdraft");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Checking Account";
    }
}
