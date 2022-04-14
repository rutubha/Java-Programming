class Exercise_18_4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("m(" + i +") = " + sumSeries(i));
        }
    }  
    public static double sumSeries(int i) {
        if(i == 1) {
            return 1.0;
        } else {
            return ((1.0) / (2 * i) ) + sumSeries(i - 1);
        }
    } 
}
