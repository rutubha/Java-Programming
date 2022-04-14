class Exercise_18_6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("m(" + i +") = " + sumSeries(i));
        }
    }   
    
    public static double sumSeries(int i) {
        if(i == 1) {
            return 1.0 / 3;
        } else {
            return (i / (i + 2.0)) + sumSeries(i - 1);
        }
    }
}
