class Triangle extends GeometricObject{
    private double side1, side2, side3;
    
    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }
    
    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = getS();
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    private double getS() {
        return ( side1 + side2 + side3) / 2.0;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
        System.out.println("Color is set to "+color+" via Triangle class");
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
