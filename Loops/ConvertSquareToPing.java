class ConvertSquareToPing {
    public static void main(String[] args) {
        //Define variable
        int ping1 = 0;
        double square1 = 0;
        int square2 = 0;
        double ping2 = 0;

        //print collum
        System.out.println("Ping            Square meter    |   Square meter            Ping");

        int i = 10;
        int j = 30;
        while (i >= 10 && i <= 100) {
            if (i % 5 == 0 && i <= 80) {
              ping1 = i;
              square1 = i * 3.305;
              System.out.print(ping1+"            "+String.format("%.2f", square1)+ "    ");
            }
            if (j % 5 == 0 && j <= 100){
                square2 = j;
                ping2 = square2 / 3.305;
                System.out.println("        |   "+square2+"            "+String.format("%.2f", ping2));
            }
            i = i + 5;
            j = j + 5;
        } 
    }
}
