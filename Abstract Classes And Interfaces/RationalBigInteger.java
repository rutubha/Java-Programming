import java.math.BigInteger;

class RationalBigInteger extends Number implements Comparable<RationalBigInteger> {
    //BigInteger Array for numerator and denominator
    BigInteger[] r = new BigInteger[2];
    
    //Constructor
    public RationalBigInteger(){

    }

    //Constructor with specified numerator and denominator
    public RationalBigInteger(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        r[0] = (numerator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : new BigInteger("-1")).multiply(numerator.divide(gcd));
        r[1] = denominator.divide(gcd);
    }

    //Find GCD of two numbers
    /*Here GCD use to find smallest rational number 
        e.g. 5 / 10 smallest rational is 1 / 2 */
    private static BigInteger gcd(BigInteger numerator, BigInteger denominator) {
        BigInteger n1 = numerator;
        BigInteger n2 = denominator;
        BigInteger gcd = BigInteger.ONE;

        for(BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)){
            if(n1.remainder(k).compareTo(BigInteger.ZERO) == 0 && n2.remainder(k).compareTo(BigInteger.ZERO) == 0) {
                gcd = k;
            }
        }

        return gcd;
    }

    //Return numerator
    public BigInteger getNumerator() {
        return r[0];
    }

    //Return denominator
    public BigInteger getDenominator() {
        return r[1];
    }

    //Add a rational numbet to this rational
    /* a/b + c/d = ad + bc / bd */
    public RationalBigInteger add(RationalBigInteger secondRational) {
        BigInteger n = (r[0].multiply(secondRational.getDenominator())).add(r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new RationalBigInteger(n, d);
    }

    //Subtract a rational number from this rational
     /* a/b - c/d = ad - bc / bd */
     public RationalBigInteger subtract(RationalBigInteger secondRational) {
        BigInteger n = (r[0].multiply(secondRational.getDenominator())).subtract(r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new RationalBigInteger(n, d);
    }

    //Multiply a rational number by this rational
    /* a/b * c/d = ab/cd */
    public RationalBigInteger multiply(RationalBigInteger secondRational) {
        BigInteger n = r[0].multiply(secondRational.getNumerator());
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new RationalBigInteger(n, d);
    }

    //divide a rational number by this rational
    /* a/b / c/d = ad / bc */
    public RationalBigInteger divide(RationalBigInteger secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator());
        BigInteger d = r[1].multiply(secondRational.getNumerator());
        return new RationalBigInteger(n, d);
    }

    @Override
    public String toString() {
        if (r[1].compareTo(BigInteger.ONE) == 0)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }

    @Override
    public boolean equals(Object obj) {
        if((this.subtract((RationalBigInteger)(obj))).getNumerator().compareTo(BigInteger.ZERO) == 0)
            return true;
        else 
            return false;        
    }

    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return this.getNumerator().doubleValue() / this.getDenominator().doubleValue();
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public int compareTo(RationalBigInteger o) {
        if(this.subtract((RationalBigInteger)o).getNumerator().compareTo(BigInteger.ZERO) > 0)
            return 1;
        else if (this.subtract((RationalBigInteger)o).getNumerator().compareTo(BigInteger.ZERO) < 0)
            return -1;
        else
            return 0;
    }
}
