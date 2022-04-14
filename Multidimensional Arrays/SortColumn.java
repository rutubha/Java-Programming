import java.util.Scanner;
class SortColumn { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        double[][] variable = new double[4][4];
        
        //prompt user
        System.out.println("Enter the matrix: ");
        for(int i = 0; i < 4; i++) { 
            for(int j = 0; j < 4; j++) { 
                variable[i][j] = in.nextDouble();
            }
        }

        //sort column
        double[][] sortMatrix = sortColumn(variable);

        System.out.println("Sorted matrix is: ");
        for(int i = 0; i < 4; i++) { 
            for(int j = 0; j < 4; j++) { 
                 System.out.print(sortMatrix[i][j]+" ");
            }
            System.out.println("");
        }


    }

    public static double[][] sortColumn(double[][] m) { 
        double[][] sort = new double[m.length][m.length];

        for(int i = 0; i < sort.length; i++) {
            double[] temp = new double[m.length]; 
            for(int j = 0; j < sort.length; j++) { 
                temp[j] = m[j][i];
            }

            sort(temp);

            for(int j = 0; j < m.length; j++) { 
                sort[j][i] = temp[j];
            }
        }

        return sort;
    }

    public static void sort(double[] m) { 
        for(int i = 0; i< m.length; i++) { 
            int key = i;
            for(int j = i; j < m.length; j++) { 
                if(m[key] > m[j]) { 
                    key = j;
                }
            }

            double temp = m[i];
            m[i] = m[key];
            m[key] = temp;
        }
    }
}