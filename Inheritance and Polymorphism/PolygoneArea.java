import java.util.Scanner;

class PolygoneArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of the point : ");
        int point = in.nextInt();

        double[][] points = new double[7][2];

        System.out.println("Enter the poits : ");
        for(int i = 0; i < point; i++) {
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
        }
        in.close();

        System.out.println("Area is "+ area(points));
    }   
    
    public static double area(double[][] points) {
        double area = 0;

        for(int i = 0; i < points.length; i++) {
            if(i == points.length - 1){
                area += (points[i][0] * points[0][1] - points[0][0] * points[i][1]);
            } else {
                area += (points[i][0] * points[i + 1][1] - points[i][1] * points[i + 1][0]);
            }
        }

        area = Math.abs(area)/ 2;
        return area;
    }
}
