import java.util.*;
class FinancialApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter th amount and loan period
        System.out.print("Enter the loan Amount :");
        double amount = input.nextDouble();
        System.out.print("Enter the loan period :");
        int period = input.nextInt();

        //print header of the table
        System.out.println("Interest Rate      Monthly Payment      Total payment");

        //declair variable 
        double increament_interest = 5;
        double monthly_payment = amount * (5 / 12);
        double total_payment = amount;
        int month = period * 12;

        //create loop to desplay result
        for ( int i = 2; i <= month; i++ ) {
            increament_interest = increament_interest +  ( 1 / 4);
            monthly_payment = monthly_payment ;
        }
    }
}
