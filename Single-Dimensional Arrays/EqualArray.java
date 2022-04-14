class EqualArray {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the two string
        System.out.println("Enter the list1 : ");
        int length1 = in.nextInt();
        int[] list1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            list1[i] = in.nextInt();
        }

        System.out.println("Enter the list2 : ");
        int length2 = in.nextInt();
        int[] list2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            list2[i] = in.nextInt();
        }

        //check the list is equal or not 
        boolean val = equals(list1, list2);

        if (val) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }

    }

    public static boolean equals(int[] list1, int[] list2) {
        boolean value = true;
        
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < list1.length; i++) {
            int key1 = list1[i];
            int key2 = list1[i];

            for (int j = 0; j < list1.length; j++) {
                if (key1 == list1[j]) {
                    count1++;
                }
                if (key2 == list2[j]) { 
                    count2++;
                }
            }

            if (count1 != count2) {
                value = false;
                break;
            } else {
                count1 = 0;
                count2 = 0;
            }

        }

        return value;
    }
}