import java.util.Scanner; 
class SortThreeNumber {
    public static void main(String[] args) {
         //create Scanner Object 
         Scanner input = new Scanner(System.in);

         //prompt the user to two number
         System.out.println("Enter the first number: ");
         int n1 = input.nextInt();
         System.out.println("Enter the second number: ");
         int n2 = input.nextInt();
         System.out.println("Enter the third number: ");
         int n3 = input.nextInt();

         displaySortedNumber(n1, n2, n3);
 
    }

    public static void displaySortedNumber(double n1, double n2, double n3) {
        if (n1>n2) {
            if(n2 > n3) {
                System.out.println("Sorted Number is "+n3 +" "+ n2 +" "+ n1);
            } else {
                if (n1 > n3) {
                    System.out.println("Sorted Number is "+n2 +" "+ n3 +" "+ n1);
                } else {
                    System.out.println("Sorted Number is "+n2 +" "+ n1 +" "+ n3);
                }
            }
        } else {
            if(n1 > n3) {
                System.out.println("Sorted Number is "+" " +n3 +n1 + " "+ n2);
            } else {
                if (n2 > n3) {
                    System.out.println("Sorted Number is "+" "+n1 + n3 +" "+ n2);
                } else {
                    System.out.println("Sorted Number is  "+" "+n1 + n2 +" "+ n3);
                }
            }
            
        }
    }
}
