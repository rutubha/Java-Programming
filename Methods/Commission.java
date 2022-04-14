class Commission {
    public static void main(String[] args) {
        System.out.println("Sales Amount\tCommission");
        int j = 10000;
        for(int i = 0; i < 20; i++){
            
            System.out.println(j+"\t\t"+computeCommission(j));
            j = j + 5000;
        }
    }   
    public static double computeCommission(int amount) {
        if(amount <= 5000) {
            return (amount * (6.0/100));
        }
        else if (amount > 5000 && amount <= 10000) {
            return ((5000) * (6.0/100) + (amount - 5000) * (8.0/100));
        } else {
            return (5000 * (6.0/100) + (5000) * (8.0/100) + (amount - 10000) * (10.0/100));
        }
    } 
}
