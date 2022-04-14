class HeadOrTail {
    public static void main(String[] args) {
        //create counter variable for head and tails
        int counter_head = 0;
        int counter_tail = 0;
        
        for ( int i = 1; i <= 2000000; i++) {
            int coin_flip =  1 + (int)(Math.random() * 2 );

            //increament counter for head or tail
            //if coin_flip = 1 then head otherwise tail

            if ( coin_flip == 1) {
                counter_head ++;
            } else if ( coin_flip == 2) {
                counter_tail ++;
            }
        }

        System.out.println("Flipping coint two million times and we have found --");
        System.out.println("Number head " + counter_head);
        System.out.println("Number tail " + counter_tail);

    }    

}
