import java.util.Scanner; 
class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //promot the user
        int[] numbers = new int[10];

        System.out.print("Enter ten number :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        //eliminate duplicate number
        int[] array = eliminateDuplicate(numbers);

        //Display result
        for(int num : array) {
            System.out.print(num+ " ");
        }

    }

    public static int[] eliminateDuplicate(int[] list) {

        //Create Dynamic array
        DynamicArray arr = new DynamicArray();

        //Scan element
        for(int i = 0; i < list.length; i++) {
            int j = 0;
            boolean value = true;
            //check in new array that current scan value already present or not if not than add it into new array
            
            //scan new array
            do {
                //if current value is equal to any of new array value than value become false
                if (list[i] == arr.arry[j]) {
                    value = false;
                } 
                j++;
            } while ( j < arr.size);

            //if for value i value is true than add it into new array
            if (value) {
                arr.add(list[i]);
            }
        }

        return arr.arry;
    }
}