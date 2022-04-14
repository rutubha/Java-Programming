import java.util.Scanner;
/**
 * AreaOfTriangle
 */
public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        double[][] points = new double[3][2];

        //prompt user
        System.out.print("Enter the x1, y1, x2, y2, x3, y3 :");
       
        for(int i = 0; i < points.length; i++) { 
            for(int j = 0; j < points[i].length; j++) { 
                points[i][j] = in.nextDouble();
            }
        }

        //compute triangle
        double area = getTriangleArea(points);
       
        if(area != 0)
            System.out.println("Triangle area is "+String.format("%.2f", area));
        else
            System.out.println("The three points ara on the same line");
    }

    public static double getTriangleArea(double[][] points) { 
        double area = 0;

        //geomatric triangle formula
        area = (1.0/2) * Math.abs((points[0][0]*(points[1][1] - points[2][1])) + (points[1][0]*(points[2][1] - points[0][1])) +
                    (points[2][0]*(points[0][1] - points[1][1])));
        return area;
    }
}