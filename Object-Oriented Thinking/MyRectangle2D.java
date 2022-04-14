class MyRectangle2D {
    private double x, y, height, width;

    MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    MyRectangle2D(double x,double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getHeight() {
        return height;
    }

    double getWidth() {
        return width;
    }

    double getArea() {
        return height * width;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    boolean contains(double x1, double y1) {
        if((x + (width/2) >= x1 && y + (height/2) >= y1) || x - (width/2) <= x1 && y - (height/2) <= y1) {
            return true;
        } else {
            return false;
        }
    }
    
    boolean contains(MyRectangle2D r) {
        boolean a1 = false;
        boolean a2 = false;
        boolean a3 = false;
        boolean a4 = false;
        double w1 = r.getWidth();
        double h1 = r.getHeight();

        if((x + (width/2)) >= (r.getX() + (w1/2)) && (y + (height/2)) >= (r.getY() + (h1/2))) {
            a1 = true;
        }

        if((x + (width/2)) >= (r.getX() + (w1/2)) && (y - (height/2)) <= (r.getY() - (h1/2))) {
            a2 = true;
        }

        if((x - (width/2)) <= (r.getX() - (w1/2)) && (y + (height/2)) >= (r.getY() + (h1/2))) {
            a3 = true;
        }

        if((x - (width/2)) <= (r.getX() - (w1/2)) && (y - (height/2)) <= (r.getY() - (h1/2))) {
            a4 = true;
        }

        return (a1 && a2 && a3 && a4);
    }

    boolean overlap(MyRectangle2D r) {
        boolean a1 = false;
        boolean a2 = false;
        boolean a3 = false;
        boolean a4 = false;
        double w1 = r.getWidth();
        double h1 = r.getHeight();

        if((x + (width/2)) >= (r.getX() + (w1/2)) && (y + (height/2)) >= (r.getY() + (h1/2))) {
            a1 = true;
        }

        if((x + (width/2)) >= (r.getX() + (w1/2)) && (y - (height/2)) <= (r.getY() - (h1/2))) {
            a2 = true;
        }

        if((x - (width/2)) <= (r.getX() - (w1/2)) && (y + (height/2)) >= (r.getY() + (h1/2))) {
            a3 = true;
        }

        if((x - (width/2)) <= (r.getX() - (w1/2)) && (y - (height/2)) <= (r.getY() - (h1/2))) {
            a4 = true;
        }

        return (a1 || a2 || a3 || a4);
    }
}
