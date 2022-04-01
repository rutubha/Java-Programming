class Rational extends Number implements Comparable<Rational> {

    //Array for numerator and denominator
    private long[] r = new long[2];
    
    //Constructor
    public Rational(){

    }

    //Constructor with specified numerator and denominator
    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.r[0] = (numerator > 0 ? 1 : -1) * (numerator / gcd);
        this.r[1] = (Math.abs(denominator) / gcd);
    }

    //Find GCD of two numbers
    /*Here GCD use to find smallest rational number 
        e.g. 5 / 10 smallest rational is 1 / 2 */
    private static long gcd(long numerator, long denominator) {
        long n1 = Math.abs(numerator);
        long n2 = Math.abs(denominator);
        int gcd = 1;

        for(int k = 1; k <= n1 && k <= n2; k++) {
            if(n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }

        return gcd;
    }

    //Return numerator
    public long getNumerator() {
        return r[0];
    }

    //Return denominator
    public long getDenominator() {
        return r[1];
    }

    //Add a rational numbet to this rational
    /* a/b + c/d = ad + bc / bd */
    public Rational add(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator() + r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    //Subtract a rational number from this rational
     /* a/b - c/d = ad - bc / bd */
    public Rational subtract(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator() - r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    //Multiply a rational number by this rational
    /* a/b * c/d = ab/cd */
    public Rational multiply(Rational secondRational) {
        long n = r[0] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    //divide a rational number by this rational
    /* a/b / c/d = ad / bc */
    public Rational divide(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator();
        long d = r[1] * secondRational.getNumerator();
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (r[1] == 1)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }

    @Override
    public boolean equals(Object obj) {
        if((this.subtract((Rational)(obj))).getNumerator() == 0)
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
        return r[0] * 1.0 / r[1];
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if(this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}