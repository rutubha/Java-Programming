import java.math.BigInteger;
import java.util.Scanner;

class Exercise_18_7 {
    static int count = 1;
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user
        System.out.println("Enter the index of fibonaci: ");
        int index = input.nextInt();
        input.close();

        //Call ffibonacci
        BigInteger result = fibonacci(index);
        System.out.println("Fibonacci number at index " + index + " is " + result);
        System.out.println("Method is call " + count + " Times");
    }
    
    public static BigInteger fibonacci(int num) {
        BigInteger f0 = BigInteger.ZERO;
        BigInteger f1 = BigInteger.ONE;
        
        

        if(num == 0) {
            return f0;
        } else if(num == 1) {
            return f1;
        } else {
            count++;
            return fibonacci(num - 2).add(fibonacci(num - 1));
        }
    } 
}

