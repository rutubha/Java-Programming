import java.util.Scanner;
class LocateSmallNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        System.out.print("Enter the number of row and columns of the array: ");
        int row = in.nextInt();
        int column = in.nextInt();

        System.out.println("Enter the array: ");
        double[][] array = new double[row][column];

        for(int i = 0; i < row; i++) { 
            for(int j = 0; j < column; j++) { 
                array[i][j] = in.nextDouble();
            }
        }

        //find smallest element position
        int[] loc = smallestPos(array);

        System.out.println("The location of the smallest element is at ("+loc[0]+","+loc[1]+")");

    }

    public static int[] smallestPos(double[][] matrix) { 
        int[] pos = new int[2];

        double small = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < small) { 
                    small = matrix[i][j];
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }
}
