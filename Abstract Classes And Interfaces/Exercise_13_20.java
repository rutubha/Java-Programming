import java.util.Scanner;

class Exercise_13_20 {
    public static void main(String[] args) {
        //Scanner object
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the values of a, b and c
        System.out.print("Enter the a, b, c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
    
        //Compute discriminant b*b - 4 * a * c
        double discriminant = b * b - (4 * a * c);

        //compute root
        if(discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 *a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 *a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if(discriminant == 0) {
            System.out.println("The root is " + ((-b + Math.sqrt(discriminant)) / (2 *a)));
        } else {
            Complex root1 = new Complex( -b / (2 * a), Math.sqrt(2 * a));
            Complex root2 = new Complex( -b / (2 * a), -Math.sqrt(2 * a));
            System.out.println("The root is " + root1.toString() + " and " + root2.toString());
        }

        in.close();
    }    
}
