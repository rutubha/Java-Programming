class Exercise_13_5 {
    public static void main(String[] args) {
        
        //Create two rectangle
        GeometricObject r1 = new Rectangle(3, 3, "grean", true);
        GeometricObject r2 = new Rectangle(3, 4, "grean", false);

        //Create two Circle
        GeometricObject c1 = new Circle(3.4, "red", false);
        GeometricObject c2 = new Circle(3.5);

        System.out.println("From r1 and r2 max ractangle is " + GeometricObject.max(r1, r2));
        System.out.println("From c1 and c2 max Circle is " + GeometricObject.max(c1, c2));
    }    
}
