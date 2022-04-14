class OutOfMemoryError {
    public static void main(String[] args) {
        int length = 1200000000;

        try {
            long[] array = new long[length];
            array[6] = 32;
            System.out.println("Try Block run");
        } catch (Exception e) {
            System.out.println("Catch block "+e);
        }
        System.out.println("Handled");
    }    
}
