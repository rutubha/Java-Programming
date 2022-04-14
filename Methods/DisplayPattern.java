import java.util.Scanner; 
class DisplayPattern {
    public static void main(String[] args) {
       //Create Scanner Object
       Scanner input = new Scanner(System.in);
       
       //prompt the user ot enter the number pattern
       System.out.println("Enter the number for print pattern :");
       int pattern = input.nextInt();
       System.out.println("__________________");

       displayPattern(pattern);
    }

    public static void displayPattern(int n) {
        for(int j = 1; j <= n; j++){
            for (int i = 1; j >= i; i++) {
                System.out.print(i+"\t");
            }
            System.out.println(" ");
            if(j == n) {
                for(int x = n; x > 0; x--){
                    for(int y = x; y > 0; y--) {
                        System.out.print(y+"\t");
                    }
                    System.out.println(" ");
                }
            }
        }

        
    }
}
