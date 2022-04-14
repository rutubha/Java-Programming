class SumSeries {
    public static void main(String[] args) {
        series(20);
    }   
    public static void series(int number) {
        System.out.println("I\t\tm(i)");
        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + ((double)i/((double)i + 2));
            System.out.println(i+"\t\t"+String.format("%.4f", sum));  
        }
    } 
}
