import java.math.BigInteger;

class Exercise_13_15 {
    public static void main(String[] args) {
        //Create rational number with BigInteger
        RationalBigInteger r1 = new RationalBigInteger(new BigInteger("400000"), new BigInteger("500000"));
        RationalBigInteger r2 = new RationalBigInteger(new BigInteger("30000"), new BigInteger("70000"));


        // ??Display result
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }    
}
