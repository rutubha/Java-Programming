class LinearEquation {
    private double a, b, c, d, e, f;
    
    LinearEquation(double a, double b, double e, double c, double d, double f) { 
        this.a = a ; this.b =b ; this.e = e;
        this.c = c; this.d = d; this.f = f;
    }

    double getA() {
        return a;
    }
    double getB() {
        return b;
    }
    double getC() {
        return c;
    }
    double getD() {
        return d;
    }
    double getE() {
        return e;
    }
    double getF() {
        return f;
    }

    boolean isSolvable() { 
        double divider = (a*d - b*c);

        if(divider == 0) { 
            return false;
        } else {
            return true;
        }
    }

    double getX() { 
        return (double)(e*d - b*f)/(a*d - b*c);
    }

    double getY() { 
        return (double)(a*f - e*c)/(a*d - b*c);
    }
}
