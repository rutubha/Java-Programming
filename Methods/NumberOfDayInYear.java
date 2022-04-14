class NumerOfDayInYear {
    public static void main (String [] args) {
        System.out.println("year\t\tdays");
        for (int i = 2014; i <= 2034; i++) {
            System.out.println(i+"\t\t"+numberOfDayInYear(i));
        }
    }
    public static int numberOfDayInYear (int year) {
        int days = 0;
        if (year % 4 == 0) {
           days = 365;
        } else {
           days = 364;
        }
        return days;
    }
}