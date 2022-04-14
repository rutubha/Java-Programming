import java.util.Scanner; 
class PartitionOfList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the array
        System.out.print("Enter list: ");
        int length = in.nextInt();
        int[] list = new int[length];

        for(int i = 0; i < length; i++) {
            list[i] = in.nextInt();
        }

        //after the partition list is
        partitionList(list);

        for(int num : list) { 
            System.out.print(num+" ");
        }

    }

    public static void partitionList(int[] list) { 
        int pivot = list[1];

        DynamicArray lessList = new DynamicArray();
        DynamicArray greaterList = new DynamicArray();

        for(int i = 0; i < list.length; i++) { 
            if(list[i] <= pivot) { 
                lessList.add(list[i]);
            } else { 
                greaterList.add(list[i]);
            }
        }

        for(int i = 0; i < lessList.size; i++) { 
            list[i] = lessList.arry[i];
        }
        for(int i = 0; i < greaterList.size ; i++) { 
            list[lessList.size + i] = greaterList.arry[i];
        }
    }
}