import java.util.ArrayList;
import java.util.Scanner;

class PerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an Integer m: ");
        int m = in.nextInt();

        int n = getN(m);

        System.out.println("The smallest n for m * n to be a perfect is " + n);
        System.out.println("M * n is " + m * n);
        in.close();
    }    

    public static int getN(int m) {
        int n = 1;
        ArrayList<Integer> factor = new ArrayList<>();

        int i = 2;
        int count = 0;
        while(i <= m) {
            if(m % i == 0) {
                factor.add(i);
                m /= i;
                count++;
            } else {
                if(count % 2 == 1) {
                    n = n * i;
                }
                i++;
                count = 0;
            }
        }
        if(count % 2 == 1) {
            n = n * i;
        }

        return n;
    }
}
