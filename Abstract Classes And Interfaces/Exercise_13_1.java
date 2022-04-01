import java.util.Scanner;

public class Exercise_13_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sides of the Triangle: ");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();
        System.out.println("Enter the color and 1 to filled and 0 to not filled: ");
        String color = in.next();
        int fill = in.nextInt();

        // check filled input valid or not
        while (true) {
            if (!(fill == 0 || fill == 1)) {
                System.out.println("Enter valid input for filled.");
                System.out.println("If you fill the color than 1 otherwise 0: ");
                fill = in.nextInt();
                continue;
            }
            break;
        }

        boolean filled = fill == 0 ? false : true;

        //Create Trinagle object
        GeometricObject t1 = new Triangle(side1, side2, side3, color, filled);

        System.out.println("Traingle Area is  " + String.format("%.2f", t1.getArea()));
        System.out.println("Traingle Perimeter is " + String.format("%.2f", t1.getPerimeter()));
        System.out.println("Traingle color is " + t1.getColor());
        System.out.println("Traingle color is filled: " + t1.isFilled());

        in.close();
    }
}
