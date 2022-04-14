import java.util.Scanner; 
class IdenticalArray {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the two array
        System.out.println("Enter the first array : ");
        int length1 = in.nextInt();
        int[] list1 = new int[length1];

        for (int i = 0; i < length1; i++) {
            list1[i] = in.nextInt();
        }

        System.out.println("Enter the first array : ");
        int length2 = in.nextInt();
        int[] list2 = new int[length2];

        for (int i = 0; i < length1; i++) {
            list2[i] = in.nextInt();
        }

        //invowk method to identify list1 and list2
        boolean status = identifyArray(list1, list2);

        //Display result
        if(status) {
            System.out.println("Two lists are strictly identical.");
        } else {
            System.out.println("Two lists are not strictly identical.");
        }

    }    
     public static boolean identifyArray(int[] list1, int[] list2) {
            boolean status = true;
            if (list1.length != list2.length) {
                status = false;
            } else {
                for (int i = 0; i < list1.length; i++) {
                    if (list1[i] != list2[i]) {
                        status = false;
                        break;
                    }
                }
            }

            return status;  
    } 
}
