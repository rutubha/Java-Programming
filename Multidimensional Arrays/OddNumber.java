class OddNumber { 
    public static void main(String[] args) { 
        //variable 
        int[][] matrix = new int[6][6];

        //fill with 0's and 1's
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix[i].length; j++) { 
                matrix[i][j] = (int)(Math.random()*2);
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        //check odd 1's
        boolean[][] oddFlag = checkOdd(matrix);

        for(int i = 0; i < oddFlag.length; i++) { 
            if(oddFlag[0][i])
                System.out.println(i+1+" row is hold odd 1's");
            
            if(oddFlag[1][i])
                System.out.println(i+1+" column is hold odd 1's");
        }

    }

    public static boolean[][] checkOdd(int[][] m) { 
        boolean[][] oddTable = new boolean[2][m.length];

        for(int i = 0; i < m.length; i++) { 
            int row = 0, col = 0;
            for(int j = 0; j < m[i].length; j++) { 
                //count row 1's
                if(m[i][j] == 1) { 
                    row++;
                }

                //count column 1's
                if(m[j][i] == 1) { 
                    col++;
                }
            }

            //if it is odd 1's row
            if(row % 2 == 1) { 
                oddTable[0][i] = true;
            } else {
                oddTable[0][i] = false;
            }

            //if it is odd 1's in column
            if(col % 2 == 1) { 
                oddTable[1][i] = true;
            } else {
                oddTable[1][i] = false;
            }
        }

        return oddTable;
    }

}
