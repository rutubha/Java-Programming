class Circle {
    private double reduis;
    
    public Circle() {
        this.reduis = 1;
    }

    public Circle (double reduis) { 
        this.reduis = reduis;
    }

    public double getReduis() {
        return reduis;
    }

    public void setReduis(double reduis) {
        this.reduis = reduis;
    }

    public double getArea() {
        return Math.PI * this.reduis * this.reduis;
    }

    @Override
    public String toString() {
        return "Reduis " + this.reduis + ", Area "+ this.getArea();
    }
}
