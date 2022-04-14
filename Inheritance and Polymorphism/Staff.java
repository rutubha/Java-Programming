class Staff extends Employee {
    private String title;

    Staff() {
        this.title = "Member";
    }

    Staff(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff \nTitle "+this.title;
    }
}
