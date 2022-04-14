class MileAndKilometer {
    public static void main(String[] args) {
        System.out.println("Miles        Kilometers     |     Kilometers        Miles");
        System.out.println("__________________________________________________________");
        int j = 20;
        for(int i = 1; i <= 10; i++) {
            
            double mileToKilometer = mileToKilometer(i);
            double kilometerToMile = kilometerToMile(j);
           
            System.out.println(i+"              "+String.format("%.3f", mileToKilometer)+"        |     "+j+"              "+String.format("%.3f", kilometerToMile));
            j = j + 5;
        }
    }   
    public static double mileToKilometer(double mile) {
        return  mile * 1.6;
    } 
    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.6;
    }
}
