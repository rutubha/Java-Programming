import java.util.Scanner;
class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        char[][] table = new char[3][3];

        //fisrt time display table as blank
        System.out.println("-------------");
        for(int i = 0; i < table.length; i++) { 
            System.out.print("| ");
            for(int j = 0; j < table[i].length; j++) { 
                table[i][j] = ' ';
                System.out.print(table[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }

        //turn to sign char
        boolean win = false;
        int count = 0;

        while(win == false) {
            if(count == 0) { 
                System.out.println("Enter a row (0,1 or 2) for player X:");
                int row = in.nextInt();
                System.out.println("Enter a column(0,1 or 2) for player X:");
                int column = in.nextInt();
                count++;
    
                sign(table, 'X', row, column);
    
                display(table);

                win = checkWin(table, 'X');

                if(win) {
                    System.out.println("X Player won");
                }
    
            } else if(count == 1) {
                System.out.println("Enter a row (0,1 or 2) for player 0:");
                int row = in.nextInt();
                System.out.println("Enter a column(0,1 or 2) for player 0:");
                int column = in.nextInt();
                count = 0;
    
                sign(table, '0', row, column);
                display(table);

                win = checkWin(table, '0');

                if(win) {
                    System.out.println("0 Player won");
                }
            }
        }
    }

    public static void sign(char[][] table,char player,int row, int col) { 

        if(table[row][col] == ' ') {
            table[row][col] = player;
        } else {
            System.out.println("your turn is skip because you are cheated.");
        }
      
    }

    public static void display(char[][] table) {
        System.out.println("-------------");
        for(int i = 0; i < table.length; i++) { 
            System.out.print("| ");
            for(int j = 0; j < table[i].length; j++) { 
                System.out.print(table[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static boolean checkWin(char[][] table, char player) {
        boolean win = false;
        for(int i = 0; i < table.length; i++) {  
            if(table[i][0] == player && table[i][1] == player && table[i][2] == player) { 
                win =true;
                break;
            } else if(table[0][i] == player && table[1][i] == player && table[2][i] == player) {
                win = true;
                break;
            } else if(table[0][0] == player && table[1][1] == player && table[2][2] == player) { 
                win = true;
            } else if(table[0][2] == player && table[1][1] == player && table[2][0] == player) { 
                win = true;
                break;
            }
           
        }

        return win;
    }
}
