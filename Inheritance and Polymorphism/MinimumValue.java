import java.util.ArrayList;

class MinimumValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            list.add((i + 3) * 9);
        }
        list.set(4, 3);
        System.out.println(min(list));

        
        for(Integer val : list) {
            System.out.print(val+" ");
        }
    }

    public static Integer min(ArrayList<Integer> list) {
        Integer minValue = list.get(0);
        for(Integer val : list) {
            if(minValue.compareTo(val) == 1) {
                minValue = val;
            }
        }

        return minValue;
    }
}
