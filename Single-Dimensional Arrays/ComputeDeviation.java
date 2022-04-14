import java.util.Scanner;
class ComputeDeviation {
    public static void main (String[] args) {
        //Create Scanner Object
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the three numbers
        double[] nummbers = new double[10];

        System.out.print("Enter ten number : ");

        for (int i = 0; i < nummbers.length; i++) {
            nummbers[i] = in.nextDouble();
        }

        //Compute mean and deviation using method 

        System.out.println("The mean is "+ String.format("%.2f",mean(nummbers)));
        System.out.println("The deviation is " + String.format("%.5f",deviation(nummbers)));
    }

    public static double deviation(double[] list) {
        double deviation = 0;

        double mean = mean(list);
        for (int i = 0; i < list.length; i++) {
            deviation = deviation + ((list[i] - mean)*(list[i] - mean));
        }
        deviation = (deviation)/(list.length - 1);
        deviation = Math.sqrt(deviation);

        return deviation;
    }

    public static double mean(double[] list) {
        double mean = 0;

        for (int i = 0; i < list.length; i++) {
            mean = mean + list[i];
        }
        mean = mean/list.length;
        return  mean;
    }
}
