class Exercise_13_14 {
    public static void main(String[] args) {
        
        //Create Rational Class object
        Rational r1 = new Rational(3, 4);

        System.out.println("Rational number r1 " + r1.toString());

        //Create Rational number
        Rational r2 = new Rational(4, 3);
        System.out.println("Rational number r2 " + r2.toString());

        //Add rational 1r1 int r2
        Rational r3 = r1.add(r2);
        System.out.println("Sum of the r1 and r2 " + r3.toString());
    }    
}
