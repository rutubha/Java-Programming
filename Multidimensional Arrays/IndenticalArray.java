import java.util.Scanner; 
class IndenticalArray {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);

        //variable 
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];

        //prompt user
        System.out.println("Enter the list1: ");

        for(int i = 0; i < list1.length; i++) { 
            for(int j = 0; j <  list1.length; j++) { 
                list1[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter the list2: ");

        for(int i = 0; i <  list2.length; i++) { 
            for(int j = 0; j <  list2.length; j++) { 
                list2[i][j] = in.nextInt();
            }
        }

        //check its indetical or not
        boolean value = isIndetical(list1, list2);

        if(value) { 
            System.out.println("The two arrays are stricly indetical. ");
        } else { 
            System.out.println("The two arrays are not stricly indetical. ");
        }
    }

    public static boolean isIndetical(int[][] l1, int[][] l2) { 
        boolean value = true;
        for(int i = 0; i < l1.length; i++) { 
            for(int j = 0; j < l1[i].length; j++) { 
                if(l1[i][j] != l2[i][j]) { 
                    value = false;
                }
            }
        }

        return value;
    }
}
