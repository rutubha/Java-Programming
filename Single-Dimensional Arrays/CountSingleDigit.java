class CountSingleDigit {
    public static void main(String[] args) {
        int[] random = new int[200];
        for (int i = 0; i < 200; i++) {
            random[i] = (int)(Math.random() * 10);
        }

        //count the numbers of occurence and display the result

        int[] count = countSingleDigit(random);

        for (int i = 0; i < count.length; i++) {
            System.out.println(i+ " occures "+ count[i] + " times");
        }
    }    

    public static int[] countSingleDigit(int[] arr) {
        int[] count = new int[10];

        //scan the array increament the count for particular digit occurence
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - 0] = count[arr[i] - 0] + 1;
        }

        return count;
    }
}
