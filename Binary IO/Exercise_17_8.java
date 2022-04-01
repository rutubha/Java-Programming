import java.io.IOException;
import java.io.RandomAccessFile;

class Exercise_17_8 {
    public static void main(String[] args) {
        try(
            RandomAccessFile inout = new RandomAccessFile("Exercise_17_8.dat", "rw");
        ) {
            if(inout.length() == 0) {
                inout.writeInt(1);
                inout.seek(0);
                System.out.println("This file executed " + inout.readInt() + " Time");
            } else {
                int count = inout.readInt();
                inout.seek(0);
                inout.writeInt(++count);
                inout.seek(0);
                System.out.println("This file executed " + inout.readInt() + " Times");
            }
            inout.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }    
}
