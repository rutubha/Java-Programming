import java.util.*;

//import java.util.Scanner;;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Time object
       /* Time t = new Time();
        Time t1 = new Time(555550000);

        System.out.println(t.getHour()+":"+t.getMinute()+":"+t.getSecond());
        System.out.print("555550000 times : ");
        System.out.print(t1.getHour()+":"+t1.getMinute()+":"+t1.getSecond());*/

        //BMI Object
        /*BMI bmi = new BMI("x20y", 20, 146, 0, 70);

        System.out.println(bmi.getName()+" of age "+bmi.getAge()+
                            " BMI index is "+bmi.getBMI()+" which is "+bmi.getInterpretion());*/

        //MyIntger Object
        //MyInteger mi = new MyInteger(11);

        //MyPoint
        /*MyPoint p = new MyPoint();
        MyPoint p1 = new MyPoint(10, 30.5);

        double x = p.getX();
        double y = p.getY();
        double x1 = p1.getX();
        double y1 = p1.getY();

        double distance = p.distance(x, y, x1, y1);

        System.out.println("The distamce between two point is "+distance);*/

        //PrimeFactor
        /*PrimeFactor pf = new PrimeFactor(150);

        ArrayList<Integer> a = pf.getPrimeFactor();

        System.out.print("Prime Factor of the number is ");
        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i)+" ");
        }*/

        //Prime Number
        /*PrimeNumber pm = new PrimeNumber(120);

        ArrayList<Integer> a = pm.getAllPrime();

        System.out.println(("Prime number from 0 to "+pm.getNum()+" is "));

        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i)+" ");
        }*/

        //ATM
       /*ATM machine = new ATM();
        int id = 0;
        int choice = 4;

        while(id != -1){
            if(choice == 4){
                System.out.print("Enter an id : ");
                id = in.nextInt();
            }

            System.out.println("\n Main menu");
            System.out.println("1 : Check balance");
            System.out.println("2 : withdraw");
            System.out.println("3 : deposite");
            System.out.println("4 : exit");
            System.out.print("Enter the coice : ");
            choice = in.nextInt();

            if(choice == 1){
                System.out.println("The balance is "+machine.getBalance(id));
            } else if(choice == 2){
                System.out.print("Enter an amount to withdraw : ");
                double withdraw = in.nextDouble();
                machine.withdraw(withdraw, id);
            } else if(choice == 3){
                System.out.print("Enter an amount to deposite : ");
                double deposite = in.nextDouble();
                machine.deposite(deposite, id);
            } else if(choice == 4){
                continue;
            } else {
                System.out.println("Enter the valid choice.");
            }
        }*/    

    //Tax

        /*double tax = 50000;
        int[][] brackets = {
            {27050, 65550, 136750, 297350},
            {45200, 109250, 166500, 297350},                         
            {22600, 54625, 83250, 148675},
            {36250, 93650, 151650, 287351}
        };
        double[] rates = {0.15, 0.275, 0.305, 0.355, 0.391};

        Tax t = new Tax();

        t.setBrackets(brackets);
        t.setRates(rates);
    
        while(tax < 60000){
            t.setTaxableIncome(tax);
            System.out.println("For STATUS ");
            for(int i = 0; i < 4; i++){
                t.setFillingStatus(i);
                System.out.println(" Tax is "+t.getTax());
            }
            tax = tax + 1000;
            System.out.println();
        }*/

    //Course
    
        /*Course MPI = new Course("MPI");
    
        MPI.addStudent("RUUTURAJ");
        MPI.addStudent("SUNIL");
        MPI.addStudent("PARTH");
        MPI.addStudent("SHAKTI");

        int numberOfStudent = MPI.getNumberOfStudent();
        System.out.println("Number of Student in this Course is "+numberOfStudent);

        String[] studentName = MPI.getStudent();

        for(int i = 0; i < MPI.getNumberOfStudent(); i++) {
            System.out.println(studentName[i]+" ");
        }

        MPI.dropStudent("KRUNAL");
        MPI.dropStudent("PARTH");
        System.out.println("Number of student in this course is "+MPI.getNumberOfStudent());

        MPI.clear();
        System.out.println("Number of student in this course is "+MPI.getNumberOfStudent());*/


    //Queue
        /*Queue q1 = new Queue();

        System.out.println("Defualt size of queue is "+ q1.getSize());
        
        for(int i = 0; i < 20; i++){
            q1.enqueue(i+1);
        }

        System.out.println("After size of queue is "+ q1.getSize());

        for(int i = 0; i < 20; i++){
            System.out.print(" "+ q1.dequeue());
        }

        System.out.println("After a dequeue pointer position is "+ q1.getSize());
        System.out.println("After a dequeue all element is queue is empty "+ q1.empty());
        for(int i = 0; i < 20; i++){
            System.out.print(" "+ q1.dequeue());
        }*/

    //CIrcle2D
        /*Circle2D c1 = new Circle2D();
        Circle2D c2 = new Circle2D(1, 1, 1);
        Circle2D c3 = new Circle2D(2, 2, 4);
        
        System.out.println("C1 circle x and y postion is "+c1.getX() +" and "+ c1.getY() + ". Redius is " + c1.getRedius());
        System.out.println("C1 circle Area and Perimeter is "+c1.getArea()+" and "+c1.getPerimeter());

        System.out.println("Point(1,2) inside circle :"+c1.contains(1, 2));
        System.out.println("Point(1,-4) inside circle :"+c1.contains(1, -4));
        System.out.println("circle 2 is inside the circle 1 :"+c1.contains(c2));
        System.out.println("circle 2 is overlap the circle 1 :"+c1.overlap(c2));
        System.out.println("circle 3 is inside the circle 1 :"+c1.contains(c3));
        System.out.println("circle 3 is overlap the circle 1 :"+c1.overlap(c3));*/

    //Triangle2D

        /*Triangle2d t1 = new Triangle2d(3.5, 3, 5.2, 4, 6, 4.5);

        System.out.println("t1 Triangle Area and Perimeter is "+t1.getArea()+" and "+t1.getPerimeter());

        System.out.println("Point(4, 4) inside trinagle t1 : "+t1.contain(4, 4));
        System.out.println("t2 is insdie the t1 : "+t1.contain(new Triangle2d(3.9, 3, 5, 2, 2, 4.4)));
        System.out.println("t3 overlap the t1 : "+t1.overlap(new Triangle2d(3.9, 3, 5, 2, 2, 4.4)));*/

       /* MyRectangle2D r2 = new MyRectangle2D(3, 2, 6.5, 5.9);

        System.out.println("r2 Rectangle Area and Perimeter is "+r2.getArea()+" and "+r2.getPerimeter());

        System.out.println("Point(4, 4) inside Rectangle t1 : "+r2.contains(4, 4));

        System.out.println("r3 is insdie the r2 : "+r2.contains(new MyRectangle2D(5, 6, 11.5, 4.2)));

        System.out.println("r4 overlap the r2 : "+r2.overlap(new MyRectangle2D(4, 6, 3.3, 6.4)));*/

    //MyDate
        /*MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(43455555133101L);
        MyDate d3 = new MyDate(2021, 10, 11);
        
        System.out.println("Current date is "+d1.getYear()+"/"+d1.getMonth()+"/"+d1.getDate());
        System.out.println("43455555133101L ms date is "+d2.getYear()+"/"+d2.getMonth()+"/"+d2.getDate());
        System.out.println("Current date is "+d3.getYear()+"/"+d3.getMonth()+"/"+d3.getDate());*/

    //BoundingRectangle

        /*double[][] points = new double[5][2];

        System.out.println("Enter five points :");
        for(int i = 0; i < points.length; i++) {
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
        }

        BoundingRectangle br = new BoundingRectangle(points);
        double[] center = br.getCenter();
        System.out.println("The bounding rectangle's center ("+center[0]+","+center[1]+"), width "+br.getWidth()+", height "+br.getHeight());*/

    //MyString
        /*char[] s = {'R', 'U','T', 'U', 'R', 'A', 'J'};

        MyString s1 = new MyString(s);

        System.out.println("Char at "+s1.charAt(2));

        char[] s2 = {'R', 'U','T', 'u', 'A', 'J'};

        MyString s3 = new MyString(s);

        System.out.println("s1 and s3 are equals "+s1.equals(s3));*/

        /*String s1 = "Ruturaj";
        String s2 = "Rutusaj";
        System.out.println(s2.compareTo(s1));
        char[] s = s1.toCharArray();
        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
        System.out.println(s1.valueOf(true));*/

        /*char[] ch = {'r','u','t','u','r','a','j'};
        char[] ch1 = {'r','u','t','u','s','a','j'};
        MyString2 s1 = new MyString2(ch);

        MyString2 sub = s1.subString(4);
        for(int i = 0; i < sub.s.length; i++) {
            System.out.print(sub.s[i]+" ");
        }

        System.out.println(s1.compare("rutur"));

        MyString2 uppS = s1.toUpperCase();

        for(char s: uppS.s) {
            System.out.print(s+" ");
        }
        
        MyString2 val = MyString2.valueOf(true);
        for(char s: val.s) {
            System.out.print(s+" ");
            
        }*/

        /*//how to get all method of class and all other stuff of class
        //creat object of the class
        Character i = 'r'; 
        //by getClass().getMethod() return the method and store in the Method type date in array
        Method[] me = i.getClass().getMethods();

        //now by method name return by the getName()
        for(int j = 0; j < me.l; j++) {
            System.out.println(me[j].getName());
        }*/
        
        
       /* MyCharacter ch = new MyCharacter('R');

        System.out.println(ch.equals('r'));
        System.out.println(Character.hashCode('R')+" "+ch.hashCode());
        System.out.println(ch.toLowerCase());
        System.out.println(ch.isUpperCase());*/


      /*//MyStringBuilder1

        MyStringBuilder1 s = new MyStringBuilder1("Ruturajsinh");

        MyStringBuilder1 s1 = new MyStringBuilder1(" Rathod");
        
        MyStringBuilder1 s2 = s.append(s1);

        MyStringBuilder1 s3 = s.append(9);

        System.out.println("S2 string length is "+s2.length());

        System.out.println("S2 string at index 5 character present is "+s2.charAt(5));

        MyStringBuilder1 s4 = s1.toLowercase();
        MyStringBuilder1 s5 = s.substring(0, 7);

        System.out.println("s object tostring mwthod "+s.toString());
        System.out.println("s1 object tostring mwthod "+s1.toString());
        System.out.println("s2 object tostring mwthod "+s2.toString());
        System.out.println("s3 object tostring mwthod "+s3.toString());
        System.out.println("s4 object tostring mwthod "+s4.toString());
        System.out.println("s5 object tostring mwthod "+s5.toString());*/

    //MyStringBuilder2

        MyStringBuilder2 s = new MyStringBuilder2("Ruturajsinh");
        char[] chars = {'R','a','t','h','o','d'};

        MyStringBuilder2 s1 = s.insert(7, new MyStringBuilder2(chars));

        MyStringBuilder2 s2 = s1.reverse();

        MyStringBuilder2 s3 = s.subString(5);

        MyStringBuilder2 s4 = s.toUpperCase();

        System.out.println("s object string is "+s.s);
        System.out.println("s1 object string is "+s1.s);
        System.out.println("s2 object string is "+s2.s);
        System.out.println("s3 object string is "+s3.s);
        System.out.println("s4 object string is "+s4.s);
    }
}