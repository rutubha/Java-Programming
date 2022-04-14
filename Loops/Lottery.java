import java.util.Scanner;
class Lottery {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the lottery's two number
        System.out.print("Enter yout lottery numbers digit: ");
        int digit = input.nextInt();

        //Generate two digit which not equals to
        int first_digit = (int)(Math.random() * 10 );
        int second_digit = (int)(Math.random() * 10);

        if (first_digit == second_digit) {
            second_digit = (int)(Math.random() * 10);
        }

        System.out.println("Lottery number is "+first_digit +second_digit);

        //compare the lottery Digit 
        int lotteryDigit1 = digit / 10;
        int lotteryDigit2 = digit % 10;
         if (lotteryDigit1 == first_digit && lotteryDigit2 == second_digit) {
             System.out.print("Exact match: you win $10,000");
         } else if (lotteryDigit1 == second_digit && lotteryDigit2 == first_digit) {
             System.out.print("Match all digit: you win $3,000");
         } else if (lotteryDigit1 == first_digit || lotteryDigit1 == second_digit || lotteryDigit2 == first_digit || lotteryDigit2 == second_digit) {
             System.out.print("Match one digit: you win $1,000");
         } else {
             System.out.print("sorry, no match");
         }
    }
}