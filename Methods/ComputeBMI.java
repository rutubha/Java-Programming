import java.util.Scanner; 
class ComputeBMI {
    public static void main (String[] args) {
        //Create Scanner Object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the height and weight to compute BMI and -1 to stop
        double height = 0;
        double weight = 0;
        System.out.println("Enter the height and weigth to compute the BMI and enter weight -1 to stop.");
        System.out.println("Enter height in inches and wieght in pounds.");
        do {
            System.out.println("Enter the height:");
            height = sc.nextDouble();
            System.out.println("Enter the weight: ");
            weight = sc.nextDouble();

            if ( weight == -1) {
                System.out.println("STOP");
            } else {
                BMI(height, weight);
            }
        } while (weight != -1);
    }

    public static void BMI(double height, double weight) {
        final double KILOGRAM_PER_POUND = 0.45359237; //Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        double bmi = (weight * KILOGRAM_PER_POUND) / (height * height *METERS_PER_INCH *METERS_PER_INCH);

        if (bmi < 18.5) {
            System.out.println("your BMI is "+bmi+". You are Underweight");
        } else if (bmi < 25) {
            System.out.println("your BMI is "+bmi+". You are Normal");
        } else if (bmi < 30 ) {
            System.out.println("your BMI is "+bmi+". You are Overweight");
        } else {
            System.out.println("your BMI is "+bmi+". You ar Obese");
        }
    }
}
