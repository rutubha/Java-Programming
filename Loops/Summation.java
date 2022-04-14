/**
 * Summation
 */
public class Summation {

    public static void main(String[] args) {
        //create variable
         double sum = 0;

        for( int i = 0; i < 1000; i++) {
            sum = sum + (1 / ( Math.sqrt(i) + Math.sqrt(i + 1)));
        }

        //Display the summation
        System.out.println("The summation of the given series is " + sum);
    }
}