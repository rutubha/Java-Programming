import java.util.Calendar;
class MyDate {
    private long timeElapsed;
    private int year;
    private int month;
    private int date;
    java.util.GregorianCalendar c = new java.util.GregorianCalendar();

    MyDate() {
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        date = c.get(Calendar.DAY_OF_MONTH);
    }

    MyDate(long timeElapsed) {
        c.setTimeInMillis(timeElapsed);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        date = c.get(Calendar.DAY_OF_MONTH);
    }

    MyDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    void setDate(long timeElapsed) {
        c.setTimeInMillis(timeElapsed);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        date = c.get(Calendar.DAY_OF_MONTH);
    }

    int getDate() {
        return date;
    }

    int getMonth() {
        return month;
    }

    int getYear() {
        return year;
    }
}