import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class Exercise_17_15 {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user
        System.out.print("Enter the input file name: ");
        String inFile = input.next();
        System.out.print("\nEnter the input file name: ");
        String outFile = input.next();
        input.close();
        
        try(
            RandomAccessFile source = new RandomAccessFile(inFile, "r");
            RandomAccessFile target = new RandomAccessFile(outFile, "rw");
        ) {
            int r = 0;
            source.seek(0);
            while((r = source.read()) != -1) {
                target.write(((byte)r) - 5);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }    
}
