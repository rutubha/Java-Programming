import java.util.ArrayList;
import java.util.Scanner;
class MultiplyArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("enter Five number: ");
        for(int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        in.close();
        System.out.println(multiply(list)); 
        System.out.println("Sorted array is " + list.toString());
    }
    
    public static Integer multiply(ArrayList<Integer> list) {
        Integer multiplication = 1;
        
        for(int i = 0; i < list.size(); i++) {
            multiplication = multiplication * list.get(i);
        }

        return multiplication;
    }
}

