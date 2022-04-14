import java.util.Scanner; 
class DecimalToBinary {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the Decimal number
        System.out.println("Enter tour Decimal Number :");
        double decimal = input.nextDouble();

        double []binary = new double [16];

        //create for loop to compute binary equivalent 
        for (int i = 0; i <= decimal /2; i++) {
             decimal = decimal / 2;
            do{
                binary[i] = decimal % 2;
            } while(decimal != 1);
           
        }

        for(int j = binary.length; j <= 0; j--){
            System.out.print(binary[j]);
        }
    }
}
