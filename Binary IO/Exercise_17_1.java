import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Exercise_17_1 {
    public static void main(String[] args) throws FileNotFoundException{

        //Create arrayList
        ArrayList<String> list = new ArrayList<>();

        //Create File object
        File file = new File("Exercise_17_1.txt");

        //   Check if file Exists
        if(file.exists()) {
            try (
                Scanner input = new Scanner(file);
            ) {
                while(input.hasNextLine()) {
                    list.add(input.nextLine());
                }
            }
        }

        //Generate Integer
        for(int i = 0; i < 100; i++) {
            list.add((int)(Math.random() * 100) + " ");
        }

        //write into file
        try (
            PrintWriter output = new PrintWriter(file);
        ) {
            for(String l : list) {
                output.write(l);
            }
        }
    }
}