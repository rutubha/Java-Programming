import java.util.*;
import java.io.*;
class Exercise12_12 {
    public static void main(String[] args) throws Exception{
        
        //Check that argumant is proper or not
        if(args.length!=1) {
            System.out.println("Usage: filename");
            System.exit(1);
        }

        File fileName = new File(args[0]);
        if(!fileName.exists()) {
            System.out.println("Filename doent exist");
            System.exit(2);
        }

        try (Scanner input = new Scanner(fileName)) {
            int countChar = 0;
            int countWord = 0;
            while(input.hasNext()) {
                String line = input.next();
                countChar += line.length();
                countWord += 1;
            }

            System.out.println("The file size is " + countChar + " characters");
            System.out.println("The words in file is " + countWord);
        }

        try (Scanner input1 = new Scanner(fileName)) {
            int countLine = 0;
            while(input1.hasNextLine()) {
                countLine += 1;
            }

            System.out.println("The words in file is " + countLine);
        }
    }
}