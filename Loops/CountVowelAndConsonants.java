import java.util.Scanner;
class CountVowelAndConsonants {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the string
        System.out.println("Enter the string: ");
        String value = input.nextLine();

        //convert string into lowercase
        String string = value.toLowerCase();
       int  count_vowel = 0;
        int count_consonant = 0 ;

        //create for loop to scan string and count vowel and consonants
        for (int i = 0; i < value.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' ) {
                count_vowel = count_vowel + 1;
            } else if (string.charAt(i) == ' ') {
            
            } else {
                count_consonant = count_consonant + 1;
            }
        }

        //display the vowel and consonants
        System.out.println("The nummber of vowel is :"+count_vowel);
        System.out.println("The number of consonants is :"+count_consonant);
    }
}