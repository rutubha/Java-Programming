import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class Exercise_17_4 {
    public static void main(String[] args) throws Exception{
        
        //Check argument
        if(args.length != 2) {
            System.out.println("Usege: java Exercise_17_4 txt.java create.utf");
            System.exit(0);
        }

        //file exists or not
        File file = new File(args[0]);
        if(!file.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(1);
        }

        //Check target file
        File targetFile = new File(args[1]);
        if(targetFile.exists()) {
            System.out.println("target file " + args[1] + " already exist");
            System.exit(2);
        }

        try(
            Scanner input = new Scanner(file);

            DataOutputStream output = new DataOutputStream(new FileOutputStream(args[1])); 
        ) {
            while(input.hasNext()) {
                output.writeUTF(input.nextLine());
            }
        }

        //read file
        try(
            DataInputStream input = new DataInputStream(new FileInputStream(args[1]));
        ) {
            while(true) {
                System.out.println(input.readUTF());
            }
        } catch(EOFException e) {
            System.out.println("All data read");
        }
    }    
}
