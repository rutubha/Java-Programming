class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudent;

    public Course(String courseName) {
        this.courseName = courseName;
        numberOfStudent = 0;
    }

    public void addStudent(String student) {
        students[numberOfStudent] = student;
        numberOfStudent++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Course courseClone = (Course)super.clone();

        courseClone.students = students.clone();

        return courseClone;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + "\tNumber of students " + numberOfStudent;
    }
}
