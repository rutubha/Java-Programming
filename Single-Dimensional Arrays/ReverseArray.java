import java.util.Scanner;
class ReverseArray {
    public static void main(String[] args) { 
        //Create Scanner Object
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the ten nummber
        int[] numbers = new int[10];

        System.out.println("Enter the ten number : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        //revesre the array
        reverseArray(numbers);

        System.out.println("Reverse array is :");

        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] list) {
        int i = 0;
        int j = list.length - 1;
        int temp = 0;
        while(i < j) { 
           temp = list[i];
           list[i] = list[j];
           list[j] = temp;
           i++;
           j--; 
        }
    }
}