import java.math.BigDecimal;
import java.math.BigInteger;

class MersennePrime {
    public static void main(String[] args) {
        
        System.out.println("p            p^2 - 1");
        for(int i = 2; i < 100; i++) {

            if(isPrime(i)) {
                System.out.println(i+"          "+mersennePrime(i));
            }
        }
    }
    
    public static boolean isPrime(long num) {

        long square = (long)Math.sqrt(num);
        for(long i = 2; i <= square; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;   
    }

    public static BigDecimal mersennePrime(int p) {
        return new BigDecimal(2).pow(p).subtract(BigDecimal.ONE);
    }
}
