import java.math.BigInteger;

class Exercise_13_18 {
    public static void main(String[] args) {
        
        //Execute while loop and sum the session
        int i = 1;
        int j = 2;

        //Create rational class to sum
        RationalBigInteger total = new RationalBigInteger(BigInteger.ZERO, BigInteger.ONE);
        while(i <= 99 && j <= 100) {
            //Create rational object
            RationalBigInteger r1 = new RationalBigInteger(new BigInteger("" + i), new BigInteger("" + j));
            i += 1 + (i * 2);
            j += (j * 2);
            total = total.add(r1);
        }

        //display result
        System.out.println("Sum is " + total.toString());
    }    
}
