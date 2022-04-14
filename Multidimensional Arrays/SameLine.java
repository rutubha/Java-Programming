import java.util.Scanner; 
class SameLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        double[][] points = new double[5][2];

        //prompt user
        System.out.print("Enter Five points: ");
        for(int i = 0; i < points.length; i++) { 
            for(int j = 0; j < points[i].length; j++) { 
                points[i][j] = in.nextDouble();
            }
        }

        //check 
        boolean flag = sameLine(points);

        if(flag) { 
            System.out.println("The five points are on the same line");
        } else { 
            System.out.println("The five points are not on the same line");
        }

    }

    public static boolean sameLine(double[][] points) { 
        boolean value = false;

        for(int i = 0; i < points.length - 1; i++) { 
                double side = (points[i + 1][0] - points[i][0]) * (points[i+1][1] - points[i][1]) -
                                 (points[i + 2][0] - points[i][0]) * (points[i+2][1] - points[i][1]);

                if(side == 0) { 
                    value = true;
                 } else {
                    value = false;
                    break;
                 }                 
        }

        return value;
    }
}
