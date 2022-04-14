class ChanceOfWinCraps {
    public static void main(String[] args) {
        int winCount = 0; 
        for (int i = 0; i <= 15000; i++) {
             int l = crapsGame();
             if (l == 1)  { 
                 winCount ++;
             }
        }  
        
        System.out.print("you win "+winCount+" times out of 15000.");
    }
    public static int crapsGame () {
        int j = 0;
        int dice1 =  1 + (int)(Math.random() * 12);
        int dice2 =  1 + (int)(Math.random() * 12);

        if (dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12) {
           j = 0;
        } else if (dice1 + dice2 == 7 || dice1 + dice2 == 11) {
          j = 1;
        } else {
            int sum = dice1 + dice2;
            dice1 =  1 + (int)(Math.random() * 12);
            dice2 =  1 + (int)(Math.random() * 12);
            if(dice1 + dice2 == sum) { 
                j = 1;
            } else { 
             j = 0;
            }
            
        }
        return j;
    }    
}
