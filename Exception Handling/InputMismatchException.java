import java.util.Scanner;

public class InputMismatchException extends Throwable{

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.println("Enter the a and b ;");
        a = in.nextInt();
        b = in.nextInt();
        in.close();
        if(a >= 0 && b >= 0) {
            System.out.println("Product is " + a * b);
        } else {
            throw new Exception("invalid number " + a + " " + b);
        }
        // try (){
        //     System.out.println("Enter to number: ");
        //     a = in.nextInt();
        //     b = in.nextInt();

        //     System.out.println("Product is " + a * b);
        // } 
        // catch (InputMismatchException e) {
        //     System.out.println("message " + e + "\n " + a + " and " + b);
        // }

        
    }
}