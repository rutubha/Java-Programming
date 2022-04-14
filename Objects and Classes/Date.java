//using java.util.date class display elapsed time
class Date { 
    public static void main(String[] args) {
        long time = 12000;
        int count = 0;
        while(count <= 8) { 
            java.util.Date d = new java.util.Date(time);
            System.out.println("Date and time "+d.toString()+" for time elapsed "+time);

            count++;
            time = time * 10;
        }

    }
}