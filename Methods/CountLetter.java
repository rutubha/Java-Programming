import java.util.Scanner;
class CountLetter { 
    public static void main (String [] args) {
        //Create Scanner object 
        Scanner sc = new Scanner(System.in);

        //propmt the user to enter a string
        System.out.println("Enter the string :");
        String letter = sc.nextLine();

        //invok the countLetter() method and count letter in the string
        int letter_count = countLetter(letter);

        //Display the letter count
        System.out.println("your string has hold "+letter_count +" letter");
    }

    //write a method to count letter in string 
    public static int countLetter(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                count = count + 1;
            }
        }
        return count;
    }
}