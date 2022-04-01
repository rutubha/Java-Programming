class Square extends GeometricObject implements Colorable {
    private double side;

    Square() {
        this(2);
    }

    Square(double side) {
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String howToColor() {
        return "Color all the four side";
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide " + side;
    }
}
