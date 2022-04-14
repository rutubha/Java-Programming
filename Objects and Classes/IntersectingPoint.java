class IntersectingPoint {
    private double x1, x2, x3, x4, y1, y2, y3, y4;
    double a,b,c,d,f,e;

    IntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) { 
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.x3 = x3; this.y3 = y3;
        this.x4 = x4; this.y4 = y4;
    }

    void setEquation() { 
        a = (y1 -y2);
        b = (-1*(x1 - x2));
        e = ((y1 - y2)*x1 - (x1 - x2)*y1);
        c = (y3 - y4);
        d = (-1*(x3 - x4));
        f = ((y3 - y4)*x3 - (x3 - x4)*y3);
    }
}
