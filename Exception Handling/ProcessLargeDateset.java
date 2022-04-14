import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class ProcessLargeDateset {
    public static void main(String[] args) throws Exception{
        
        //create File object
        File files = new File("Salary.txt");

        //Check it exists or not
        if(!files.exists()) {
            System.out.println("File does not exists");
            System.exit(1);;
        }

        try(
            Scanner input = new Scanner(files);
        ) {
            ArrayList<Double> assistantSalary = new ArrayList<>();
            ArrayList<Double> associateSalary = new ArrayList<>();
            ArrayList<Double> fullSalary = new ArrayList<>();

            while(input.hasNextLine()) {
                String[] s = input.nextLine().split(" ");
                if(s[2].compareTo("assistant") == 0) {
                    assistantSalary.add(Double.parseDouble(s[3]));
                } else if (s[2].compareTo("associate") == 0) {
                    associateSalary.add(Double.parseDouble(s[3]));
                } else {
                    fullSalary.add(Double.parseDouble(s[3]));
                }
            }

            System.out.println("\n    Total salary");
            System.out.println("-------------------------------");
            System.out.println("Assistant professors: "+totalSalry(assistantSalary));
            System.out.println("Associate professors: "+totalSalry(associateSalary));
            System.out.println("full professors: "+totalSalry(fullSalary));
        }
    }
    
    public static double totalSalry(ArrayList<Double> list) {
        double total = 0;
        for(double n: list) {
            total += n;
        }

        return total;
    }
}
