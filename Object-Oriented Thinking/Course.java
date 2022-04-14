class Course {
    private String courseName;
    private String[] studentName = new String[10];
    private int numberOfStudent = 0;
    
    Course(String courseName) {
        this.courseName = courseName;
    }
    
    void addStudent(String studentName) {
        this.studentName[numberOfStudent] = studentName;
        numberOfStudent++;
    }

    String[] getStudent() {
        return studentName;
    }

    int getNumberOfStudent() {
        return numberOfStudent;
    }

    String getCourseName() {
        return courseName;
    }

    void dropStudent(String student){
        if(numberOfStudent == 0){
            System.out.println("No students are enroll in this course!");
        } else if (numberOfStudent >= 1) {
            int index = -1;
            for(int i = 0; i < numberOfStudent; i++){
                if(studentName[i] == student) {
                    index = i;
                    break;
                }  
            }

            if(index == -1) {
                System.out.println("Sorry, this name student not in this course.");
            } else {
                for(int i = index; i < numberOfStudent - 1; i++) {
                    studentName[i] = studentName[i + 1];
                }
                numberOfStudent--;
                System.out.println("Successfully remove "+student+" from this course");
            }
        }
    }

    void clear() {
        String[] newStudentName = new String[10];
        studentName = newStudentName;
        numberOfStudent = 0;
    }
}