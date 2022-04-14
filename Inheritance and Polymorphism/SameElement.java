import java.util.ArrayList;
import java.util.Scanner;
class SameElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("enter ten number: ");
        for(int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }
        in.close();
        sameElement(list);
        System.out.println("List is " + list.toString());
    }
    
    public static void sameElement(ArrayList<Integer> list) {

        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }            
        }

    }
}


