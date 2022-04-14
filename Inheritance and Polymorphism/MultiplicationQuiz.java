import java.util.ArrayList;
import java.util.Scanner;
class MultiplicationQuiz {
    public static void main(String[] args) {

        int a = 1 + (int)(Math.random() * 10);
        int b = 1 + (int)(Math.random() * 10);

        quiz(a, b);
    }  
    
    public static void quiz(int a, int b) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<>();

        int correctAns = a * b;
        int youAns = -1;

        while(youAns != correctAns) {
            System.out.println("What is " + a + "*" + b +"?");
            youAns = in.nextInt();
            if(youAns != correctAns) {
                if(ans.contains(youAns)) {
                    System.out.println("You already entered "+youAns);
                } else {
                    System.out.println("Wrong answer. Try again.");
                    ans.add(youAns);
                }
            } else {
                System.out.println("you got it.");
                ans.add(youAns);
            }
        }
        in.close();
    }
}
