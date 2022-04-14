import java.util.Scanner;
class DisplayCalender {
    public static void main(String[] args) {
        //create Scanner object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the year fisrt day and month
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter the month: ");
        int month = input.nextInt();
        System.out.println("Enter the first day of the month: ");
        int day = input.nextInt();

        String[] monthTable = {"January","Febuary","March","April","May","Jun","July","August","September","Octomber","November","December"};

        System.out.println("                "+monthTable[month - 1]+" "+year+"              ");
        System.out.println("-----------------------------------------");
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

        int month_day = 0;
        if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            month_day = 31;
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            month_day = 30;
        } else if ( month == 2 && year % 4 == 0) {
            month_day = 29;
        } else if ( month == 2 && year % 4 != 0) {
            month_day = 28;
        } else {
            System.out.print("Enter the correct month.");
        }
        if ( day > 0) {
            for (int j = 0; j < day; j++) {
                String space = "      ";
                System.out.print(space);
            }
           
        }
        int count = day;
        for (int i = 1; i <= month_day; i++){
            if ( i < 10) {
                System.out.printf(" %d    ",i);
            }
            else if ( i >= 10) {
                System.out.printf(" %d   ",i);
            }
           
            count = count + 1;
            if ( count == 7) {
                System.out.println(" ");
                count = 0;
            }
        }
    }
}
