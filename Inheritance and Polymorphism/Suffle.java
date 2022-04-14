import java.util.ArrayList;
import java.util.Scanner;

class Suffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the Integer ending with 0 :");
        Integer number = in.nextInt();

        while(number.intValue() != 0) {
            list.add(number);
            number = in.nextInt();
        }

        in.close();

        for(Integer n : list) {
            System.out.print(n+" ");
        }

        suffle(list);

        System.out.println("Suffle the list");
        for(Integer n : list) {
            System.out.print(n+" ");
        }
    }   
    
    public static void suffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);
    }
}
