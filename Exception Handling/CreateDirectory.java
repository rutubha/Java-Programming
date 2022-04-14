import java.io.File;
import java.util.Scanner;

class CreateDirectory {
    public static void main(String[] args) {
        //Prompt the user to enter the directory name
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the directory name: ");
        File dir = new File(in.next());

        //check directory already exists or not 
        if(dir.exists()) {
            System.out.println("Directory already exists");
            System.exit(1);;
        }
        if(dir.mkdir()) {
            System.out.println("Directory created successfully");
        }
        in.close();
    }
}