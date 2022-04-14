import java.util.*;
class ComputingGCD {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner in = new Scanner(System.in);

        //prompt the user
        int[] number = new int[5];

        System.out.print("Enter the five number: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = in.nextInt();
        }

        //compute GCD
        System.out.println("GCd of numbers is "+GCD(number));

    }

    public static int GCD(int[] number) {
        int gcd = 1;
        boolean value = true;

        //find minimum number
        int min = number[0];

        for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }

        //compute gcd
        int n = min;
        //go for common diviser if n is not common diviser then decrease n
        do {
            
            //divide all number by n
            for (int i = 0; i < number.length; i++) {
               
                //if number[i] % n is not diviser than value become false so its consider that this is not common diviser
                if (number[i] % n != 0) {
                    value = false;
                } 
            } 

            //if all value for n is diviser than assign into gcd and break the loop
            if (value == true) {
                gcd = n;
                break;
            }

            //reset value for next loop
            value = true;  
            n--;
        } while (n != 0);

        return gcd;

    }

}
