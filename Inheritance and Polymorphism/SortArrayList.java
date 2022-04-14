import java.util.ArrayList;
import java.util.Scanner;
class SortArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("enter Five number: ");
        for(int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        in.close();
        java.util.Collections.sort(list);
        System.out.println("Sorted array is " + list.toString());
    }    
}
