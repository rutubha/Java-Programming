class Combination {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("All posibel combination between integer 1 to 7 is :");
        

        for (int i = 1; i <= 7; i++) {
            for ( int j = 1; j <= 7; j++) {
                if ( i < j) {
                    System.out.println(i+" "+j);
                    counter ++;
                } 
            }
        }

        System.out.println("The total combination is "+counter);
    }
}