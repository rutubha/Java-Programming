class ExuctionTime { 
    public static void main(String[] args) {

        int[] randoms = new int[1000];

        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int)(Math.random() * 100000);
        }

        long stratTime = System.currentTimeMillis();
        int index = binarySearch(randoms, 4856);
        long endTime = System.currentTimeMillis();

        long excutionTime = endTime - stratTime;

        System.out.println("Time taken by linearsearch to find index of key is "+excutionTime);
        
    }

    public static int linearSearch(int[] list, int key) {
        int index = -1;


        for(int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int binarySearch(int[] list, int key) {
        int index = -1;
        int start = 0;
        int end = list.length - 1;
        int middle = (start + end )/ 2;

         do {
            if (list[middle] < key) {
                start = middle + 1;
                middle = (start + end) / 2;
            } else if (list[middle] > key) {
                end = middle - 1;
                middle = (start + end) / 2;
            } else {
                index = middle;
            }
        }while (list[middle] != key);

        return index;
    }
}