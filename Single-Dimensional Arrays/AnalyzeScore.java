import java.util.*;
public class AnalyzeScore {

    public static void main(String[] args) { 
        //Create Scanner Object
        Scanner in = new Scanner(System.in);

        //Create DynamicArray
        DynamicArray list = new DynamicArray();

        //prompt the user to enter the score
        System.out.println("Enter the Score (enter negative score to end) :");
        int score ;
        do {
            score = in.nextInt();
            if (score >= 0)
              list.add(score);
        } while (score >= 0);

        //Check lenght and display the number
        analyzeScore(list.arry);
    }

    public static  void  analyzeScore(int[] arr) {
        int size = arr.length;

        double avg = 0;
        for (int i = 0; i < size; i++) {
            avg = avg + arr[i];
        }
        avg = (double)avg / size;

        //Scan the array and find count of belove and above score from average score
        int belove = 0;
        int above = 0;
        for (int i =0; i < size; i++) {
            if ( arr[i] >= avg) {
                above++;
            } else {
                belove++;
            }
        }

        //print the result
        System.out.println(above + " scores are above or equal to average.");
        System.out.println(belove+ " scores are belove the average.");
    }
}
