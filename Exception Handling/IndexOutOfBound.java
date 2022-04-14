import java.util.Scanner;
class IndexoutOfBound {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int[] random = new int[120];

        for(int i = 0; i < 120; i++) {
            random[i] = 1 + (int)(Math.random() * 500);
        }
        
        System.out.println("Enter the index number :");
        int index = in.nextInt();

        try {
            System.out.println("At " + index + " value is " + random[index]);
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bound index " + e);
        }

        catch (Exception e) {
            System.out.println("Message " + e);
        }

        in.close();
    }
}