class ComputeFutureTution {
    public static void main(String[] args) {
    
        double fees = 10000;
        double increament = 0.06;
        double feesIncreament = 0;
        

        System.out.println( 1 + "st year fee is  $" + fees);
        for ( int i = 2; i <= 10; i++ ) {
            feesIncreament = fees * increament;
            fees = fees + feesIncreament;
            System.out.println( i + "th year fee is  $" + fees);
            
        }
        double totalFees = fees;
        double sum = 0;
         //after ten four year worth
         for ( int j = 1; j <= 4; j++) {
            
              totalFees = totalFees + (totalFees * increament);
             sum = sum + totalFees;
         }
         System.out.println("\n\nAfter ten year four year worth is "+ sum);
    }
}