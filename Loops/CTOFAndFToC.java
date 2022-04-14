class CTOFAndFToC {
    public static void main(String[] args) {
        System.out.println("Celsuis         Fahrenheit |    Fahrenheit          Celsuis");
        /*int celsuis1 ;
        double fehrenheit1 ;*
        int fehrenheit2 ;
        double celsuis2 ; */
        int fehrenheit2 = 0;
        double celsuis2 = 0;
        
        
        /*for ( int i = 0; i <= 100; i++) {
            if (i % 2 == 0 && i <= 100 ) {
               
               if (i % 2 == 0 && i <= 100) {
                   int celsuis1 = i;
                    double fehrenheit1 = (celsuis1 * (9 / 5)) + 3.2;
                 System.out.print(celsuis1 +"               " + fehrenheit1);
               }
                int j = 20;
                if ( j >= 20  ) {
                     
                     fehrenheit2 = j;
                     
                      celsuis2 = (( 5/ 9)*(fehrenheit2 - 3.2) );
                      System.out.print("       |   " + fehrenheit2 +"               " + celsuis2 );
                   // System.out.printf("      |    %d          %f\n" ,fehrenheit2, celsuis2 );
                   j = j + 5; 
               }
               
               System.out.println();
            }
            
        }*/

        int i = 0 ;
        int j = 20;  
        while (i <= 100) {
            if ( i % 2 == 0) {
                int celsius1 = i;
                double fahrenheit1 = (celsius1 * 1.8) + 32;
                System.out.print(celsius1 + "         "+ String.format("%.1f", fahrenheit1));
            }
            

            if (j >= 20) {
                fehrenheit2 = j;
                celsuis2 = (fehrenheit2 - 32) / 1.8 ;
                System.out.print("       |   " + fehrenheit2 +"               " +String.format("%.1f", celsuis2) );

            }
            j = j + 5;
            i++;
            System.out.println();
        }
    }
}
