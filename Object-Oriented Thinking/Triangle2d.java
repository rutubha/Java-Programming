class Triangle2d {
    private double x1, y1, x2, y2, x3, y3;
    
    Triangle2d() {
        x1 = 0;
        y1 = 0;
        x2 = 1;
        y2 = 1;
        x3 = 2;
        y3 = 5;
    }

    Triangle2d(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    double getX1() {
        return x1;
    }

    double getX2() {
        return x2;
    }

    double getX3() {
        return x3;
    }

    double getY1() {
        return y1;
    }

    double getY2() {
        return y2;
    }

    double getY3() {
        return y3;
    }

    double getArea() {
        return (1.0 / 2) * Math.abs(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
    }

    double getPerimeter() {
        double a = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        double b = Math.sqrt((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1));
        double c = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));

        return a + b + c;
    }

    boolean contain(double x, double y) {
        double area = getArea();
        double a1 = (1.0 / 2) * Math.abs(x1*(y2 - y) + x2*(y - y1) + x*(y1 - y2));
        double a2 = (1.0 / 2) * Math.abs(x1*(y - y3) + x*(y3 - y1) + x3*(y1 - y));
        double a3 = (1.0 / 2) * Math.abs(x*(y2 - y3) + x2*(y3 - y) + x3*(y - y2));

        return (area == (a1 + a2 + a3));
    }

    boolean contain(Triangle2d triangle) {
        boolean a1 = contain(triangle.getX1(), triangle.getY1());
        boolean a2 = contain(triangle.getX2(), triangle.getY3());
        boolean a3 = contain(triangle.getX3(), triangle.getY3());

        return (a1 && a2 && a3);
    }

    boolean overlap(Triangle2d triangle) {
        boolean a1 = contain(triangle.getX1(), triangle.getY1());
        boolean a2 = contain(triangle.getX2(), triangle.getY3());
        boolean a3 = contain(triangle.getX3(), triangle.getY3());

        return (a1 || a2 || a3);
    }
}
