import java.util.Scanner; 
class ISBN_loop {
    public static void main(String[] args) {
        //create Scanner object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the first 9 digit of ISBN number
        System.out.print("Enter the first 9 digit of ISBN number : ");
        int isbn_9digit = input.nextInt();

        int divisor = 100000000;
        int last_digit = 0;
        int digit = 0;
        //create loop to compute last digit
        for (int i = 1; i <= 9; i++) {
            digit = isbn_9digit / divisor;
            digit = digit % 10;
            last_digit = last_digit + (digit * i);
            divisor = divisor / 10;
          
        }

        last_digit = last_digit % 11;

        if ( last_digit == 10) {
            System.out.println("Your ISBN number is " +isbn_9digit + "x");
        } else {
            System.out.println("Your ISBN number is " +isbn_9digit+""+last_digit);
        }

    }
}
