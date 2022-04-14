import java.util.ArrayList;
import java.util.Scanner;

class CombineTwoList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        System.out.println("Enter the list 1: ");
        for(int i = 0; i < 3; i++) {
            list1.add(in.next());
        }
        
        System.out.println("Enter the list 2: ");
        for(int i = 0; i < 3; i++) {
            list2.add(in.next());
        }

        in.close();
        ArrayList<String> result = union(list1, list2);

        System.out.println("union of two list is " + result.toString());
    }
    
    public static ArrayList<String> union(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> union = new ArrayList<>();

        union.addAll(list1);
        union.addAll(list2);
        return union;
    } 
}
