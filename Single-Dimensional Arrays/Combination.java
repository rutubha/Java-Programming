import java.util.Scanner; 
class Combination {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the number
        int[] numbers = new int[10];
        System.out.println("Enter any ten number : ");
        for(int i = 0; i < numbers.length; i ++) {
            numbers[i] = in.nextInt();
        }

        //Search the combination
        combination(numbers);

    }

    public static void combination(int[] numbers) {
        System.out.println("Combination of given number is: ");
        for (int i = 0; i < numbers.length; i++) {
            int key = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                System.out.print("("+key+","+numbers[j]+")  ");
            }
            System.out.println();
        }
    }
}