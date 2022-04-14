class PerfectNumber {
    public static void main(String[] args) {
        int divisor = 0;
        System.out.println("A perfect integer between 1 to 10000 is ");
        for ( int i = 1; i <= 10000; i++) {
            for( int j = 1; j < i; j++) {
                if ( i % j == 0 ) {
                    
                    divisor = divisor +  j;
                } 
           
            }
            if ( i == divisor) {
                System.out.print(i+"  ");
            }
            divisor = 0;    
        }
    }
}