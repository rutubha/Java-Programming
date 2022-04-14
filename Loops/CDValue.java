import java.util.Scanner;
class CDValue {
    public static void main(String[] args) {
        //Create an object of Scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the amount, interest and month
        System.out.print("Enter the initial deposite amount: ");
        int amount = input.nextInt();
        System.out.print("Enter annual percentage yeild: ");
        double interest = input.nextDouble(); 
        System.out.print("Enter maturity period ( number of months): ");
        int month = input.nextInt();

        double CD_value = amount;
        System.out.println("Month      CD Value");
        for(int i = 1; i <= month; i++) {
            CD_value = CD_value + (CD_value * interest) / 1200;
            System.out.println(i+"       "+String.format("%.2f", CD_value));
        }
    }
}