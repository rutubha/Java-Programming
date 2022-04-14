class TwinPrime {
    public static void main (String[] args) {
        int n1 = 0;
        int n2 = 0;
        int count = 0;
        int space = 0;
        for (int i = 2; i <= 1200; i++) {
            if (isPrime(i)) {
                if (count == 0) {
                    n1 = i;
                    count ++;
                } else {
                    n2 = i; 
                    count = 0;
                    twinPrime(n1, n2);
                    space ++;                   
                }   
            }
            if (space == 10) {
                System.out.println(" ");
                space = 0;
            }
        }
    }   
    public static boolean isPrime (int n) { 
        boolean result = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                result =  false;
            }
        }
        return result;
    }

    public static void twinPrime(int n1, int n2) {
        boolean result1 = isPrime(n1);
        boolean result2 = isPrime(n2);
        if  (result1 && result2 && (n2 - n1) == 2) {
            System.out.print("("+n1+","+n2+"),");
        } 
    }
}
