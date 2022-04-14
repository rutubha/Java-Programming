import java.util.Scanner;
class FormatAnInteger {
    public static void main (String[] args ) {
        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the number and width of the number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the width of the integer : ");
        int width = sc.nextInt();

        //invok the method to get format of the integer 
        String string_integer = format(number, width);

        //Display the result of integer format
        System.out.print("Format of the intger is "+string_integer);

    }

    public static String format(int number, int width) {
        String number_string = Integer.toString(number);
        int length = number_string.length();
        if (length < width) {
            for(int i = 1; i <= (width - length); i++) {
                number_string = 0 + number_string;
            }
        }
        return  number_string;
    }
}
