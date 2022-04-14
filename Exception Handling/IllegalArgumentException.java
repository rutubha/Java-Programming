import java.util.Scanner;

public class IllegalArgumentException extends Throwable {
    
    public static void main(String[] args) throws IllegalArgumentException{
        Scanner in = new Scanner(System.in);
        boolean continueInpute = true;

        do {
            System.out.println("Enter Annual Interest Rate: ");
            double annualInterestRate = in.nextDouble();
            System.out.println("Enter number of year: ");
            int numberOfYears = in.nextInt();
            System.out.println("Enter the loan amount: ");
            double loanAmount = in.nextDouble();
            in.close();

            try {
                Loan l = new Loan(annualInterestRate, numberOfYears, loanAmount);
                continueInpute = false;
                l.setAnnualInterestRate(-1);
                System.out.println("The Laon was create on " + l.getLoanAmount());
            }
            catch(IllegalArgumentException1 e) {
                System.out.println("Value is greater than 0" + e);
            }
        } while(continueInpute);
    }
}