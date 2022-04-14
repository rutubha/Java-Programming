import java.util.Scanner;
class GCD {
    public static void main(String[] args) {
        //Create Scanner object 
        Scanner input = new Scanner(System.in);    

        //prompt the user to enter the two number
        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();

        //Find the minimum diviser
        int d = 0;
        if(n1>n2) {
            d = n2;
        } else {
            d = n1;
        }
        
        //find gcd
        int gcd = 0;
        while (d>=0){
            if (n1 % d == 0 && n2 % d == 0){
                gcd = d;
                break;
            }
            d = d - 1;
        }

        //Display the result
        System.out.print("A Greatest Common diviser is "+ gcd);
    }
}        