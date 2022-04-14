class Exercise_18_5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("m(" + i +") = " + sumSeries(i));
        }
    }   
    
    public static double sumSeries(int i) {
        if(i == 1) {
            return 2.0 / 3;
        } else {
            return ((2.0 * i) / ( 2 * i + 1)) + sumSeries(i - 1);
        }
    }
}
