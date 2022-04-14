import java.util.Scanner; 
class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the ten number: ");
        double []list = new double[10];

        for (int i =0; i < list.length; i++) {
            list[i] = in.nextDouble();
        }
        in.close();
        bubbleSort(list);

    }

    public static void bubbleSort (double[] array) {
        
        for (int m = array.length; m >= 0; m--) { 
            for (int i = 0; i < array.length - 1; i++) {
                int key = i + 1;
                if (array[key] < array[i]) { 
                    double temp = array[i];
                    array[i] = array[key];
                    array[key] = temp;
                }
            }
        }

        for (double number: array) {
            System.out.print(number+" ");
        }
    }

}
