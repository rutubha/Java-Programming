import java.util.Scanner; 
class PalindromeInteger {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the number
        System.out.println("Enter the number:");
        int number = input.nextInt();

        System.out.println(number+" is palindrome..."+isPalindrome(number));
    }

    public static boolean isPalindrome(int n) {
       int digit = 0;
       int temp = n;
       while (n != 0) {
           digit = digit * 10;
           digit = digit + n % 10;
           n = n /10;
        }

        if (digit == temp) {
            return true;
        } else {
            return false;
        }
        
    }
}
