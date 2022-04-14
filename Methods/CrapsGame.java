class CrapsGame {
    public static void main(String[] args) {
       crapsGame(); 
    }   
    
    public static void crapsGame () {
        int dice1 =  1 + (int)(Math.random() * 12);
        int dice2 =  1 + (int)(Math.random() * 12);

        if (dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12) {
            System.out.println("You rolled " + dice1 + " + "+dice2+ " = " + (dice1 + dice2));
            System.out.println("You lose");
        } else if (dice1 + dice2 == 7 || dice1 + dice2 == 11) {
            System.out.println("You rolled " + dice1 + " + "+dice2+ " = " + (dice1 + dice2));
            System.out.println("You Win");
        } else {
            int sum = dice1 + dice2;
            System.out.println("You rolled " + dice1 + " + "+dice2+ " = " + (dice1 + dice2));
            System.out.println("point is "+sum);
            dice1 =  1 + (int)(Math.random() * 12);
            dice2 =  1 + (int)(Math.random() * 12);
            if(dice1 + dice2 == sum) { 
                System.out.println("You rolled " + dice1 + " + "+dice2+ " = " + (dice1 + dice2));
                System.out.println("You win");
            } else { 
                System.out.println("You rolled " + dice1 + " + "+dice2+ " = " + (dice1 + dice2));
                System.out.println("You lose");
            }

        }

    }
}
