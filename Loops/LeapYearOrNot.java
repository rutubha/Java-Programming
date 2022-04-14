import java.util.Scanner; 
class LeapYearOrNot {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the year
        int year = 0;
       do {
        System.out.println("Enter the year :");
         year = input.nextInt();
         if(year == -1) {
             System.out.println("Over.");
         }
         else {
            if ( year % 4 == 0){
                System.out.println("It is a leap year.\n");
            } else {
                System.out.println("it is not a leap year.\n");
            }
         }
       }while (year != -1);

       
       
      

    }
}
