import java.util.Scanner; 
/**
 * GCD
 */
public class GCD {

    public static void main(String[] args) {
        //create Scanner Object 
        Scanner input = new Scanner(System.in);

        //prompt the user to two number
        System.out.println("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();

        int gcd = GCD(n1, n2);

        System.out.println("GCD of number ("+n1+","+n2+") is "+gcd);
    }

    public static int GCD(int n, int m) {
        int d = 0;
        int gcd = 0;
        if (m > n) {
            d = n;
        } else {
          d = m; 
        }

        while (d >= 0) {
            if( n % d == 0 && m % d == 0) {
                gcd = d;
                break;
            }
            d = d - 1;
        }

        return gcd;
    }
}