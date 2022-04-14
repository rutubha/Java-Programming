import java.util.Scanner; 
class ConnectFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        char[][] box = new char[6][6];

        for(int i = 0; i < box.length; i++) { 
            for(int j = 0; j < box[i].length; j++) { 
               box[i][j] = ' ';
            }
        }

        //display
        display(box);

        int n = 0;
        int turn = 0;
        int[] rows = {5, 5, 5, 5, 5, 5};
        while(n < box.length) { 
            if(turn == 0) { 
                System.out.print("Drop a red disk at column (0-6): ");
                int col = in.nextInt();
                int row = rows[col];
 
                add(box, col, row, 'R');

                turn++;
                rows[col]--;

                display(box);
                boolean win = checkWin(box, 'R');
                if(win) { 
                     System.out.println("Player R win");
                     break;
                 }
            } else {
                System.out.print("Drop a yellow disk at column (0-6): ");
                int col = in.nextInt();
                int row = rows[col];

                add(box, col, row, 'Y');

                turn = 0;
                rows[col]--;

                display(box);

                display(box);
                boolean win = checkWin(box, 'Y');
                if(win) { 
                     System.out.println("Player R win");
                     break;
                 }
            }
        }
    }

    public static void add(char[][] m,int col,int row,char player) { 
        m[row][col] = player;
    }


    public static void display(char[][] m) { 
        for(int i = 0; i < m.length; i++) { 
            System.out.print("|");
            for(int j = 0; j < m[i].length; j++) {
                
                System.out.print(m[i][j]+"|");
            }
            System.out.println(" ");
        }

        System.out.println("-------------");
    }

    public static boolean checkWin(char[][] m,char p) { 
        boolean win = false;

        for(int i = 0; i < m.length; i++) { 
            for(int j = 0; j < m[i].length; j++) { 
                if(j+3 < m[i].length) { 
                    if(m[i][j] == p && m[i][j + 1] == p && m[i][j + 2] == p && m[i][j + 3] == p) { 
                        win = true;
                    }
                }

                if(i+3 < m.length) { 
                    if(m[i][j] == p && m[i + 1][j] == p && m[i+2][j] == p && m[i+3][j] == p) { 
                        win = true;
                    }
                }
            }
        }

        return win;
    }
}
