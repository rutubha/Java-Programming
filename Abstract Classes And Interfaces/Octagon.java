class Octagon extends GeometricObject implements Cloneable {
    private double side;

    //Constractor
    public Octagon() {
        this(1);
    }

    public Octagon(double side) {
        this.side = side;
    }
    
    public Octagon(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + (4.0 / Math.sqrt(2)) * side * side);
    }

    @Override
    public double getPerimeter() {
        return 8 *side;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Octagon cloneOctagon = (Octagon)super.clone();
        return cloneOctagon;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + side;
    }
}
