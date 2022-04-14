import java.util.Scanner;
class DisplayMatrix {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the number that print n by n mateix
        System.out.println("Enter the number: ");
        int number = input.nextInt();
           
        printMatrix(number);
    
    } 
    
    public static void printMatrix (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { 
                int random = (int)(Math.random()*2);
                System.out.print(random+"  ");
            }
            System.out.println(" ");
        }
    }

}
