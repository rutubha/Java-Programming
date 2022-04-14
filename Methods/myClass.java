import java.util.Scanner;
class myClass {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the sides of triangle
        System.out.println("Enter the sides of triangle (e.g. 3 4 5 ):");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        //check wether its valid trinagle or not
        System.out.println("This is valid triangle :"+MyTriangle.isValid(side1, side2, side3));

        //compute triangle area
        System.out.println("trianle area is :"+MyTriangle.getArea(side1, side2, side3));
    }    
}
