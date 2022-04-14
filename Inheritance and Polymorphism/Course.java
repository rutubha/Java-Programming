import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudent = students.size();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        this.numberOfStudent = this.students.size();
    }

    public ArrayList<String> getStudents() {
        return this.students;
    }

    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void dropStudent(String student) {
        if(students.contains(student)) {
            int index = students.indexOf(student);
            students.remove(index);
        } else {
            System.out.println(student + " not found in this course.");
        }
    }

    @Override
    public String toString() {
        return "Course :\n  Course Name " +this.courseName + "\n  Numbers of Student " + this.numberOfStudent;
    }
}