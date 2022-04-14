class SavingAccount extends Account {
    public SavingAccount() {
        super();
    }

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return super.toString() + "" +"\n  Saving Account";
    }
}
