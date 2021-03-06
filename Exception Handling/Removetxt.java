import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Removetxt {
    public static void main(String[] args) throws Exception {
        if(args.length != 4) {
            System.out.println("Usege: java Exrecise John filename");
            System.exit(1);
        }

        File sourceFile = new File(args[3]);
        if(!sourceFile.exists()) {
            System.out.println("source File " + args[3] + " does not exists");
            System.exit(2);
        }

        ArrayList<String> s2 = new ArrayList<>();
        try ( Scanner input = new Scanner(sourceFile);) {
            
            while(input.hasNext()) {
                String s1 = input.nextLine();
                s2.add(s1.replaceAll(args[2], ""));
            }
        } 

        try (PrintWriter output = new PrintWriter(sourceFile)) {
            for(int i = 0; i < s2.size(); i++) {
                output.println(s2.get(i));
            }
        }
    }    
}
