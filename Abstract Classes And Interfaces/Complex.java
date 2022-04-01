class Complex implements Cloneable {
    private double realPart, imaginaryPart;

    public Complex() {
        this(0, 0);
    }

    public Complex(double realPart) {
        this(realPart, 0);
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public Complex add(Complex c1) {
        double newRealPart = this.realPart + c1.getRealPart();
        double newimaginaryPart = this.imaginaryPart + c1.getImaginaryPart();
        return new Complex(newRealPart, newimaginaryPart);
    }

    public Complex subtract(Complex c1) {
        double newRealPart = this.realPart - c1.getRealPart();
        double newimaginaryPart = this.imaginaryPart - c1.getImaginaryPart();
        return new Complex(newRealPart, newimaginaryPart);
    }

    public Complex multiply(Complex c1) {
        double newRealPart = (this.realPart * c1.getRealPart()) - (this.imaginaryPart * c1.imaginaryPart);
        double newimaginaryPart = (this.imaginaryPart * c1.getRealPart()) + (this.realPart * c1.imaginaryPart);
        return new Complex(newRealPart, newimaginaryPart);
    }

    public Complex divide(Complex c1) {
        double newRealPart = ((this.realPart * c1.getRealPart()) - (this.imaginaryPart * c1.imaginaryPart)) / 
                                (c1.getRealPart() * c1.getRealPart() + c1.getImaginaryPart() * c1.getImaginaryPart());
        double newimaginaryPart = ((this.imaginaryPart * c1.getRealPart()) + (this.realPart * c1.imaginaryPart)) /
                                (c1.getRealPart() * c1.getRealPart() + c1.getImaginaryPart() * c1.getImaginaryPart());
        return new Complex(newRealPart, newimaginaryPart);
    }

    public double absoulate() {
        return Math.sqrt((this.realPart * this.realPart + this.imaginaryPart * this.imaginaryPart));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Complex clone = (Complex)super.clone();
        return clone;
    }

    @Override
    public String toString() {
        return realPart + " + " + (imaginaryPart == 0 ? "" : imaginaryPart) + "i";
    }

}
