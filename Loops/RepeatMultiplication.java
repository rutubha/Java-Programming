import java.util.Scanner;
class RepeatMultiplication {
    public static void main(String[] args) {
        int FINAL_NUMBER_QUESTION = 12;
        long start_time = System.currentTimeMillis();
        int count = 0;
        int correct_count = 0;
        String output = " ";

        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        while (count < FINAL_NUMBER_QUESTION) {
           
            int number1 = (int)(Math.random() * 100);
            int number2 = (int)(Math.random() * 100);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
             
            System.out.print("\nWhat is the answer of " + number1 +"-"+ number2 +"?");
            int answer = input.nextInt();

            if (number1 - number2 == answer){
                System.out.print("You are correct !!");
                correct_count ++;
            } else {
                System.out.print("You are Wrong ");
            }

            count ++;
             output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? " correct" : " wrong");
        }

        long end_time = System.currentTimeMillis();
         long test_time = end_time - start_time;

         System.out.print("\nCorrect countg is "+ correct_count + "\n Test time is "+ (test_time / 1000) + "seconds" + output);
    }
}
