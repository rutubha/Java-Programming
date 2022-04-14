import java.util.Scanner; 
class ExploreMatrix{ 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        //variable
        //prompt user
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = in.nextInt();

        System.out.println("Enter the array: ");
        int[][] matrix = new int[row][row];

        for(int i = 0; i < row; i++) { 
            for(int j = 0; j < row; j++) { 
                matrix[i][j] = (int)(Math.random()*2);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //explore
        exploreMatrix(matrix);
    }

    public static void exploreMatrix(int[][] matrix) { 
        int count_zero = 0;
        for(int i = 0; i < matrix.length; i++) { 
            if(matrix[0][i] == 0) {
                count_zero++;
            }
        }

        System.out.println("All 0s on row "+count_zero);

        int count_one = 0;
        for(int i = 0; i < matrix.length; i++) { 
            if(matrix[0][i] == 1) {
                count_one++;
            }
        }

        System.out.println("All 1s on row "+count_one);

        int flag_col = 0;

        for(int i = 0; i < matrix.length - 1; i++) { 
            int count = 0;
            for(int j = 0; j < matrix.length; j++) { 
                if(matrix[j][i] == matrix[j][i+1]) { 
                    count++;
                }
            }

            if(count == 4) { 
                flag_col++;
            }
        }

        if(flag_col == 0) { 
            System.out.println(" NO same numbers on a column");
        } else { 
            System.out.println(flag_col+" same numbers on a column");
        }

        int flag_dia = 0;

        for(int i = 0; i < matrix.length - 1; i++) { 
            if(matrix[i][i] == matrix[i+1][i+1]) { 
                flag_dia++;
            }
        }

        if(flag_dia == 3) { 
            System.out.println("Same numbers on the major diagonal.");
        } else { 
            System.out.println("No Same numbers on the major diagonal.");
        }

    }
}