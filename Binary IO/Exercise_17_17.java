import java.io.File;
import java.io.IOException;

class Exercise_17_17 {
    public static void main(String[] args) {
        File testFile = new File("Exercise_17_17.dat");
        try {
            BitOutputStream bitoutput = new BitOutputStream(testFile);
            bitoutput.writeBit("010000100100001001101");
            bitoutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
}
