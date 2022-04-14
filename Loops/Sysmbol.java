class Sysmbol {
    public static void main(String[] args) {
        //intialize variable
        int count = 0;

        //create loop to print
        for (int  num = 32; num <= 126; num++){
            char charNum = (char)num;
            System.out.print(" "+charNum);
            count++;
            if (count == 10) {
                System.out.println(" ");
                count = 0;
            }
        }
    }
    
}
