import java.util.Scanner;
class Factor {
    public static void main(String[] args) {
        
        //Create Scanner object 
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

          //variable 
          int []fact = new int[number];
          int index = 0;
          int num = number;
          int  count = 0;

        //create a loop to find factor
        for (int i = 2; i <= number ; i++) {
            for (int n = 2; n <= number; n++) {
                if (number % i == 0 && i != 0) {
                    fact[index] = i;
                    index = index + 1;
                    number = number / i;
                    count++;
            }
            
            }
        }

        
        System.out.print("Your factor in accending order is : ");
        for (int j = 0; j < count;j++) {
            System.out.print(fact[j]+ " ");
        }

    }
}
