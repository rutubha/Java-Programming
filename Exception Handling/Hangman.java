import java.util.*;
import java.io.*;

class Hangman {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        
        String play;

        do {
            
            //Generate a random world
            char[] word = getWord();

            //Display word int the word as an asterisk
            char[] asterisks = new char[word.length];
            fillAsterisks(asterisks);

            int missed = 0; //Number of wrong guess

            do {
                //Promt the user to guess one letter
                char guess = getGuess(asterisks);

                //Check if is letter is correct
                if(!isCorrectGuess(word, asterisks, guess)) {
                    missed++;
                }
            } while (!isWordFinish(asterisks));

            //Print results
            print(word, missed);

            //ask user to play with another word
            System.out.println("Do you want to guess another word? Enter y or n >");
            play = in.next();

        } while (play.charAt(0) == 'y');
        in.close();
    }

    public static char[] getWord() throws FileNotFoundException {
        //Create File Object
        File file = openFile();

        //Create an ArrayList
        ArrayList<String> word = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while(input.hasNext()) {
                word.add(input.next());
            }
        }

        //Pick any random word from arrayList "word"
        String pick = word.get((int)(Math.random() * word.size()));

        //Convert String into char array
        char[] charArray = pick.toCharArray();

        return charArray;
    }

    public static File openFile() throws FileNotFoundException {
        File file = new File("hangman.txt");

        //Check file exists

        if(!file.exists()) {
            System.out.println("File " + file.getName() + " does not exists");
            System.exit(1);
        }

        return file;
    }

    public static void fillAsterisks(char[] list) {
        for(int i = 0; i < list.length; i++) {
            list[i] = '*';
        }
    }

    public static char getGuess(char[] asterisks) {
        Scanner in = new Scanner(System.in);
        System.out.print("(Guess) Enter a letter in word ");
        System.out.print(asterisks);
        System.out.print(" > ");
        String g = in.next();
        in.close();
        return g.charAt(0);
    }

    public static boolean isCorrectGuess(char[] word, char[] blanks, char guess) {
        boolean correct = false;
        int message = 2;
        for(int i = 0; i < word.length; i++) {
            if(word[i] == guess) {
                correct = true;
                if(blanks[i] == guess) {
                    message = 1;
                } else {
                    blanks[i] = guess; //Actual letter is placed
                    message = 0;
                }
            }
        }
        if(message > 0) {
            print(message, guess);
        }
        return correct;
    }

    public static void print(int message, char guess) {
        System.out.print("\t" + guess);
        switch (message) {
            case 1: System.out.println(" is already in the word"); break;
            case 2: System.out.println(" is not in the word");
                
                break;
        
            default:
                break;
        }
    }

    public static boolean isWordFinish(char[] blanks) {
        for(char e: blanks) {
            if( e == '*' ) {
                return false;
            }
        }

        return true;
    }

    public static void print(char[] word, int missed) {
        System.out.print("the word is ");
        System.out.print(word);
        System.out.println(" you missed " + missed + (missed > 1 ? " times" : " time"));
    }
}