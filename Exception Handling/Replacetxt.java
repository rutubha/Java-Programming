import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Replacetxt {
    public static void main(String[] args) throws Exception {
        
        //Check arguments are valid
        if(args.length != 3) {
            System.out.println("usage: java Exercise12_22 dir oldstring newString");
            System.exit(1);
        }

        File dir = new File(args[0]);

        //Check it is directory
        if(!dir.isDirectory()) {
            System.out.println(args[0] + " is not directory.");
            System.exit(2);
        }

        File[] files = dir.listFiles();

        //Replace string for each element in the array
        for(File e: files) {
            replaceTxt(e, args[1], args[2]);
        }
    }
    
    public static void replaceTxt(File file, String oldString, String newString) throws Exception{
        //Create arraylist to store the line of the files
        ArrayList<String> list = new ArrayList<>();

        //Read file and replace the oldstring with newString and add in the arraylist
        try(
            Scanner input = new Scanner(file);
        ) {
            while(input.hasNextLine()) {
                String s = input.nextLine();
                list.add(s.replaceAll(oldString, newString));
            }
        }

        //Save the change in file
        try (
            PrintWriter output = new PrintWriter(file);
        ) {
            for(int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
        }
    }
}
