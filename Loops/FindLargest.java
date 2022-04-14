class FindLargest {
    public static void main(String[] args) {
        //create varaible
        int num = 0;
        int i = 0;

        //create while to find largest n square that is less than 12000
        while (i >= 0) {
            int square = i * i;
            if (square > 12000){
                num = i - 1;
                square = num * num;
                System.out.print("A number "+ num +" is largest number that its square "+square+" is less than 12000.");
                break;
            }
            i++;
        }
    }
    
}
