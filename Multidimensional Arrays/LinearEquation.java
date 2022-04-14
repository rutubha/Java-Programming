import java.util.Scanner;
class LinearEquation { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        double[][] a = new double[2][2];
        double[] b = new double[2];

        //prompt user
        System.out.print("Enter the equation 1 & 2 :");

        for(int i = 0; i < a.length; i++) { 
            for(int j = 0; j < a[i].length; j++) { 
                a[i][j] = in.nextDouble();
            }

            b[i] = in.nextDouble();
        }

        //compute x and y

        double[] ans = linearEquation(a, b);

        //Display
        if(a[0] != null)
            System.out.println(" x is "+ans[0]+" and y is "+ans[1]);
        else
        System.out.println("The equation has no solution" );
    }

    public static double[] linearEquation (double[][] a, double[] b) { 
        double[] ans = new double[2];

        double divider = (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);

        if(divider == 0) { 
            ans = null;
        } else { 
            ans[0] = (((double)b[0]*a[1][1]) - ((double)b[1]*a[0][1])) / (double)divider;
            ans[1] = (((double)b[1]*a[0][0]) - ((double)b[0]*a[1][0])) / (double)divider;
        }

        return ans;
    }
}