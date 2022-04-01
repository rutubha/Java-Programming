import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class Exercise_17_16 {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //Prompt the user
        System.out.println("Enter the souce file to count frequency: ");
        String inFile = input.next();
        input.close();

        try(
            RandomAccessFile source = new RandomAccessFile(inFile, "r");
            RandomAccessFile target = new RandomAccessFile("Exercise_17_17.dat", "rw");
        ) {
            int[] frequency = new int[128];
            for(int i = 0; i < 128; i++) {
                frequency[i] = 0;
            }
            int r = 0;
            while((r = source.read()) != -1) {
                int ch = (char)(r);
                frequency[ch] = frequency[ch] + 1;
            }

            target.seek(0);
            for(int i = 0; i < 128; i++) {
                if(frequency[i] > 0) {
                    target.writeBytes("\r\n" + (char)(i) + ": " + frequency[i]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }    
}
