class Exercise_13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        //Create Course
        Course dbms = new Course("DBMS");

        //add student
        System.out.println("Adding students in DBMS course......");
        dbms.addStudent("Hiper");
        dbms.addStudent("ken");
        dbms.addStudent("andrew");
        dbms.addStudent("Fist");
        dbms.addStudent("tom");
        dbms.addStudent("john");

        //clone the course dbms
        System.out.println("Clone DBMS courese into DBMS_advance......");
        Course dbms_advance = (Course)dbms.clone();

        //Adding new student in dbms course
        dbms.addStudent("bhavin");
        dbms.addStudent("roman");
    
        //display the cousre name and students
        System.out.println("Course Name and number of student " + dbms.toString());
        displayStudent(dbms);
        System.out.println("Course Name and number of student " + dbms_advance.toString());
        displayStudent(dbms_advance);
    }
    
    public static void displayStudent(Course c) {
        System.out.println("Studnts in course " + c.getCourseName() + ".....");
        String[] students = c.getStudents();
        for(int i = 0; i < c.getNumberOfStudent(); i++) {
            System.out.print(students[i] +", ");
        }
        System.out.println();
    }
}
