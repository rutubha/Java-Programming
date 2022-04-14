import java.util.Scanner;
class IntersectingPoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        double[][] points = new double[4][2];

        //prompt user
        System.out.println("Enter the point: ");
        for(int i = 0; i < points.length; i++) { 
            for(int j = 0; j < 2; j++) { 
                points[i][j] = in.nextDouble();
            }
        }

        //find intersecting point

        double[] intersectingPoint = getIntersectingPoint(points);

        if(intersectingPoint != null) 
            System.out.println("Intersecting point is ("+intersectingPoint[0]+","+intersectingPoint[1]+")");

    }

    public static double[] getIntersectingPoint(double[][] point) { 
        double[] intersectingPoint = new double[2];

        double[][] intermediate = new double[2][3];
        
        intermediate[0][0] = point[0][1] - point[1][1];
        intermediate[0][1] = point[0][0] - point[1][0];
        intermediate[0][2] = (point[0][1] - point[1][1])*point[0][0] - (point[0][0] - point[1][0])*point[0][1];
        intermediate[1][0] = point[2][1] - point[3][1];
        intermediate[1][1] = point[2][0] - point[3][0];
        intermediate[1][2] = (point[2][1] - point[3][1])*point[2][0] - (point[2][0] - point[3][0])*point[2][1];

        double divider = (intermediate[0][0] * intermediate[1][1]) - (intermediate[0][1]*intermediate[1][0]);

        if(divider == 0) { 
            intersectingPoint = null;
        } else { 
            intersectingPoint[0] = ((intermediate[0][2] * intermediate[1][1]) - 
                                    (intermediate[0][1]*intermediate[1][2])) / divider;
            intersectingPoint[0] = ((intermediate[1][2] * intermediate[0][0]) - 
                                    (intermediate[1][0]*intermediate[0][2])) / divider;
        }
        return intersectingPoint;
    }
}
