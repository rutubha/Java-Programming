import java.util.Scanner;
class SelectionSort {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the number
        double[] numbers = new double[10];

        System.out.println("Enter the number: ");
        for (int i = 0; i < numbers.length; i++) { 
            numbers[i] = in.nextDouble();
        }

        //sorted numbers
        selectionSort(numbers);

        //Display the sorted number
        System.out.println("Sorted number is : ");
        for (double number: numbers) {
            System.out.print(number+" ");
        }


    }

    public static void selectionSort(double[] list) {
        for(int i = list.length ; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (list[j] > list[ j + 1]) {
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
