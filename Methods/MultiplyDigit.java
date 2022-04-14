import java.util.Scanner; 
class MultiplyDigit {
    public static void main(String[] args) {
        //create Scanner Object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the number
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        //Display the result
        System.out.println("The multiplication of digit is "+mulDigit(number));
    }

    public static int mulDigit(int n) {
        int mul = 1;
            
        while (n != 0){
           mul = mul * (n % 10);
           n = n / 10; 
        } 
        return mul;
    }
}
