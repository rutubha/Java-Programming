class RandomCharcter {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 1; i <= 200; i++) {
            if (i % count == 0) {
                System.out.println( randomCharcter('A', 'Z')+" ");
            } else {
                System.out.print( randomCharcter('A', 'Z')+" ");
            }
        }
        for (int i = 1; i <= 200; i++) {
            if (i % count == 0) {
                System.out.println( randomDigit()+" ");
            } else {
                System.out.print( randomDigit()+" ");
            }
        }
       
    }
    public static char randomCharcter(char ch1, char ch2) {
        char random = (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
        return random;
    }
    public static int randomDigit() {
        int random = (int)(1+ Math.random() * 100);
        return random;
    }
}