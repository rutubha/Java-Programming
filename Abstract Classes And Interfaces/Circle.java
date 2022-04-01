class Circle extends GeometricObject {
    private double radius;

    Circle() {
        this(1);
    }

    Circle(double raduis) {
        this.radius = raduis;
    }

    Circle(double raduis, String color, boolean filled) {
        super(color, filled);
        this.radius = raduis;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nReduis: " + radius;
    }
}
