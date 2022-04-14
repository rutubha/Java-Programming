import java.util.Scanner; 
class FourEqualNumber { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        //variable
        int[][] values = new int[6][6];

        //prompt user
        System.out.println("Enter the array: ");
        for(int i = 0; i < values.length; i++) { 
            for(int j = 0; j < values[i].length; j++) { 
                values[i][j] = in.nextInt();
            }
        }

        //check consecutive four
        boolean value = isConsecutiveFour(values);

        //Display
        if(value) { 
            System.out.println("Yes,this is hold consexutive four");
        } else { 
            System.out.println("No,this is not hold consexutive four");
        }

    }

    public static boolean isConsecutiveFour(int[][] m) { 
        boolean value = false;

       

        for(int i = 0; i < m.length; i++) { 
            for(int j = 0; j < m[i].length; j++) {
                int row = 0;
                int col = 0;
                int dia = 0, dia1 = 0; 
                for(int n = 0; n < 4; n++) { 
                    if( (n + j) < m[i].length - 1) { 
                        if(m[i][j] == m[i][n]) { 
                            row++;
                        }
                    }

                    if( (n + i) < m.length - 1) {
                        if(m[i][j] == m[n][j]) { 
                            col++;
                        }    
                    }

                    if( (j + n) < m.length - 1 && (i + n) < m.length - 1) { 
                        if(m[i][j] == m[i+n][j+n]) {
                            dia++;
                        }
                    }

                    if((j - n) > 0 && (i - n) > 0) {
                        if(m[i][j] == m[i-n][j-n]) { 
                            dia1++;
                        }
                    }
                }

                if(row == 4 || col == 4 || dia == 4 || dia1 == 4) { 
                    value = true;
                    break;
                }
            }
        }

        return value; 
    }
}