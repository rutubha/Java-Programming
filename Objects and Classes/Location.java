import java.util.Scanner;
class Location{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of row and column in the array: ");
        int row = in.nextInt();
        int col = in.nextInt();
        double[][] arr = new double[row][col];

        System.out.println("Enter the array: ");
        for(int i = 0; i < arr.length; i++) { 
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }

        double[] location = locateSmallest(arr);

        System.out.println("The llocation of the smallest element is "+location[0]+" at ("+
                            (int)location[1]+","+(int)location[2]+")");      
    }

    public static double[] locateSmallest(double[][] a) { 
        double[] locate = new double[3];
        
        double minValue = a[0][0];
        int r =0; int c = 0;
        for(int i = 0; i < a.length; i++) { 
            for(int j = 0; j < a[i].length; j++) { 
                if(minValue > a[i][j]) { 
                    minValue = a[i][j];
                    r = i;
                    c = j;
                }
            }
        }

        locate[0] = minValue; locate[1] = r; locate[2] = c;

        return locate;
    }
}