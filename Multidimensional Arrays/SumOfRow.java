import java.util.Scanner;
class SumOfRow { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        //create 3 by 4 array
        double[][] list = new double[3][4];

        //prompt the user to enter the number
        System.out.println("Enter a 3-by-4 matrix row by row: ");

        //Scan the row by outer for loop
        for(int i = 0; i < list.length; i++) {
            //Scan th collumn by inner for loop
            for(int j = 0; j < list[i].length; j++) { 
                list[i][j] = in.nextDouble();
            }
        }

        //compute the sum of every row
        for(int i = 0; i < list.length; i++) { 
            double sum = sumOfRow(list, i);
            System.out.println("Sum of element at row "+i+" is "+sum);
        }

    }

    public static double sumOfRow(double[][] numbers, int rowIndex) {
        double sum = 0; 
        for(int i = 0; i < numbers[rowIndex].length; i++) { 
           sum = sum + numbers[rowIndex][i];
        }

        return sum;
    }
}