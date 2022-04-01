import java.io.IOException;
import java.io.RandomAccessFile;

class Exercise_17_10 {
    public static void main(String[] args) {
        
        //check java usage
        if(args.length != 2) {
            System.out.println("Usage: java Exercise_17_10.java sourceFile numberOfPieces");
            System.exit(1);
        }
        int numberOfPieces = Integer.parseInt(args[1]);
        RandomAccessFile[] splits = new RandomAccessFile[numberOfPieces];

        //create rw file
        try(
            RandomAccessFile inout = new RandomAccessFile(args[0], "r") 
        ){
            for(int i = 0; i < splits.length; i++) {
                splits[i] = new RandomAccessFile(args[0] + " . " + (i + 1), "rw");
            }
            int size = Math.round(inout.length() / numberOfPieces);
            int count = 0;
            byte[] b;

            for(int i = 0; i < numberOfPieces - 1; i++) {
                inout.seek(count * size);
                b = new byte[size];
                inout.read(b);
                splits[i].write(b);
                count++;
            }

            inout.seek(count * size);
            b = new byte[(int)inout.length() - (count * size)];
            inout.read(b);
            splits[numberOfPieces - 1].write(b);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }    
}
