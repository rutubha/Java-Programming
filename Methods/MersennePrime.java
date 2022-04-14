class MersennePrime {
    public static void main(String[] args) {
        int i = 2;
        System.out.println("p\t\tp^2 - 1");
        while (i <= 31) {
            boolean value = isPrime(i);
            if (value) {
                System.out.println(i+"\t\t"+mersennerPrime(i));
            }
           i++;
        }
    }   
    public static double mersennerPrime (int number) {
        return Math.pow(2, number) - 1;
    } 
    public static boolean isPrime(int number) {
        for(int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            } 
        }
        return true;
    }
}
