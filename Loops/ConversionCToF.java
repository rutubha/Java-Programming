class ConversionCToF {
    public static void main(String[] args) {
        System.out.println("Celsius         Fahrenheit");
        int i = 0 ;  
        while (i <= 100) {
            if ( i % 2 == 0) {
                int celsius = i;
                double fahrenheit = (celsius * 1.8) + 32;
                System.out.println(celsius + "         "+ String.format("%.1f", fahrenheit));
            }
            i++;
        }
    }
}