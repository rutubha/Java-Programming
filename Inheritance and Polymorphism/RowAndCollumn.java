import java.util.*;

class RowAndCollumn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the array size n: ");
        int n = in.nextInt();
        in.close();

        int[][] array = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                array[i][j]= (int)(Math.random() * 2);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        ArrayList<Integer> row = row(array);
        ArrayList<Integer> col = column(array);

        System.out.print("\nMost 0s column index: ");
        for(Integer a : row) {
            System.out.print(a + " ");
        }

        System.out.print("\nMost 0s row index: ");
        for(Integer a : col) {
            System.out.print(a + " ");
        }
    }
    
    public static ArrayList<Integer> row(int[][] array) {
        ArrayList<Integer> row = new ArrayList<>();
        int[] count = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 0) {
                    count[j]++;
                }
            }
        }

        int max = max(count);
        getIndex(row, count, max);

        return row;
    }

    public static ArrayList<Integer> column(int[][] array) {
        ArrayList<Integer> col = new ArrayList<>();
        int[] count = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(array[j][i] == 0) {
                    count[j]++;
                }
            }
        }

        int max = max(count);
        getIndex(col, count, max);

        return col;
    }

    public static int max(int[] a) {
        int max = a[0];

        for(int i = 1; i < a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }

        return max;
    }

    public static void getIndex(ArrayList<Integer> list, int[] count, int x){ 
        for(int i = 0; i < count.length; i++) {
            if(count[i] == x) {
                list.add(i);
            }
        }
    }
}
