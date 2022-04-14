import java.util.Scanner;
class PointPosition { 
    public static void main(String[] args) {
        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //promot the user to enter the three point 
        System.out.print("Enter the point P0 (e.g. 5 2): ");
        double x0 = sc.nextDouble();
        double y0 = sc.nextDouble();
        System.out.print("Enter the point P1 (e.g 5 2): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter the point P2 (e.g. 5 2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        //invok three method and find which is true for this  point
        boolean left = leftOfTheLine(x0, y0, x1, y1, x2, y2);
        boolean right = onTheLineSagment(x0, y0, x1, y1, x2, y2);
        boolean same = onTheSameLine(x0, y0, x1, y1, x2, y2);

        //Display the result
        if (left) {
            System.out.println("("+x2+","+y2+") is on the left side of the line from ("+x0+","+y0+") to ("+x1+","+y1+")");
        } else if (right) {
            System.out.println("("+x2+","+y2+") is on the right side of the line from ("+x0+","+y0+") to ("+x1+","+y1+")");
        } else if (same) {
            System.out.println("("+x2+","+y2+") is on the line from ("+x0+","+y0+") to ("+x1+","+y1+")");
        }

    }

    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double condition = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        boolean point_position = false;
        if (condition > 0) {
            point_position = true;
        }
        return point_position;
    }

    public static boolean onTheSameLine(double x0, double y0, double x1,double y1, double x2, double y2) {
        double condition = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        boolean point_position = false;
        if (condition == 0) {
            point_position = true;
        }
        return point_position;
    }

    public static boolean onTheLineSagment(double x0, double y0, double x1,double y1, double x2, double y2) {
        double condition = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        boolean point_position = false;
        if (condition < 0) {
            point_position = true;
        }
        return point_position;
    }
}