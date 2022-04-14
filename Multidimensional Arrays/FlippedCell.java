import java.util.Scanner; 
class FlippedCell {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable 
        int[][] matrix = new int[6][6];
        int[][] temp = new int[6][6];

        //fill with 0's and 1's
        System.out.print("Enter the matrix: ");
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix[i].length; j++) { 
                matrix[i][j] = in.nextInt();
                temp[i][j]  = matrix[i][j];
            }
            System.out.println();
        }

        System.out.print("flip the cell:");
        int row = in.nextInt();
        int col = in.nextInt();

        if(matrix[row][col] == 1) {
            matrix[row][col] = 0;
        } else { 
            matrix[row][col] = 1;
        }

        int[] check = checkFlip(matrix, temp);

        System.out.println("The flipped cell is at ("+check[0]+","+check[1]+")");
    }

    public static int[] checkFlip(int[][] m, int[][] t) { 
        int[] check = new int[2];

        for(int i = 0; i < m.length; i++) { 
            for(int j = 0; j < m[i].length; j++) { 
                 if(m[i][j] != t[i][j]) { 
                     check[0] = i;
                     check[1] = j;
                     break;
                 }
            }
        }
        
        return check;
    }
}
