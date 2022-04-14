class CountLeapYear {
    public static void main(String[] args) {
        int count_ten = 0;
        int count = 0;

        System.out.println("A Leap Year between 2014 to 2114 :");

        for ( int i = 2014; i <= 2114; i++) {
            if ( i % 4 == 0 ) {
                System.out.print(i+" ");
                count = count + 1;
                count_ten = count_ten + 1;
            }

            if ( count_ten == 10) {
                System.out.println(" ");
                count_ten = 0;
            }
        }
    }
    
}
