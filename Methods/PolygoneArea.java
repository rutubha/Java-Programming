import java.util.Scanner;
class PolygoneArea {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the number of side and length of side of polygone\
        System.out.print("Enter the number of side: ");
        int number_side = sc.nextInt();
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();

        //invok the method to compute the area
        double area  = area(number_side, side);

        //Display the result of polygone area 
        System.out.print("The area of the polygone is "+area);
    }    

    public static double area(int n, double side) {
        double area = (n * side * side) / ( 4.0 * Math.tan(Math.PI / n));
        return area;
    }
}
