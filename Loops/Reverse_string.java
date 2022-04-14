import java.util.Scanner; 
class Reverse_string {
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the string 
        System.out.print("Enter the string :");
        String name = input.next();

        String reverse = new String();
        for ( int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.print("Your reverse string is "+reverse);
    }
}
