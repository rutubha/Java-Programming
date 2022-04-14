import java.util.Scanner; 
class DisplayNumber {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the number start frome to end 
        System.out.println("Enter the number1 and number2 to print number between it (e.g. 2  8 = {3 4 5 6 7}) :");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("Enter the number per line to print:");
        int numberPerLine = input.nextInt();

        printNumber(number1, number2, numberPerLine);
    }
    public static void printNumber(int num1, int num2, int numberPerLine) {
        int counter = 0;
        if(num1 > num2){
            System.out.println("Enter the correct number!!");
        }
        else {
            for(int i= num1 + 1; i < num2; i++) {
                System.out.print(i+"  ");
                counter++;
                if(counter == numberPerLine) {
                    System.out.println(" ");
                    counter = 0;
                }
            }
        }
        
    }
}
