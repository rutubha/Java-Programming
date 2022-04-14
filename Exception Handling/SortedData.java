import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class SortedData {
    public static void main(String[] args) throws Exception {
        
        File file = new File("SortedData.txt");

        //checkl file exist or not
        if(!file.exists()) {
            System.out.println("File does not exists");
            System.exit(1);
        }

        //read data from file 
        ArrayList<Integer> data = new ArrayList<>();
        try(Scanner input = new Scanner(file)) {
            while(input.hasNext()) {
                data.add(input.nextInt());
            }
        }

        //check whether data in decreasing order and not than print that voilate the rule

        for(int i = 0; i < data.size() - 1; i++) {
            int key = data.get(i);
            if(key < (int)(data.get(i + 1))) {
                System.out.println("First two string that are in not order is " + key + " and " + data.get(i + 1));
            }
        }
    }
}