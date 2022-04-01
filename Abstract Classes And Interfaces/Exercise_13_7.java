class Exercise_13_7 {
    public static void main(String[] args) {
        
        //Create GeometricObject array
        GeometricObject[] objects = {new Square(4.5), new Square(14), new Square(8.2), new Square(12), new Square(10)};

        //Display area and howToColor for each object
        for(int i = 0; i < objects.length; i++) {
            System.out.println("Square #" + (i + 1));
            System.out.println("Area : " + String.format("%.2f", objects[i].getArea()));
            System.out.println("How to Color : " + ((Square)objects[i]).howToColor());
        }
    }    
}
