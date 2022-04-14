class LargestRowColumn {
    public static void main(String[] args) {
        //varaible matrix
        int[][] matrix = new int[5][5];

        //fill matrix by 0's and 1's
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix[i].length; j++) { 
                matrix[i][j] = (int)(Math.random()*2);
            }
        }

        //display matrix
        System.out.println("Matrix is:");
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //check first row and column wich hold the most 1's
        int p1 = 0, p2 = 1;
        int[] maxCount = countOne(matrix, p1, p2);

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                int[] count = countOne(matrix, i, j);

                if(count[0] > maxCount[0]) {
                    maxCount[0] = count[0];
                    p1 = i;
                }
                if(count[1] > maxCount[1]) { 
                    maxCount[1] = count[1];
                    p2 = j;
                }
            }
        }

        //Display
        System.out.println("The largest row index is "+p1);
        System.out.println("The largest column index is "+p2);
    }  
    
    public static int[] countOne(int[][] matrix, int row, int col) {
        int[] count = new int[2];

        for(int i = 0; i < matrix[row].length; i++) {
            if(matrix[row][i] == 1) 
                count[0] = count[0] + 1;
        }

        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][col] == 1) 
                count[1] = count[1] + 1;
        }

        return count;
    }
}
