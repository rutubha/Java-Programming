class FindN {
    public static void main(String[] args) {
        //assigne a varaible
        int num = 0;
        int i = 0;

        //create while loop to find n such that n^3 > 12,000
        while(i >= 0) {
            int cube = (int)Math.pow(i, 3);
            if ( cube> 12000){
                num = i;
                System.out.print("A number "+num+" is smallest number that it's cube is greater than 12000 --->"+cube);
                break;
            }
            i++;
        }

        
    }
}
