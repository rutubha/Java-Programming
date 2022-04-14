class Date {
    private java.util.Date createdDate;
    
    public Date() {
        createdDate = new java.util.Date();
    }

    @Deprecated
    public Date(int year, int month, int date) {
        createdDate = new java.util.Date(year, month, date);
    }

    public Date(long timeMilli) {
        createdDate = new java.util.Date(timeMilli);
    }

    @Override
    public String toString() {
        return "Date : " + createdDate;
    }
}
