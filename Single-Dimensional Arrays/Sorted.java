import java.util.Scanner; 
class Sorted {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the numbers
        System.out.print("Enter the numbers of list:");
        int number = in.nextInt();

        System.out.println("Enter list: ");
        double[] list = new double[number];

        for (int i = 0; i < list.length; i++) {
            list[i] = in.nextDouble();
        }

        //Check whether number is sorted or not
        boolean sorted = isSorted (list);

        if(sorted) {
            System.out.println("Your number is already sorted.");
        } else 
            System.out.println("Your number is not sorted.");
    }

    public static boolean isSorted(double[] list) {
        boolean sorted = true;
        for(int i = 0; i < list.length - 1; i++) {
            if(list[i] < list[i + 1]) {
                sorted = false;
            }
        }

        return sorted;
    }
}