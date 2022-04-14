import java.util.Scanner;

class SquareRoot { 
    public static void main (String[] args) {
        //Create Scanner Object
        Scanner sc = new Scanner(System.in);

        //Prompt the user to enter the number to find its squaroot
        System.out.println("Enter the number to find Squaroot:");
        long number  = sc.nextInt();

        //Display the result 
        System.out.print("Squareroot of number "+number + " is "+sqrt(number));
    }

    public static double sqrt(long n) {
        double lastGues = 1;
        double nextGues = ((lastGues + n) / lastGues ) / 2;
        
        while (Math.abs(nextGues - lastGues) >= 0.0001) {
                lastGues = nextGues;
                nextGues = ((lastGues + n) / lastGues ) / 2;
        }

        return nextGues;
    }
}