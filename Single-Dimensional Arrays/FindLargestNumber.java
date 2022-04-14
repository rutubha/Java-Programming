import java.util.Scanner;

class FindLargestNumber { 
    public static void main(String[] args) { 
        //Create Scanner Object
        Scanner in = new Scanner(System.in);

        //Prompt the user to enter the ten numbers
        double[] numbers = new double[10];

        System.out.print("Enter the ten number: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextDouble();
        }

        //Find largest element by invoking method
        double largest_number = largest(numbers);

        //Display the result
        System.out.println("Largest number is "+ largest_number);

    }

    public static double largest(double[] list) { 
        //Assume that first element of the array is max
        double max = list[0];

        for (int i = 0; i < list.length; i++) {
            //if max value less than its next value in the array than assigne next value in max
            if (max < list[i]) {
                max = list[i];
            }
        }

        return max;
    }
}
