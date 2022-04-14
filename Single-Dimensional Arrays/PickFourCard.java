class PickFourCard {
    public static void main(String[] args) {
        pickFourCard();
    }

    public static void pickFourCard() {
        int sum = 0;

        while (sum != 24) {
            sum = 0;
            int one = 1 + (int)(Math.random()*13);
            int two = 1 + (int)(Math.random()*13);
            int three = 1 + (int)(Math.random()*13);
            int four =1 + (int)(Math.random()*13);

            sum = one + two + three + four;
            if (sum == 24) {
                System.out.print("A pick "+one+" "+two+" "+three+" "+four);
                break;
            }
        }
    }
}