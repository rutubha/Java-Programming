class EstimatePIE {
    public static void main (String [] args) {
        System.out.println("i\t\tm(i)");
        System.out.println("_______________________________");
        estimatePIE();;
    }
    public static void estimatePIE () {
        double sum = 0;
        int j = 1;
        for(int i = 0; i <= 901; i++) {
            sum = sum + ((Math.pow(-1, i+1))/(2 * i - 1));
            if(i == j) {
                System.out.println(i+"\t\t"+String.format("%.4f", 2 * (sum)));
                j = j + 100;
            }
            
        }
    }
}