import java.io.File;
import java.util.Scanner;

class OccurenceOfLetter {
    public static void main(String[] args) throws Exception{

        //prompt the user enter the file name
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        File file = new File(in.next());
        in.close();

        //check file exists or not
        if(!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        //read file 
        int[] count = new int[26];
        try (Scanner input = new Scanner(file)) {
            while(input.hasNext()) {
                String line = (input.nextLine()).toUpperCase();
                countLetters(count, line);
            }
        }

        //PrintLetter
        for(int i = 0; i < count.length; i++) {
            System.out.println("Number of " + (char)('A' + i) + "\'s: " + count[i]);
        }
    }    

    public static void countLetters(int[] count, String str) {
        for(int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                count[(int)(str.charAt(i) - 'A')]++;
            }
        }
    }
}
