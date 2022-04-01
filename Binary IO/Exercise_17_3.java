import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Exercise_17_3 {
    public static void main(String[] args) throws Exception{
         
        //Create a output stream
        try (
            DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise_17_3.dat"));
        ) {
            int length = (int)(Math.random() * 1000) + 50;
            for(int i = 0; i < length; i++) {
                output.writeDouble((double)(Math.random() * 1000));
            }
        }

        //read data
        try (
            DataInputStream input = new DataInputStream(new FileInputStream("Exercise_17_3.dat"));
        ) {
            while(true) {
                System.out.print(input.readDouble()+ " ");
            }
        } catch (EOFException ex) {
            System.out.println("\nAll data were read");
        }
    }    
}
