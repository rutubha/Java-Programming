import java.math.BigInteger;
import java.util.Scanner;

class Exercise_13_19 {
    public static void main(String[] args) {
        //Scanner object
        Scanner in = new Scanner(System.in);

        //prompt the user to entr the decimal value
        System.out.println("enter the decimal number: ");
        String[] decimal = in.nextLine().split("[.]");
        

       //Create the rational number of integer part
        RationalBigInteger r1 = new RationalBigInteger(new BigInteger(decimal[0]), BigInteger.ONE);


        //Create the rational number of fractional part
        RationalBigInteger r2 = new RationalBigInteger(new BigInteger(decimal[1]), new BigInteger(String.valueOf((int)Math.pow(10, decimal[1].length()))));

        //Display rational number
        System.out.println("The fraction number is: " + (decimal[0].charAt(0) == '-' ? r1.subtract(r2) : r1.add(r2)));
        in.close();
    }    
}
