import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_18_1 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Prompt user
        System.out.println("Enter the integer: ");
        int num = input.nextInt();
        input.close();

        //call factorial method
        BigInteger result = factorial(num);
        System.out.println("Factorial of the number " + num + " is " + result);
    }

    public static BigInteger factorial(int num) {
        if(num == 0) {
            return BigInteger.ONE;
        } else if (num == 1) {
            return BigInteger.ONE;
        } else {
            return new BigInteger(num + "").multiply(factorial(num - 1));
        }
    }
}