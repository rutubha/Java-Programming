import java.util.*;
import java.io.*;

class ScoresTotalAvg {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the file name :");
        String filename = in.next();
        in.close();

        File fileName = new File(filename);
        //Check file Exist or not
        if(!fileName.exists()) {
            System.out.println("Filename does not exist");
            System.exit(1);
        }

        //Count total and make average
        try (Scanner input = new Scanner(fileName)) {
            int count = 0;
            int total = 0;

            while(input.hasNext()) {
                int score = input.nextInt();
                total += score;
                count += 1;
            }

            System.out.println("Total of scores is " + total);
            System.out.println("Average of scores is " + ((double)total/count));
        }
    }
}