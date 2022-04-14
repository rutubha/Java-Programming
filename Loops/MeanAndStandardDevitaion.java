import java.util.Scanner; 
class MeanAndStandardDevitaion {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the ten number 
        double []number = new double[10];

        for ( int i = 0; i < number.length; i++){
            System.out.println("Enter the number " +(i + 1)+ " :");
            number[i] = input.nextDouble();
        }

        //find the mean
        double sum= 0;

        for ( int j = 0; j < number.length; j++) {
            sum = sum + number[j];
        }

        double mean = sum / number.length;

        //find the standard devitaion 
        double sum1 = 0;
        for ( int i = 0; i < number.length; i++) {
            sum1 = sum1 + number[i] * number[i];
        }

        double devitaion = (sum1 - ((sum * sum) / number.length )) / (number.length - 1);
        double standard_devitaion = Math.sqrt(devitaion);

        System.out.println("The mean is "+String.format("%.2f", mean));
        System.out.println("The devition is "+ String.format("%.4f", standard_devitaion));
    }
}
