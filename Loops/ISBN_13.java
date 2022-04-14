import java.util.Scanner; 
class ISBN_13 {
    public static void main(String[] args) {
        //Create Scanner Object 
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the isbn number first 12 digit\
        System.out.println("Enter the first 12 digit of of an ISBN-13 as a string:");
        String ISBN_12 = input.next();
        
        //compute the 13 digit
        int sum = 0;
        if ( ISBN_12.length() != 12) {
            System.out.println("Enter the valid ISBN number.");
        }
        else {
            for ( int i = 0; i < ISBN_12.length(); i++) {
                if ( i == 1 || i == 3 || i == 5 || i == 7|| i == 9 || i == 11 ) {
                    //if we convert char number ('8')to integer than its add 48 automatically (8 + 48 = 56)
                    //so in int '8' will be 56 so we subtrack with 48 to get orignal number 
                    sum = sum + 3 * (ISBN_12.charAt(i)-48);
                } else  {
                    sum = sum + (ISBN_12.charAt(i)-48);
                }  
            } 
            int checksum = 10 - (sum % 10);

            if ( checksum == 10) {
                System.out.println("The ISBN-13 number is "+ISBN_12+"0");
            } else {
                 System.out.println("The ISBN-13 number is "+ISBN_12+""+checksum);
            }
    
            }
        
        
    }
}
