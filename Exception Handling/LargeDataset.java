import java.io.*;
import java.text.DecimalFormat;
class LargeDataset {
    public static void main(String[] args) throws Exception {
        
        File file = new File("Salary.txt");

        //Count the line 
        int line = 0;

        try (PrintWriter output = new PrintWriter(file)) {
             while (line < 1000) {
                output.print("FirstName" + (line + 1) +" ");
                output.print("LastName" + (line + 1) +" ");
                
                //Get rank randomaly
                String rank = getRank();
                output.print(rank + " ");

                //get Random Salary
                double salry = getSalary(rank);
                DecimalFormat df = new DecimalFormat("0.00");
                output.println(df.format(salry));

                line++;
            }
        }
    }  
    
    public static String getRank() {
        int rank = (int)(Math.random()*3);
        if(rank == 0) {
            return "assistant";
        } else if (rank == 1) {
            return "associate";
        } else {
            return "full";
        }
    }

    public static double getSalary(String rank) {
        if(rank.compareTo("assistant") == 0) {
            return (50000 + (double)(Math.random() * 30000));
        } else if (rank.compareTo("associate") == 0) {
            return (60000 + (double)(Math.random() * 50000));
        } else {
            return (75000 + (double)(Math.random() * 55000));
        }
    }
}
