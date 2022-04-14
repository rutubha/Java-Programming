import java.util.*;
/**
 * TwoLowestScore
 */
 class TwoLowestScore {

    public static void main(String[] args) {
        //Create Scanner Object
        Scanner sc = new Scanner(System.in);

        //Prompt the user to enter the name and Score

        System.out.print("Enter the number of student: ");
        int number = sc.nextInt() - 1;

        String[] name = new String[number +1];
        double[] score = new double[number +1];

        for(int i = 0; i <= number; i++){
            System.out.print("Enter the student Name: ");
             name[i] = sc.next();
            System.out.print("Enter the Score: ");
             score[i] = sc.nextDouble();
        }

        //first copy the score
        double[] copy = new double[number];
        for (int index = 0; index < number; index++){
            copy[index] = score[index];
        }

        //Check sor lowest score
        for(int j = 0; j <= number; j++){
            for (int n = j+1; n <= number; n++) {
                if (score[j] > score[n]) {
                    double temp = score[j];
                    score[j] = score[n];
                    score[n] = temp;
                } 
            }
        }

        double firstLow = score[0];
        double secondLow = score[1];

        int index1 = 0;
        int index2 = 0;

        for (int k = 0; k < number; k++) {
            if (copy[k] == firstLow){
                 index1 = k;
            }
             if (copy[k] == secondLow) {
                 index2 = k;
            }
        }

        //Display first and second lowest score and name
        System.out.println("Student "+ name[index1] + " is lowest score "+ firstLow);
        System.out.println("Student "+ name[index2] + " is second lowest score " + secondLow);
    }
}