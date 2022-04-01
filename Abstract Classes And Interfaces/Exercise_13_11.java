class Exercise_13_11 {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        //Create Octagon object
        Octagon octagon1 = new Octagon(5);
        
        System.out.println("Octagone area : " + octagon1.getArea() + " and perimeter " + octagon1.getPerimeter());


        //Clone the object
        System.out.println("Cloning octagon1 to octagon2.....");
        Octagon octagon2 = (Octagon)octagon1.clone();

        //Compare ocatgon using compareTo mathod
        System.out.println("Comparing ocatgon.....");
        System.out.println("ocatgon1 is equal to ocatgone2? " + octagon1.compareTo(octagon2));
        System.out.println("ocatagon1 and octagon2 is same refrence? " + (octagon1 == octagon2));
    }    
}
