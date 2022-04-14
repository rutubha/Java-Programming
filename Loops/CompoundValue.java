import java.util.Scanner; 
class CompoundValue {
    public static void main(String[] args) {
       //create Scanner Object 
       Scanner input = new Scanner(System.in);

       //prompt the user to enter the amount, interest and month
       System.out.print("Enter the Amount (e.g 100): ");
       int amount = input.nextInt();
       System.out.print("Enter the Interest(e.g 3.75): ");
       double interest = input.nextDouble();
       System.out.print("Enter the Month (e.g 6): ");
       int month = input.nextInt();
       
       //compute monthly interest
       double monthly_interset = (interest / 100) / 12;

       double saving = 100;

       //compute every month saving and display total
       for ( int i = 1; i <= month; i++) {
           if ( i == 1) {
            saving = saving * ( 1 + monthly_interset);
           } else    {
            saving =(amount + saving) *  ( 1 +  monthly_interset) ;
           }
            
       }

       System.out.println("After the "+month+" month your saving amount is $"+saving);
       
    }
}
