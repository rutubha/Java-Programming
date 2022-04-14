import java.util.Scanner; 
class RightMostPoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        double[][] points = new double[6][2];

        //prompt user
        System.out.print("Enter the points :");
       
        for(int i = 0; i < points.length; i++) { 
            for(int j = 0; j < points[i].length; j++) { 
                points[i][j] = in.nextDouble();
            }
        }

        //compute right most point
        double[] point = getRightMostPoint(points);

        System.out.println("Right most point is ("+point[0]+","+point[1]+").");
    }

    public static double[] getRightMostPoint(double[][]  points) {
        double[] point = new double[2];

            int index = 0;
            for(int j = 0; j < points.length; j++) { 
                if(index < points[j][0]) { 
                    index = j;
                }
            }

            point[0] = points[index][0];
            point[1] = points[index][1];
        return point;
    }
}
