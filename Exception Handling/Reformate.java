import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Reformate {
    public static void main(String[] args) throws Exception{
        
        if(args.length != 2) {
            System.out.println("Usage: java sourcecode_filename");
            System.exit(1);    
        }

        File sourceCode = new File(args[1]);
        if(!sourceCode.exists()) {
            System.out.println("Source code file does not exist");
            System.exit(2);
        }

        ArrayList<String> str = new ArrayList<>();
        
        try (Scanner input = new Scanner(sourceCode);) {
            String s1 = input.nextLine();
            while(input.hasNext()) {
                String s2 = input.nextLine();
                if(s2.length() > 0 && s2.charAt(s2.length() - 1) == '{') {
                    str.add(s1.concat(" {"));
                    s1 = input.nextLine();
                    System.out.println("if run");
                } else {
                    str.add(s1);
                    s1 = s2;
                    System.out.println("else run");
                }       
            } 
            str.add(s1);
        }

        try (PrintWriter output = new PrintWriter(sourceCode); ) {
            for(int i = 0; i < str.size(); i++) {
                output.println(str.get(i));
            }
        }
    }    
}
