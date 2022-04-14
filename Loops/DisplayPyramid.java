import java.util.Scanner;
class DisplayPyramid{
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);

       

        //prompt the user to enter the number between 1 to 15
        System.out.print("Enter the number of lines: ");
        int line = input.nextInt();
         //variable
         int track = line;

        //create loop
        for (int n = 1; n <= line; n++ ) {
            for(int i = track; i > 0; i--) {
                 if ( i == 1) {
                     for (int  j = 1; j <=track; j++ ) {
                         System.out.print(j+" ");
                        
                     } 
                     track = track -1;
                 } else {
                    System.out.print(i+" ");
                 }
             }

             //f(n == line ) {
             //   System.out.print(1+"");
             //
            
            System.out.println(" ");
        }
       
    }
}