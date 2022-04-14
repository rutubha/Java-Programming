class PalindromePrime {
    public static void main (String[] args) { 
        int count = 0;
        int i = 2;

        while (count <= 120) {
            boolean prime = isPrime(count);
            boolean palindrome = isPalindromeNumber(count);

            if (prime  && palindrome) {
                System.out.print(i+" ");
                count++;
            }

            if(count % 10 == 0) {
                System.out.println(" ");
            }
            i++;
        }
    }
    public static boolean isPrime(int n) {
        for(int i = 2; i <= n / 2; i++) {
            if( n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeNumber(int n) {
        int digit = 0;
        int temp = n;
        while(n != 0) {
            digit = digit * 10;
            digit = digit + (n % 10);
            n = n / 10;
        }

        if (digit == temp) {
            boolean i = isPrime(digit);
            if (i) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
