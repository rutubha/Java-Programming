class Circle2D {
    private double x, y;
    private double redius;
    
    Circle2D() {
        x = 0;
        y = 0;
        redius = 3;
    }

    Circle2D(int x, int y, int redius) {
        this.x = x;
        this.y = y;
        this.redius = redius;
    }

    double getX(){
        return this.x;
    }

    double getY() {
        return y;
    }

    double getRedius() {
        return redius;
    }

    double getArea() {
        return Math.PI * redius * redius;
    }

    double getPerimeter() {
        return Math.PI * 2 * redius;
    }

    boolean contains(double x, double y) {
        if(x <= redius + this.x && y <= redius + this.y) {
            return true;
        } else {
            return false;
        }
    }

    boolean contains(Circle2D circle) {
        if(circle.getRedius() < this.redius &&
            (circle.getX() + circle.getRedius()) <= (this.x + this.redius) &&
            (circle.getY() + circle.getRedius()) <= (this.y + this.redius) &&
            Math.abs(circle.getX() - circle.getRedius()) <= Math.abs(this.x - this.redius) &&
            Math.abs(circle.getY() - circle.getRedius()) <= Math.abs(this.y - this.redius)) {
        
            return true;
        } else {
            return false;
        }
    }

    boolean overlap(Circle2D circle) {
        if(circle.getX() + circle.getRedius() > this.x - this.redius ||
            circle.getY() + circle.getRedius() > this.y - this.redius ||
            circle.getX() - circle.getRedius() < this.x + this.redius ||
            circle.getY() - circle.getRedius() > this.y + this.redius) {
               
            return true;    
        } else {
            return false;
        }
    }
}

