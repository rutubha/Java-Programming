import java.util.Scanner; 
class MergeTwoList {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the two list
        System.out.print("Enter the first list: ");
        int length1 = in.nextInt();
        int[] list1 = new int[length1];

        for (int i = 0; i < length1; i++) {
            list1[i] = in.nextInt();
        }

        System.out.print("Enter the second list: ");
        int length2 = in.nextInt();
        int[] list2 = new int[length2];

        for(int i = 0; i < length2; i++) {
            list2[i] = in.nextInt();
        }

        //merge two list by invowking method
       merge(list1, list2);

       
    }

    public static void merge(int[] list1, int[] list2) {
        int length = list1.length+list2.length;
        int[] list = new int[length];

        int n = 0;
        int j = 0; 
        int i = 0;
        do { 

            if(j < list2.length && i < list1.length) { 
                if(list1[i] > list2[j]) {
                    list[n] = list2[j];
                    n++;
                    j++;
                } else if (list1[i] < list2[j]) {
                    list[n] = list1[i];
                    n++;
                    i++;
                }
            } else if (j == list2.length) {
                list[n] = list1[i];
                n++;
                i++;
            } else if (i == list1.length) { 
                list[n] = list2[j];
                n++;
                j++;
            }else if(n == length) {
                break;
            } 
        }while (n < length);

        System.out.print("The merge list is ");
        for(int num: list) {
            System.out.print(num+" ");
        }   
    }
}