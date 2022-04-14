import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Replace {
    public static void main(String[] args) throws Exception{
        //Check argument is correct
        if(args.length != 3) {
            System.out.println("Usage: java programName Filename oldString newString");
            System.exit(1);
        }

        //Checkc file exists or not
        File fileName = new File(args[0]);
        if(!fileName.exists()) {
            System.out.println("File does not exists.");
            System.exit(2);
        }

        ArrayList<String> str = new ArrayList<>();
        try (Scanner input = new Scanner(fileName)) {
            while(input.hasNextLine()) {
                String s1 = input.nextLine();
                if(s1.contains(args[1])) {
                    str.add(s1.replaceAll(args[1], args[2]));
                } else {
                    str.add(s1);
                }
            }
        }

        File newFile = new File("Exercise12_16_new.txt");
        try( PrintWriter output = new PrintWriter(newFile)) {
            for(int i = 0; i < str.size(); i++) {
                output.println(str.get(i));
            }
        }
    }
}