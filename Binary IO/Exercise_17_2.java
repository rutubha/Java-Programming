import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Exercise_17_2 {
    public static void main(String[] args) throws IOException {
        try (
                FileOutputStream output = new FileOutputStream("Exercise_17_2.dat");) {
            for (int i = 0; i < 100; i++) {
                output.write((int) (i));
            }
        }

        try {
            try (
                    FileInputStream input = new FileInputStream("Exercise_17_2.dat");) {
                        int count = 0;
                while (true) {
                    int r = input.read();
                    if(r == -1) {
                        break;
                    }
                    System.out.print(r + " ");
                    count++;
                }

                System.out.println("Number " + count);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
