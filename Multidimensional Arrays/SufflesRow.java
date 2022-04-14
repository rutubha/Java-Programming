import java.util.Scanner;
class SufflesRow { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        //variable
        int[][] array = new int[6][2];

        //prompt user
        System.out.print("Enter the array: ");
        for (int i = 0; i < array.length; i++) { 
            for(int j = 0; j < array[i].length; j++) { 
                array[i][j] = in.nextInt();
            }
        }

        //Display array
        System.out.println("Before Suffle");
        display(array);        
        //shuffles
        suffle(array);

        //after suffle
        System.out.println("After Suffle");
        display(array);
    }

    public static void suffle(int[][] m) { 
        int r1 = (int)(Math.random()*m.length);
        int r2 = (int)(Math.random()*m.length);

        for(int i = 0; i < m[r1].length; i++) { 
            int temp1 = m[r1][i];
            m[r1][i] = m[r2][i];
            m[r2][i] = temp1;
        }
    }

    public static void display(int[][] array) { 
        System.out.print("{");
        for(int i = 0; i < array.length; i++) {
            System.out.print("{"+array[i][0]+","+array[i][1]+"}, ");
        }
        System.out.println("}");
    }
}