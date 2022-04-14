import java.util.Scanner;
class LowestScore {
    public static void main(String[] args) {
        //Create Scanner Object 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int number = input.nextInt();

        String[] name = new String[number+1];
        double[] score = new double[number+1];

       

        //promot the user to enter the name and score
        for (int i = 0; i <= number; i++) {
            System.out.println("Enter the name of the student: ");
             name[i] = input.next();
            System.out.println("Enter the score of the student: ");
             score[i] = input.nextDouble();
        }

        double temp=0;
        String student = new String();
        double[] scoreCopy = new double[number+1];
        double studentScore = 0;
        for ( int n = 0; n < number; n++) {
            scoreCopy[n] = score[n];
        }
        //check for the lowest score
        for ( int i=0; i < number; i++) {
            for (int j=i+1; j < number; j++) {
                if ( scoreCopy[i] > scoreCopy[j]) {
                    temp = scoreCopy[i];
                    scoreCopy[i] = scoreCopy[j];
                    scoreCopy[j] = temp;
                    
                } 
            }
        }
        studentScore = scoreCopy[0];

        int index = 0;
        for ( int x = 0; x < number; x++) {
            if ( score[x] == studentScore ) {
                index = x;
            }
        }

        System.out.print("Studenr "+name[index] + " is lowest score " + studentScore);
    }

   
}