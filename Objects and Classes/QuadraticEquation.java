class QuadraticEquation { 
    private int a, b, c;

    QuadraticEquation(int a, int b, int c) { 
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    double getDiscriminant() { 
        return (b*b) - (4*a*c);
    }

    double getRoot1(double Discriminant) { 
        if (Discriminant < 0) {
            return 0;
        } else {
            return ((-1*b) + (Math.sqrt(Discriminant))) / (2*a);
        }
    }

    double getRoot2(double Discriminant) { 
        if(Discriminant < 0) { 
            return 0;
        } else {
            return ((-1*b) - (Math.sqrt(Discriminant))) / (2*a);
        }
    }
}