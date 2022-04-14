import java.util.Scanner;
class CheckPassword {
    public static void main(String[] args) {
        //create Scanner object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the password
        System.out.println("Enter the password :");
        String password = sc.nextLine();

        //Display wether its correct password or not
        checkPassword(password);
    }
    public static void checkPassword(String password) {
        int digitCount = 0;
        int letterCount = 0;
        int symbolCount = 0;
        if (password.length() == 10) {
            for (int i = 0; i < password.length(); i++) {
               if(Character.isDigit(password.charAt(i))) {
                   digitCount = digitCount + 1;
               } else if (Character.isLetter(password.charAt(i))) {
                   letterCount = letterCount + 1;
               } else {
                   symbolCount = symbolCount + 1;
               }
            }

            if (symbolCount > 0 || digitCount < 3) {
                System.out.println("This password is not valid.\nPassword must contain at least three digit and symbol not allow.");
            } else {
                System.out.println("This password is valid.");
            }
        }
        else {
            System.out.println("This password is not valid.\nPassword must contain 10 character.");
        }
    }
}