class CancellationErroe {
    public static void main(String[] args) {
        double sum = 1;
        for(int i =1; i<=50000; i++) {
            sum = sum + (1/(1+i));
        }
        double sum1= 1/50000;
        for (int j = 49999; j>=2;j--) {
            sum1 = sum1 + (1/(j-1));
        }

        System.out.print("sum left to right ="+sum+"\n sum right to left ="+sum1);
    }
    
}
