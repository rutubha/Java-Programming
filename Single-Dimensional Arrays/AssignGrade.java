import java.util.Scanner;
class AssignGrade {
    public static void main(String[] args) { 
        //create scanner object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the number of the student and his score
        System.out.print("Enter the number of the student : ");
        int numberOfStudent = sc.nextInt();

        System.out.print("Enter the score of the student : ");
        int [] score = new int[numberOfStudent];

        for(int i = 0; i < numberOfStudent; i++) {
            score[i] = sc.nextInt();
        }
        
        //Find out the best score out of the student 
        int best = score[0];
        for(int i = 1; i < numberOfStudent; i++) {
            if (best < score[i]) { 
                best = score[i];
            }
        }

        //Grade the student
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("Student "+(i+1)+" score is "+score[i]+" and grade is "+gradeAssign(best, score[i]));
        }
    }

    public static char gradeAssign(int best_score, int score) {
        char grade = 'A';
        if (score >= best_score - 5) {
            grade = 'A';
        } else if (score >= best_score - 10) {
            grade = 'B';
        } else if (score >= best_score - 15) {
            grade = 'C';
        } else if (score >= best_score - 20) { 
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

}
