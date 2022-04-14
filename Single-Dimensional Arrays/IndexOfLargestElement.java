import java.util.Scanner;

class IndexOfLargestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the number
        double[] numbers  = new double[10];

        System.out.print("Enter ten element: ");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextDouble();
        }

        //get the index of largest number
        int largest_number_index = indexOfLargestNumber(numbers);

        //Display
        System.out.println("The largest number is at position "+(largest_number_index + 1));

    }   
    
    public static int indexOfLargestNumber(double[] list) {
        int index = 0;
        for(int i = 0; i < list.length; i++) {
            if (list[index] < list[i]) {
                index = i;
            }
        }

        return index;
    }
}