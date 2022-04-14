import java.util.Scanner; 
class MarkovMatrix {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        //variable
        double[][] matrix = new double[3][3];

        //prompt user
        System.out.println("Enter the matrix: ");
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix.length; j++){ 
                matrix[i][j] = in.nextDouble();
            }
        }

        //check markov matrix or not
        boolean value = isMarkov(matrix);

        if(value) { 
            System.out.println("It is a markov matrix");
        } else { 
            System.out.println("It is not a morkov matrix");
        }

    }

    public static boolean isMarkov(double[][] m) {
        boolean value = true;

        for(int i = 0; i < m.length; i++) {
            double sum = 0; 
            for(int j = 0; j < m.length; j++) { 
                if(m[j][i] > 0) {
                    sum = sum + m[j][i];
                } else {
                    value = false;
                    break;
                }
            }

            sum = (int)(sum);

            if(sum != 1) { 
                value = false;
                break;
            }
        }

        return value;
    }
}
