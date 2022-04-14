import java.util.Scanner; 
class RowSorting {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        //variable
        double[][] matrix = new double[4][4];

        //prompt user
        System.out.println("Enter the matrix: ");
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix.length; j++) { 
                matrix[i][j] = in.nextDouble();
            }
        }

        //sort matrix
        double[][] sort = sortMatrix(matrix);

        System.out.println("Sort matrix is :");
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix.length; j++) { 
                System.out.print(sort[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }

    public static double[][] sortMatrix(double[][] matrix) { 
        double[][] sortMatrix = new double[4][4];

        for(int i = 0; i < matrix.length; i++) { 
            double[] temp = new double[sortMatrix[i].length];
            for(int j = 0; j < matrix.length; j++) { 
                temp[j] = matrix[i][j];
            }
            sort(temp);

            for(int j = 0; j < temp.length; j++) { 
                sortMatrix[i][j] = temp[j];
            }
        }

        /*for(int i = 0; i < matrix.length; i++) { 
            int key = i;
            for(int j = i; j < matrix.length; j++) { 
                if(sortMatrix[j][0] < sortMatrix[key][0]) { 
                   int temp = j;
                   j = key;
                   key = temp;
                }   
            }
            double[] temp = sortMatrix[i];
                sortMatrix[i] = sortMatrix[key];
                sortMatrix[key] = temp;
        }*/

        return sortMatrix;
    }

    public static void sort(double[] m) { 
        for(int i = 0; i < m.length; i++) { 
            int key = i;
            for(int j = i; j < m.length; j++) { 
                if(m[key] > m[j]) { 
                    key = j;
                }
            }

            double temp = m[key];
            m[key] = m[i];
            m[i] = temp;
        }
    }
}
