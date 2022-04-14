import java.util.Scanner;

class FirstDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year:");
        int year = input.nextInt();
        System.out.print("Enter the first day of year:");
        int first_day = input.nextInt();


        int []month = {1, 2, 3, 4, 5,  6, 7, 8, 9, 10, 11, 12};
        String []day = {"Sunday", "Monday", "Tuesday" , "wenensday", "THursday", "Friday", "Satureday"};
        int count = 0;

        System.out.println("The month 1 first day is " +day[first_day]);

        for (int j = 0; j <= 11; j++) {
            if (   month[j] == 3 ||  month[j] == 5 ||  month[j] == 7 ||  month[j] == 8  ||  month[j] == 10 ||  month[j] == 12  ){
                for (int i = 1; i <= 31; i++) {
                    count = count + 1;
                    if ( count == 7 ) {
                        count = 0;
                    }
                
               } 
               System.out.println("The month " + month[j] + " first day is " + day[count]);
            }    else if (   month[j] == 4 ||  month[j] == 6 ||  month[j] == 9 ||  month[j] ==11    ){
                for (int i = 1; i <= 30; i++) {
                    count = count + 1;
                    if ( count == 7 ) {
                        count = 0;
                    }
                }   
                 System.out.println("The month " + month[j] + " first day is " + day[count]);
                } 
                else if ( month[j] == 2 && year % 4 == 0) {
                    for (int i = 1; i <= 29; i++) {
                        count = count + 1;
                        if ( count == 7 ) {
                            count = 0;
                        }
                    }   
                     System.out.println("The month " + month[j] + " first day is " + day[count]);
                }  else if ( month[j] == 2 ) {
                    for (int i = 1; i <= 28; i++) {
                        count = count + 1;
                        if ( count == 7 ) {
                            count = 0;
                        }
                    }   
                     System.out.println("The month " + month[j] + " first day is " + day[count]);
                }
               
        }
        
    }      
       
 }
    

