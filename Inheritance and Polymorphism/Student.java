class Student extends Person {
    private String status = "";

    Student() {
        this.status = "freshman"; 
    }

    Student(String status) {
        this.status = status;
    }

    public String toString() {
        return "Student status : " + this.status;
    }
}
