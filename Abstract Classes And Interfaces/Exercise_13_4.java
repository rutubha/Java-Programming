import java.util.Calendar;
import java.util.GregorianCalendar;

class Exercise_13_4 {
        public static void main(String[] args) {
            //check java command line
            if(args.length !=2 ) {
                System.out.println("Usage: java Exercise_13_4 month year");
                System.exit(1);
            }

            //Create calender object
            Calendar calendar = new GregorianCalendar(Integer.valueOf(args[1]), Integer.valueOf(args[0]) - 1, 1);

            //Display calander header
            printHeader(calendar);

            //pad spac before the first day of the month
            for(int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
                System.out.print("    ");
            }
            //print day in month
            while(calendar.get(Calendar.DATE) < calendar.getActualMaximum(Calendar.DATE)) {

                if(calendar.get(Calendar.DAY_OF_WEEK) == 7) {
                    System.out.printf("%4d\n" , calendar.get(Calendar.DATE));
                } else {
                    System.out.printf("%4d", calendar.get(Calendar.DATE));
                }

                //Add a day
                calendar.add(Calendar.DATE, 1);
            }
            System.out.printf("%4d",calendar.get(Calendar.DATE));
        }

        public static void printHeader(Calendar calendar) {
            //create an array of the month names
            String[] months = {"january", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

            //Create a year and month 
            int length = 29 / 2 -(months[calendar.get(Calendar.MONTH)].length() / 2 + 3);
            System.out.println();
            for(int i = 0; i < length; i++) {
                System.out.print(" ");
            }
            System.out.println(months[calendar.get(Calendar.MONTH)] + ", " + calendar.get(Calendar.YEAR));


            //Print weak day names
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed THu Fri Sat");
        }
}
