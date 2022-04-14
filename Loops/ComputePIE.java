class ComputePIE {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100000; i++) {
            sum = sum + Math.pow(-1, i + 1) / (2 * i - 1);
            if ( i == 10000 || i == 20000 || i == 30000 || i == 40000 || i == 50000 || i == 60000 || i == 70000 || i == 80000 || i == 90000 || i == 100000) {
                System.out.print("\nthe PIE for value "+ i +" is " + (4 * sum));
            }
        }
     }
            
}    

