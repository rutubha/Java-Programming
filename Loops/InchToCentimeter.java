class InchToCentimeter {
    public static void main(String[] args) {
        System.out.println("Inches          Centimeter");
        int i = 1;
        while (i <= 10) {
            int inche = i;
            double centimeter = i * 2.54;
            System.out.println(inche + "            " + centimeter);
            i++;
        }   
    }
}
