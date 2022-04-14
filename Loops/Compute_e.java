class Compute_e {
    public static void main(String[] args) {
        double sum = 0;
        long fact = 1;
        for (int i = 1; i <= 100000; i++) {
            fact = 1 * i;
            sum = sum + (1 / fact);
            if ( i == 10000 || i == 20000 || i == 30000 || i == 40000 || i == 50000 || i == 60000 || i == 70000 || i == 80000 || i == 90000 || i == 100000) {
                System.out.print("\nthe 'e' for value "+ i +" is " + (sum));
            }
        }
     }
            
}    

