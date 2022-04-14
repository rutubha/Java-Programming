import java.util.Scanner; 
class VerifyLeapYear {
    public static void main (String[] args) {
         //Create Scanner Object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the year 
        int year = 0;
         System.out.println("Enter the year to find its Leap year or not and -1 to end your queary.");
        do {
        System.out.print("Enter the year: ");
         year = sc.nextInt();
         if (leapYearOrNot(year)) {
             System.out.println(year+" is leap year");
         } else if (year == -1) {
            System.out.println("your query is end");
         }  else {
             System.out.println(year +" is not leap year");
         }
        } while (year != -1);
    }

    public static boolean leapYearOrNot(int year) {
        boolean condition;
        if ( year % 4 == 0) {
            condition = true;
        } else {
            condition = false;
        }
        return condition;
    }
   
}
