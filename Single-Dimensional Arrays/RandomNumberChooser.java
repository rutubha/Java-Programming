import java.util.Scanner; 
class RandomNumberChooser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter the two number which you dont get from random :");
        numbers[0] = in.nextInt();
        numbers[1] = in.nextInt();

        int random = randomNumber(numbers);
        System.out.println("Random number is "+random);
    }

    public static int randomNumber(int[] numbers) {
        int random = 1 + (int)(Math.random() * 54);

        if (random - numbers[0] == 0 || random - numbers[1] == 0) {
            random = 1 + (int)(Math.random() * 54);
        }

        return random;
    }
}