import java.util.Scanner;

class SumOfArray {
    public static void main(String[] args) { 
        //Create Scanner Object
        Scanner in = new Scanner(System.in);
        
        //prompt the user to enter the number
        double[] numbers = new double[10];
        System.out.println("Enter the ten numbers :");
        for (int i = 0; i < 10; i++) {
            numbers[i] = in.nextDouble();
        }

        //sum of the numbers
        double sum = sum(numbers);
        System.out.println("Your sum is "+sum);
    }  
    
    public static double sum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        
        return sum;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        
        return sum;
    }
}
