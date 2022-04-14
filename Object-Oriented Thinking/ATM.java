class ATM{
    private int[] id = new int[10];
    private double[] balance = new double[10];
    
    ATM(){
        for(int i = 0; i < 10; i++){
            balance[i] = 100.0;
        }
    }

    int getId(int id){
        return this.id[id];
    }
    double getBalance(int id){
        return balance[id];
    }

    void deposite(double value, int id){
        balance[id] = balance[id] + value;
    }

    void withdraw(double value, int id){
        balance[id] = balance[id] - value;
    }
}