import java.util.Scanner;

class CountEvenOdd {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner in = new Scanner(System.in);

        //Create dynamic array
        DynamicArray numbers = new DynamicArray();

        //prompt the user to enter the number
        System.out.println("Enter the numbers: ");
        int number = 0;
        do {
            number = in.nextInt();
            if ( number != 0) {
                numbers.add(number);
            }
        } while (number != 0);

        //check how many number are even or odd and display the result
        countEvenOdd(numbers.arry);


    }    

    public static void countEvenOdd(int[] arr) {
        int size  = arr.length;
        int even = 0;
        int odd = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println(even+ " numbers are even.");
        System.out.println(odd+ " number are odd");
    }
}
