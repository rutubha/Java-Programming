class PoundAndKilogram {
    public static void main (String [] args) {
        System.out.println("Kilogram         Pounds   |   Pounds         Kilograms");
        int j = 20;
        int i = 1;
        while( i < 200){
            double kilogram = PoundToKilogram(j);
            double pound = KilogramToPound(i);
            System.out.println(i+"             "+String.format("%.1f", pound)+"     |    "+j+"             "+String.format("%.2f", kilogram));
            j = j + 5;
            i = i + 2;
        }
    }

    public static double PoundToKilogram(int pound) {
        return  pound * 0.453;
    }

    public static double KilogramToPound (int kilogram) {
        return 2.204 * kilogram;
    }

}