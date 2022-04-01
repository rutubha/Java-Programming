import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Exercise_17_6 {
    public static void main(String[] args) {
        //Create object file
        try(
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise_17_6.dat"));
        ) {
            //create loan object
            Loan l1 = new Loan(1000, 1);
            Loan l2 = new Loan(2000, 2);
            Loan l3 = new Loan(3000, 3);
            Loan l4 = new Loan(4000, 4);
            Loan l5 = new Loan(5000, 5);

            output.writeObject(l1);
            output.writeObject(l2);
            output.writeObject(l3);
            output.writeObject(l4);
            output.writeObject(l5);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //read back object
        try(
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise_17_6.dat"));
        ) {
            // Loan lr1 = (Loan)(input.readObject());
            // System.out.println(lr1.toString());
            // Loan lr2 = (Loan)(input.readObject());
            // System.out.println(lr2.toString());
            // Loan lr3 = (Loan)(input.readObject());
            // System.out.println(lr3.toString());
            // Loan lr4 = (Loan)(input.readObject());
            // System.out.println(lr4.toString());
            // Loan lr5 = (Loan)(input.readObject());
            // System.out.println(lr5.toString());
            while(true) {
                Loan lr = (Loan)(input.readObject());
                System.out.println("Amount of account is " + lr.getLoanDetails());
            }
        } catch(EOFException e) {
            System.out.println("All data read");
        }
         catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }    
}
