import java.util.Scanner;
class PassOrFail {
    public static void main(String[] args) {
        //Create Scanner Object 
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the score of java
        System.out.print("Enter your score: ");
        int score = input.nextInt();

        //check for all conditions 
        if ( score  >= 60 && score <= 100) {
            System.out.print("You pass the exam");
        } else if (score < 60 && score >= 0) {
            System.out.print("You don't pass the exam");
        } else {
            System.out.print("No numbers are entered except 0");
        }
    }
}
