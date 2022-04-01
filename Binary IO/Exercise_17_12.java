import java.io.IOException;
import java.io.RandomAccessFile;

class Exercise_17_12 {
    public static void main(String[] args) {
        
        //Check usage
        if(args.length < 2) {
            System.out.println("Usage: java Exercise_17_12.java sourceFIle1, sourcefile2, .....,TargetFile");
            System.exit(1);
        }

        int length = args.length;

        //Create file to read from source file
        RandomAccessFile[] source = new RandomAccessFile[length - 1];
        //Random Access File
        try (
            RandomAccessFile out = new RandomAccessFile(args[length - 1], "rw");
        ) {
            for(int i = 0; i < length - 1; i++) {
                source[i] = new RandomAccessFile(args[i], "r");
            }

            for(int i = 0; i < length - 1; i++) {
                byte[] b = new byte[(int)(source[i].length())];
                source[i].seek(0);
                source[i].read(b);
                out.seek(out.length());
                out.write(b);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}