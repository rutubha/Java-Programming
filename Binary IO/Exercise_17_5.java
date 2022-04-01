import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Exercise_17_5 {
    public static void main(String[] args) {
        //create file
        try(
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise_17_5.dat"));
        ) {
            int[] arr = {1, 2, 3, 4, 5};
            output.writeObject(arr);
            output.writeObject(new java.util.Date());
            output.writeDouble(10.5);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //read file
        try(
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise_17_5.dat"));
        ) {
            int[] arr = (int[])(input.readObject());
            System.out.print("array :" );
            for(int r: arr) {
                System.out.print(r + " ");
            }
            System.out.println("\nDate " + input.readObject());
            System.out.println("Double " + input.readDouble());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }    
}
