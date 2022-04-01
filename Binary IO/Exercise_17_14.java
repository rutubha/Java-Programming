import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class Exercise_17_14 {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //Prompt the user
        System.out.println("Enter the source file name: ");
        String inFile = input.next();
        System.out.println("Enter the target file name: ");
        String outFile = input.next();
        input.close();

        try(
            RandomAccessFile in = new RandomAccessFile(inFile, "r");
            RandomAccessFile out = new RandomAccessFile(outFile, "rw");
        ) {
            int r = 0;
            in.seek(0);
            while((r = in.read()) != -1) {
                out.write(((byte)r) + 5);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }    
}
