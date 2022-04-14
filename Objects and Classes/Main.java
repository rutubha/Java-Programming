import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);

        //rectangle
        /*Rectangle r = new Rectangle(2, 2);

        System.out.println("Rectangle width and hight is "+r.width+" and "+r.height);

        System.out.println("Recatangle area is "+r.getArea());

        System.out.println("Recatangle Perimeter is "+r.getPerimeter());

        System.out.print("Enter new width and height :");
        double newWidth = in.nextDouble();
        double newHeight = in.nextDouble();

        r.setWidthHeigth(newWidth, newHeight);

        System.out.println("Rectangle new width and hight is "+r.width+" and "+r.height);*/

        //Stock
       /* Stock s = new Stock("ORCL", "Oracle Corporation");
        s.setPreviousClosingPrice(34.5);
        s.setCurrentPrice(34.35);

        double changePercentage = s.getChangePercentage();

        System.out.println("Stock name and symbol is "+s.name+" and "+s.symbol);
        System.out.println("Stock pervious closing price and current price is "+s.previousClosingPrice+" and "+s.currentPrice);
        System.out.println("Stock price change in percentage is "+String.format("%.2f", changePercentage));*/

        //Random
        /*Random r = new Random();
        int count = 0;

        while(count < 100) {
            int number = r.nextInt(49); 
             
            if(number != 0) {
                System.out.print(number+" ");
                count++;
                
                if(count % 10 == 0) { 
                    System.out.println("");
                }
            }
        }*/

        //StopWatch

        //genarate 100000 numbers
        /*int[] array = new int[10000];

        for(int i = 0; i < array.length; i++) { 
            array[i] = (int)(Math.random()*100000);
        }

        //Create Watch Object
        StopWatch watch = new StopWatch();

        watch.start();
        selsection_sort(array);
        watch.stop();

        System.out.println("Time taken to sort 100000 number is "+watch.getElapsedTime()+" ms");*/


        //Account
        /*Account a = new Account();  
        a.setID(1122);
        a.setBalance(20000);
        a.setAnnualInterestRate(4.5);
        System.out.println("Account Details\n ID: "+a.getID()+"\nBalance: "+a.getBalance()+"\nMonthly Interset: "+
                            a.getMonthlyInterest()+"\ncreated Date: "+a.getCreatedDate());

        a.withdraw(2500);
        System.out.println("Account Details\n ID: "+a.getID()+"\nBalance: "+a.getBalance()+"\nMonthly Interset: "+
                            a.getMonthlyInterest()+"\ncreated Date: "+a.getCreatedDate());

        a.deposite(3000);
        System.out.println("Account Details\n ID: "+a.getID()+"\nBalance: "+a.getBalance()+"\nMonthly Interset: "+
                            a.getMonthlyInterest()+"\ncreated Date: "+a.getCreatedDate()); */
                            
        //Fan
       /* Fan f = new Fan(3, true, 12, "green");
        Fan f2 = new Fan(2, false, 6, "red");

        System.out.println("fan1 : \n"+f.toString()+"\nfan2 : \n"+f2.toString());*/

        //RegularPolygon
        /*RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(8, 6);
        RegularPolygon p3 = new RegularPolygon(12, 5, 6.6, 8.2);

        double p1_perimeter = p1.getPerimeter();
        double p1_area = p1.getArea();
        double p2_perimeter = p2.getPerimeter();
        double p2_area = p2.getArea();
        double p3_perimeter = p3.getPerimeter();
        double p3_area = p3.getArea();

        System.out.println("P1 polygone perimeter and area is "+p1_perimeter+" and "+p1_area);
        System.out.println("P2 polygone perimeter and area is "+p2_perimeter+" and "+p2_area);
        System.out.println("P3 polygone perimeter and area is "+p3_perimeter+" and "+p3_area);*/

        //quadraticEquation
        /*QuadraticEquation qe = new QuadraticEquation(1, 2, 1);

        double discriminant = qe.getDiscriminant();

        if(discriminant == 0) { 
            System.out.println("The equation has one root "+qe.getRoot1(discriminant));
        } else if(discriminant < 0) { 
            System.out.println("The equation has no real root ");
        } else {
            System.out.println("The equation has two root "+qe.getRoot1(discriminant)+" and "+qe.getRoot2(discriminant));
        }*/

        //LinearEquation
        /*LinearEquation le = new LinearEquation(9, 4.0, -6.0, 3.0, -5.0, -21.0);

        boolean solvable = le.isSolvable();

        if(solvable) { 
            double x = le.getX();
            double y = le.getY();

            System.out.println("x is "+x+" and y is "+y);
        } else { 
            System.out.println("The equation has no solution.");
        }*/

        //IntersectingPoint
        IntersectingPoint ip = new IntersectingPoint(2, 2, 7, 6.0, 4.0, 2.0, -1.0, -2.0);

        //Create line eqution
        ip.setEquation();
        
        LinearEquation le = new LinearEquation(ip.a, ip.b, ip.e, ip.c, ip.d, ip.f);

        //solve equation 
        boolean solvable = le.isSolvable();
        if(solvable) { 
            double x = le.getX();
            double y = le.getY();
            System.out.println("The intersecting points is at ("+String.format("%.5f", x)+","+String.format("%.5f", y)+")");
        } else { 
            System.out.println("The two lines are parallel.");
        }
    }

    /*public static void selsection_sort(int[] array) { 
        for(int i = 0; i < array.length; i++) { 
            int minIndex = i;
            for(int j = i; j < array.length; j++) { 
                if(array[minIndex] > array[j]) { 
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }*/
}
