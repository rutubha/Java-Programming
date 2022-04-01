import java.util.ArrayList;

class Exercise_13_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(19);
        list.add(5);
        list.add(4);
        list.add(9);
        list.add(6);
        list.add(2);
        list.add(4);
        averages(list);
    }   
    
    public static void averages(ArrayList<Integer> list) {
        Integer average = 0;
        for(int i = 0; i < list.size(); i++) {
            average += list.get(i);
        }

        System.out.println("The average of the Integers " + average/list.size());
    }
}
