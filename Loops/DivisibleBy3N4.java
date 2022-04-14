class DivisibleBy3N4 {
    public static void main(String[] args) {
        //create a varaible which is store Divisible number
         int number = 0;

          //create loop to find number divisible by 3 and 4
         for (int i = 100; i <= 1000; i++) {
            if (i % 3 == 0 && i % 4 ==  0) {
            System.out.printf("%d ", i);
            number++;
           }

           if ( number  == 10) {
               System.out.println();
               number = 0;
           }
        }

    }
    
}