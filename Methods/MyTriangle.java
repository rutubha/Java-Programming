public class MyTriangle {
   
   
    //return true if sum of any two sides is greater than the third side
    public static boolean isValid (int side1, int side2, int side3) {
        if (side1 + side2 > side3 || side1 + side3 > side2 || side3 + side2 > side1) {
            return true;
        } else {
            return false;
        }
    }

    //return the area of triangle
    public static double getArea(int side1, int side2, int side3) {
        double s = ( side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
