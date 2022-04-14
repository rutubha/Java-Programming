class Facluty extends Employee {
    private double officeHour;
    private int rank;

    Facluty() {
        this.officeHour = 8;
        this.rank = 0;
    }

    Facluty(double officeHour, int rank) {
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public double getOfficeHour() {
        return officeHour;
    }

    public int getRank() {
        return rank;
    }

    public void setOfficeHour(double officeHour) {
        this.officeHour = officeHour;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Facluty \nOffice hour " + this.officeHour + "\nRank "+this.rank;
    }
}
