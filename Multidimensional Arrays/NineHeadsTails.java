import java.util.Scanner; 
class NineHeadsTails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        char[][] matrix = new char[3][3];

        //prompt user
        System.out.print("Enter number between 0 and 511: ");
        int number = in.nextInt();


        //equivalent binary
        String binary = decimalToBinary(number);

        //store in matrix and display
        int n = 0;
        //row
        for(int i = 0; i < matrix.length; i++) { 
            //column
            for(int j = 0; j < matrix[i].length; j++) {
                //value is 0 than H else T 
                if(binary.charAt(n) == '0') { 
                    matrix[i][j] = 'H';
                } else {
                    matrix[i][j] = 'T';
                }
                //Display
               System.out.print(matrix[i][j]+" ");
               n++;
            }
            System.out.println();
        }

    }

    public static String decimalToBinary(int number) { 
        int i = 0;
        //store reminder by array
        int arr[] = new int[32];

        while (number > 0) { 
            arr[i] = number % 2;
            number = number / 2;
            i++;
        }

        //store 9 digit binary into string
        String temp= "";
        for(int j = 8; j >= 0; j--){
            temp = temp + arr[j];
        }

        return temp;
    }

}
