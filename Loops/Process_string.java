import java.util.Scanner; 
class Process_string {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the string
        System.out.print("Enter the string: ");
        String value = input.nextLine();

        //create for loop
        int n = value.length() / 2;
        for (int i = 0; i < n ; i++) {
            if (value.charAt(2 * i + 1) != ' ')
                System.out.print(value.charAt(2 * i + 1));
            
        }
    }
}
