class SumSeries {
    public static void main(String[] args) {
        
        double sum = 0;
        for(int i = 1; i <= 50; i++) {
            double oddCom = (2 * i) - 1;
            double evenCom = (2 * i);
            if (oddCom <= 97)
             sum = sum + (oddCom / evenCom);
        }

        System.out.print(" The sum "+sum);
    }    
}
