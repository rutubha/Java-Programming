import java.math.BigInteger;
import java.util.Scanner;

class Exercise_18_2 {
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
    }
    
    public static BigInteger fibonacci(int index) {
        BigInteger currentFib = BigInteger.ZERO;
        BigInteger f0 = BigInteger.ZERO;
        BigInteger f1 = BigInteger.ONE;

        if(index == 0) {
            return f0;
        }
        if(index == 1) {
            return f1;
        }
        for(int i = 0; i < index - 1; i++) {
            currentFib = f0.add(f1);
            f0 = f1;
            f1 = currentFib;
        }

        return currentFib;
    }
}
