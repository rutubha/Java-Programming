import java.util.Scanner;

class OccurenceOfCharcter { 
    public static void main (String[] args) { 
        //Create Scanner Object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the String
        System.out.println("Enter the String to found any charcter occurence in it :");
        String letter = sc.nextLine();
       /* System.out.println("Enter the charcter to find its occurence in string:");
        char character = sc.nextChar();*/

        char a = 'e';

        //Display the occurence of charcter in string
        System.out.println("The occurence of the charcter  is " +count(letter, a));
    }

    public static int count(String str, char a) {
        int count = 0;
        str = str.toUpperCase();
        a = Character.toUpperCase(a);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count = count + 1;
            }
        }

        return count;
    }
}