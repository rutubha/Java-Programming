class Trinagle {
    double side1;
    double side2;
    double side3;
    
    Trinagle() throws IllegalTrinagleException {
        this(1, 1, 1);
    }

    Trinagle(double side1, double side2, double side3) throws IllegalTrinagleException{
    
        if(side1 + side2 > side3 || side2 + side3 > side1 || side3 + side1 > side2) {
            throw new IllegalTrinagleException("Triangle rule voilate");
         }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 =side3;
    }
}

class IllegalTrinagleException extends Exception {
    IllegalTrinagleException(String exceptionText) {
        super(exceptionText);
    }
}