class NumberDivisible3Or4 {
    public static void main(String[] args) {
        //create count variable
        int count = 0;

        //create loop for find number divisible by 3 or 4
        for (int i = 100; i <= 200; i++) {
            if ( i % 3 == 0 || i % 4 ==0) {
                if (i % 4 == 0 && i % 3 ==0){

                }
                else{
                    System.out.printf("%d ", i);
                    count++;
                }
               
            }

            if ( count == 10) {
                System.out.println("");
                count = 0;

            }
        }

    }
}
