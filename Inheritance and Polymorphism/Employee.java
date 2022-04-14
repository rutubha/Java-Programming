class Employee extends Person {
    private java.util.Date joinDate;
    private String officeName = "";
    private double salary;

    Employee() {
        this.joinDate = new java.util.Date();
        this.officeName = "Defualt";
        this.salary = 10000;
    }

    Employee(String officeName, double salary) {
        this.joinDate = new java.util.Date();
        this.officeName = officeName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getOfficeName() {
        return officeName;
    }

    public java.util.Date getJoinDate() {
        return joinDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    @Override
    public String toString() {
        return "Employee \n Join Date "+this.joinDate + "\n salary " + this.salary + "\n offce Name "+this.officeName;
    }
}
