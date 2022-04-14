import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ReadWrite {
    public static void main(String[] args) throws Exception{
        File fileName = new File("Exercise12_15.txt");

        //check file exists or not
        if(fileName.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        //Create file
        PrintWriter output = new PrintWriter(fileName);

        for(int i = 0; i < 120; i++) {
            int random = 1 + (int)(Math.random()*200);
            output.print(random + " ");
        }
        output.close();

       try ( Scanner input = new Scanner(fileName)) {

        ArrayList<Integer> numbers = new ArrayList<>();

        while(input.hasNext()) {
            int n = input.nextInt();
            numbers.add(n);
        }

        Collections.sort(numbers);

        System.out.println("Sorted number in ascending order: ");

        for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        input.close();
    }
    }
}