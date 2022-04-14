import java.util.Scanner; 
class MaxNumberOccurence {
     public static void main(String[] args) {
         //Create Scanner Object
         Scanner input = new Scanner(System.in);

         int n = 1;
         int []arr = new int[50];

         //prompt the user to enter the number
         System.out.println("Enter the numbers in which you find max number occurence ");
         System.out.println("You have enter 0 when your number list is complete");
         System.out.println("(e.g. 3 4 5 2 5 0)");
         for ( int i = 0; i >= 0; i++) {
            arr[i] = input.nextInt();

            if ( arr[i] != 0) {
               n++; 
            } else if (arr[i] == 0) {
                break;
            }
         }

         int list[] = new int[n];

         for ( int i = 0; i < n; i++) {
             arr[i] = list [i];
         }

         //compute max occurence
         int key = arr[0];
         int counter = 1;
         for ( int i = 1; i < n; i++) {
            if ( arr[i] > key) {
                key = arr[i];
                counter = 1;
            } 
            else  if ( arr[i] == key) {
                key = arr[i];
                counter ++;
            }
         }

         System.out.println("In your list "+key+" is max and occurence is "+counter);
     }    
}
