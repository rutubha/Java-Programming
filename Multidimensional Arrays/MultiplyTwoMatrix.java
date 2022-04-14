import java.util.Scanner; 
class MultiplyTwoMatrix { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        //matrix variable
        double[][] matrix1 = new double[2][2];
        double[][] matrix2 = new double[2][2];
        
        //prompt user
        System.out.println("Enter matrix1 :");
        for(int i = 0; i < matrix1.length; i++) { 
            for(int j = 0; j < matrix1[i].length; j++) { 
                matrix1[i][j] = in.nextDouble();
            }
        }

        System.out.println("Enter matrix2 :");
        for(int i = 0; i < matrix2.length; i++) { 
            for(int j = 0; j < matrix2[i].length; j++) { 
                matrix2[i][j] = in.nextDouble();
            }
        }

        //multiply by invowking method
        double[][] matrix = multiplyMatrix(matrix1, matrix2);

        //display
        System.out.println("Matrix multiplacation is : ");
        for(int i = 0; i < matrix.length; i++) { 
            for(double num: matrix[i]) { 
                System.out.print(num+"\t");
            }
            System.out.println();
        }

    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) { 
        //matrix variable for return matrix
        double[][] matrix = new double[matrix1.length][matrix2[0].length];

        //scan row
        for(int i = 0; i < matrix1.length; i++) {
            //scan column 
            for(int j = 0; j < matrix1[i].length; j++) { 
                //scan value for multiply two value
                for(int n = 0; n < matrix2.length; n++) { 
                    matrix[i][j] = (matrix1[i][n] * matrix2[n][j])+ matrix[i][j];
                }
            }
        }
        return matrix;
    }
}