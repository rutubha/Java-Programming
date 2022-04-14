import java.util.Scanner; 
class AverageMajorDiagonal {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        //create 4-by-4 matrix
        double[][] matrix = new double[4][4];

        //prompt the user to enter the number
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        //Scan row
        for(int i = 0; i < matrix.length; i++) { 
            //scan column
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextDouble();
            }
        }

        //compute average of major diagonal
        double average = averageMajorDiagonal(matrix);

        System.out.print("Average of the element in the major diagonal is "+average);
    }

    public static double averageMajorDiagonal(double[][] matrix) { 
        double sum = 0;
        for(int i = 0; i < matrix.length; i++) { 
            sum = sum + matrix[i][i];
        }

        return sum / matrix.length;
    }
}
