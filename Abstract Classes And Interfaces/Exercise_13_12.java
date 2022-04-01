//Create array of length 4 of GeometricObject and sum the all object area
class Exercise_13_12 {
    public static void main(String[] args) {
        GeometricObject[] objects = {new Circle(5), new Circle(8), new Rectangle(3, 4), new Rectangle(4, 2)};

        //Display Result
        System.out.println("Total area of elements in array " + sumArea(objects));
    }

    public static double sumArea(GeometricObject[] objects) {
        double totalArea = 0;
        for(int i = 0; i < objects.length; i++) {
            totalArea += objects[i].getArea();
        }

        return totalArea;
    }
}
