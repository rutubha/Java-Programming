import java.util.Scanner;

class Exercise_13_17 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Scanner object
        Scanner in = new Scanner(System.in);

        //Prompt the user to enter the compex number
        System.out.println("Enter the first complex number e.g.(4 5): ");
        double r1 = in.nextDouble();
        double i1 = in.nextDouble();
        System.out.println("Enter the second complex number e.g.(4 5): ");
        double r2 = in.nextDouble();
        double i2 = in.nextDouble();
        in.close();

        //Create complex number
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        //Perfome addition, subtraction, multiplication, division and absoulate value
        System.out.println("(" + c1.toString() + ") + (" + c2.toString() + ") = " + c1.add(c2).toString());
        System.out.println("(" + c1.toString() + ") - (" + c2.toString() + ") = " + c1.subtract(c2).toString());
        System.out.println("(" + c1.toString() + ") * (" + c2.toString() + ") = " + c1.multiply(c2).toString());
        System.out.println("(" + c1.toString() + ") / (" + c2.toString() + ") = " + c1.divide(c2).toString());
        System.out.println("|" + c1.toString() + "| = " + c1.absoulate());
    }    
}
