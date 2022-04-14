import java.util.Scanner;
class SortTwoDArray { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        int[][] array = new int[6][2];

        //prompt user
        System.out.print("Enter the array (row-by-row): ");
        for(int i = 0; i < array.length; i++) { 
            array[i][0] = in.nextInt();
            array[i][1] = in.nextInt();
        }

        //sort
        sortTwoD(array);

        for(int i = 0; i < array.length; i++) {
                System.out.print("("+array[i][0]+","+array[i][1]+") ");
        }

    }

    public static void sortTwoD(int[][] m) {

        for(int i = 0; i < m.length; i++) { 
            int key = m[i][0];
            int key2 = m[i][1];
            for(int j = i + 1; j < m[i].length - 1; j++) { 
                if(key < m[j][0]) { 
                    key = m[j][0];
                    key2 = m[j][1];
                } else if (key == m[i][0]) {
                    if(key2 < m[j][1]) { 
                        key = m[j][0];
                        key2 = m[j][1];
                    }
                }

                int temp = m[i][0];
                m[i][0] = key;
                key = temp;

                int temp2 = m[i][1];
                m[i][1] = key2;
                key2 = temp2;
            }
        }
    }
}