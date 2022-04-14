import java.util.Scanner; 
class ReverseNumber {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the integer
        int [] number = new int[15];
        System.out.println("Enter the number  fifteen numbers: ");

        for (int i = 0; i < 15; i++) {
            number[i] = sc.nextInt();
        }

        //lets revers the order of the number
        int []temp = new int[15];
        int j = 0;
        for (int i = 14; i >= 0; i--) {
            temp[j] = number[i];
            j ++;
        }

        //Display the reverse order integer
        System.out.println("A reverse order of this iteger is :");
        for (int i = 0; i < 15; i++) {
            System.out.print(temp[i] +" ");
        }
    }
}
