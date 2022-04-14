import java.util.Scanner; 
class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the matrix
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        System.out.println("Enter matrix1: ");
        for(int i = 0; i < matrix1.length; i++){ 
            for(int j = 0; j < matrix1[i].length; j++) { 
                matrix1[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter matrix2: ");
        for(int i = 0; i < matrix2.length; i++){ 
            for(int j = 0; j < matrix2[i].length; j++) { 
                matrix2[i][j] = in.nextInt();
            }
        }

        //add matrix
        double[][] sum = new double[2][2];

        sum = addMatrix(matrix1, matrix2);

        System.out.println("Sum of matrix is :"); 
        System.out.println("Enter matrix2: ");
        for(int i = 0; i < matrix2.length; i++){ 
            for(int j = 0; j < matrix2[i].length; j++) { 
                System.out.print(sum[i][j]+" ");
            }
            System.out.println(" ");
        }

    }

    public static double[][] addMatrix(int[][] matrix1, int[][] matrix2) { 
        double[][] sum = new double[matrix1.length][matrix1[0].length];

        for(int i = 0; i < matrix2.length; i++){ 
            for(int j = 0; j < matrix2[i].length; j++) { 
               sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }


        return sum;
    }
}
