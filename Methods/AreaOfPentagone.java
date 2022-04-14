import java.util.Scanner;
class AreaOfPentagone { 
    public static void main (String[] args) { 
        //Create Scanner Object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the side of pentagone
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();

        //invok a method to compute area
        double area = area(side);

        //Display the area of pentagone
        System.out.print("nThe area of the pentagone is "+area );
    }
    public static double area(double side) {
        double area = (5.0 * side * side) / (4 * Math.tan(Math.PI / 5.0));
        return area;
    }
}