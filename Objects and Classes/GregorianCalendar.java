import java.util.Calendar;

class GregorianCalendar {
    public static void main(String[] args) {
        java.util.GregorianCalendar c = new java.util.GregorianCalendar();

        System.out.println("Current year, month and date is "+c.get(Calendar.YEAR)+"/"+
                            c.get(Calendar.MONTH)+"/"+c.get(Calendar.DAY_OF_MONTH));


        c.setTimeInMillis(1234567898765L);

        System.out.println("Time elapse 1234567898765L milliSecond  year, month and date is "+c.get(Calendar.YEAR)+"/"+
        c.get(Calendar.MONTH)+"/"+c.get(Calendar.DAY_OF_MONTH));
    }    
}
