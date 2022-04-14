import java.util.Scanner;
class Phonekeypad {
    public static void main (String[] args) { 
        //create a Scanner object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the string
        System.out.println("Enter the string to conver in number:");
        String letter = sc.nextLine();

        String uppercaseLetter = letter.toUpperCase();
        String number = " ";

        //create for loop to find the number equivalent to its character
        for (int i = 0; i < uppercaseLetter.length(); i++) {
            if(Character.isLetter(uppercaseLetter.charAt(i))) {
                number = number + getNumber(uppercaseLetter.charAt(i));
            } else {
                number = number + uppercaseLetter.charAt(i);
            }
        }

        //print the number
        System.out.println("your number is "+number);
    }   

    //create a method to convert letter into the number
    public static int getNumber(char uppercaseLetter) {
        int number = 0;
        if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C') {
            number = 2;
        } else  if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F') {
            number = 3;
        } else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I') {
            number = 4;
        }else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L') {
            number = 5;
        }else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O') {
            number = 6;
        }else if (uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'P' || uppercaseLetter == 'S') {
            number = 7;
        }else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V') {
            number = 8;
        }else if (uppercaseLetter == 'W' || uppercaseLetter == 'X' || uppercaseLetter == 'Y' || uppercaseLetter == 'Z') {
            number = 9;
        } else {
            number = 0;
        }

        return number;
    }    
}
