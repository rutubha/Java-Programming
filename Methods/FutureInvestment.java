import java.util.Scanner;
class FutureInvestment {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);
        
        //prompt the user to enter the value
        System.out.println("Enter the Investment Amount: ");
        double amount = input.nextDouble();
        System.out.println("Enter the monthly Interest Rate: ");
        double interesrRate = input.nextDouble();
        interesrRate = interesrRate / (100 * 12);
        
        //Display the investment
        System.out.println("Year            Future Value");
        for(int i = 1; i <= 30; i++) {
            double investmentValue = futureInvestmentValue(amount, interesrRate, i);
            System.out.println(i + "              "+String.format("%.2f", investmentValue));
        }

       
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int year) {
        double investmentValue =  (investmentAmount * Math.pow(1 + monthlyInterestRate, year * 12));
        return investmentValue;
    }
}