/**
 * PentagonalNumbers
 */
public class PentagonalNumbers {

    public static void main(String[] args) {

        int counter = 0;

        for(int i = 1; i <= 100; i++){
             System.out.print(getPentagonalNumber(i)+"\t");
             counter ++;
             if (counter == 10) {
                 counter = 0;
                 System.out.println("");
             }
        }  
    }

    public static int getPentagonalNumber(int n) {
        return (n * (3 * n -1)/2);
    }
}