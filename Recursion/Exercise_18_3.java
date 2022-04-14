import java.util.Scanner;

class Exercise_18_3 {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Prompt user
        System.out.println("Enter to number to find GCD: ");
        int m = input.nextInt();
        int n = input.nextInt();
        input.close();

        //result
        int result = gcd(m, n);
        System.out.println("GCD of number " + m + ", " + n + " is " + result);
    }
    
    public static int gcd(int m, int n) {
        if(m < n) {
            int temp = n;
            n = m;
            m = temp;
        }
        if(m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }
}
