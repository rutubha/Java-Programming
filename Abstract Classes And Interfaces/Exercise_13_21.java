import java.util.Scanner;

class Exercise_13_21 {
    public static void main(String[] args) {
        //Scanner object
        Scanner in = new Scanner(System.in);

        //Prompt the user to enter the a, b ,c
        System.out.print("Enter a, b, c: ");
        Rational a = new Rational(in.nextLong(), 1);
        Rational b = new Rational(in.nextLong(), 1);
        Rational c = new Rational(in.nextLong(), 1);

        //Compute h and k
        //h = -b / 2a
        Rational h = new Rational(((-1 * b.getNumerator())), 2 * a.getNumerator());
        
        //k = f(h) = a * h * h + b * h + c
        Rational k = (a.multiply(h.multiply(h)).add(b.multiply(h))).add(c);

        //Display result
        System.out.println("h is " + h.toString() + " k is " + k.toString());
        in.close();
    }    
}
