import java.util.ArrayList;

class Exercise_13_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(19);
        list.add(5);
        list.add(43);
        list.add(94);
        list.add(62);
        list.add(21);
        list.add(14);
        sort(list);
        System.out.println("Sorted list is: ");
        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }   
    
    public static void sort(ArrayList<Integer> list) {
        for(int i = 0; i < list.size() - 1; i++) {
            int index = i;
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(index).compareTo(list.get(j)) > 0) {
                    index = j;
                }
            }
            int temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }
    }
}
