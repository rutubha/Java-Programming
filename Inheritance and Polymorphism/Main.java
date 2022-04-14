import java.util.*;

class Main {
    public static void main(String[] args) {
        //Scanner Object
        Scanner in = new Scanner(System.in);
        in.close();

        //Triangle
        /*System.out.print("Enter the thre side of the Triangle : ");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();

        Triangle t = new Triangle(side1, side2, side3);

        System.out.print("Enter the color you want to filled : ");
        String color = in.next();
        color += in.nextLine();
        in.close();
        
        t.setColor(color);
        t.setFilled(true);

        System.out.println("Triangle area is "+String.format("%.2f", t.getArea()));
        System.out.println("Triangle perimeter is "+t.getPerimeter());
        System.out.println("Trangle color is "+t.getColor() + " and Created date is "+t.getDateCreated());
        System.out.println(t.toString());
        
        //This means you can Create Triangle object but access Properties that are in GeometricObject
        GeometricObject t1 = new Triangle(side1, side2, side3);
        System.out.println(t1.toString());
        t1.setColor("Light Blue");
        System.out.println(t1.getColor());*/


        //Person, Student, Employee, Staff, Facluty

        /*Student s = new Student("Senior");
        s.setName("Ruturaj");
        s.setAddress("Raska,Raska,Gujrat");
        s.setMobileNumber("9929934534");
        s.seteMail("ruturaj@gmail.com");

        System.out.println(s.toString());
        System.out.println("name "+s.getName()+"\n address "+s.getAddress());

        Employee e = new Employee("TCS", 25000);
        e.setName("XYZ");
        e.setAddress("Rajkot India");
        e.setMobileNumber("Nahi pata");
        e.seteMail("xyz@gmail.com");

        System.out.println(e.toString());

        Facluty f = new Facluty(7.5, 4);
        f.setName("XYZ");
        f.setAddress("Rajkot India");
        f.setMobileNumber("Nahi pata");
        f.seteMail("xyz@gmail.com");

        System.out.println(f.toString());
        
        Staff st = new Staff("Clerk");
        System.out.println(st.toString());

        Employee f1 = new Facluty(4, 3);
        System.out.println(f1.toString());*/

    //Account
        
       /* CheckingAccount ch = new CheckingAccount(3, 1000.50);

        SavingAccount s = new SavingAccount(3, 50);

        Account.setAnnualInterestRate(5.5);
        System.out.println(s.toString());
        System.out.println(ch.toString());*/

    //Course
        /*Course c = new Course("OOP1");

        System.out.println("Student in " + c.getCourseName() + " is " + c.getNumberOfStudent());
        c.addStudent("Ruturaj");
        c.addStudent("Sunil");
        c.addStudent("Bhaw");
        c.addStudent("Titu");
        System.out.println("Student in " + c.getCourseName() + " is " + c.getNumberOfStudent());

        System.out.println(c.toString());

        for(String s : c.getStudents()) {
            System.out.println(s);
        }

        c.dropStudent("Tit");

        for(String s : c.getStudents()) {
            System.out.println(s);
        } */

    //Date,Circle and Loan store in ArrayList
        /*ArrayList<Object> list = new ArrayList<>();

        Date d1 = new Date();
        Date d3 = new Date(843654937);

        Circle c1 = new Circle();
        Circle c2 = new Circle(3.2);

        Loan l1 = new Loan();
        Loan l2 = new Loan(2000, 4);

        list.add(d1);
        list.add(d3);
        list.add(c1);
        list.add(c2);
        list.add(l1);
        list.add(l2);

        for(Object o : list) {
            System.out.println(o.toString());
        }*/

    //Account and Transaction

        /*Account a = new Account(1122, 1000);
        Account.setAnnualInterestRate(1.65);

        a.deposit(30, "First Transaction.");
        a.deposit(40, "Second Transaction.");
        a.deposit(50, "Third Transaction.");
        a.withdraw(5, "Withdraw first time.");
        a.withdraw(4, "Withdraw second time");
        a.withdraw(2, "Withdraw third time.");

        ArrayList<Transaction> a_transaction = a.getTransactions();

        for(int i = 0; i < a_transaction.size(); i++) {
            System.out.println(a_transaction.get(i).toString());
        }*/

    //MyStack

        MyStack s = new MyStack();

        s.push(5);
        s.push("Ruturaj");
        s.push("Rathod");
        s.push("GECR");
        s.push("112");

        System.out.println(s.toString());
        
        System.out.println(s.pop());
        
        System.out.println(s.toString());

        System.out.println(s.peek());
        s.push(112);
        System.out.println(s.toString());
        System.out.println(s.isEmpty());
        System.out.println(s.size());
    }
}
