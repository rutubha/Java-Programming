class Rectangle extends GeometricObject {
    private double width, height;

    Rectangle() {
        this(2, 2);
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + width +"\tHeight: " + height;
    }
}
