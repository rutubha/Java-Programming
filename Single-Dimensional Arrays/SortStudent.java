import java.util.Scanner; 
class SortStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the student and score: ");
        String[] students = new String[10];
        double[] scores = new double[10];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("\nEnter the student name and score :");
            students[i] = in.next();
            scores[i] = in.nextDouble();
        }

        //sort students name by its score
        int[] index = sortStudent(scores);

        for(int i = 0; i < index.length; i++) {
            System.out.println("Student and score "+students[index[i]] + " "+scores[index[i]]);
        }
       

    }

    public static int[] sortStudent (double[] scores) {
        int[] index = new int[scores.length];

        for (int i = 0; i < index.length; i++) {
            index[i] = i;
        }

        for(int i = 0; i < scores.length; i++) {
            double key = scores[i];
            for (int j = i + 1; j < scores.length - 1; j++) {
                if (key < scores[j]) {
                    double temp = key;
                    key = scores[j];
                    scores[j] = temp;

                    int tempInd = index[i];
                    index[i] = index[j];
                    index[j] = tempInd;
                    i = j;
                }
            }
        }

        return index;

    }
}