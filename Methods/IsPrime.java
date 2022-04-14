import java.util.Scanner; 
class IsPrime {
    public static void main(String[] args) {
        //create scanner object 
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter the number
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        
        //check for prime number
        boolean isPrime = isPrime(number);

        //Display the result 
        System.out.print("A number "+number+" is prime number.-"+isPrime);
    }   
    
    public static boolean isPrime(int number) {
        for(int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            } 
        }
        return true;
    }
}