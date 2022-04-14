class ShowCurrentDateAndTime {
    public static void main(String[] args) {
        getTime();
    }
    public static void getTime() {
       long totalMillisecond = System.currentTimeMillis();

        long totalSecond = totalMillisecond / 1000;

        long currentSecond = totalSecond % 60;

        long totalMinute = totalSecond / 60;

        long currentMinute = totalMinute % 60;

        long totalHour = totalMinute / 60;

        long currentHour = totalHour % 60;

        System.out.println((currentHour)+":"+currentMinute+":"+currentSecond);
    }

}