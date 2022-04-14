import java.util.Scanner;

class Hex2Dec{ 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the hexString: ");
        String hexStr = in.nextLine();
        in.close();
        try {
            System.out.println("The decimal value for hex number " + hexStr + " is " + hexToDec(hexStr));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double hexToDec(String hexStr) throws NumberFormatException{
        double result = 0;
        for(int i = 0; i < hexStr.length(); i++) {
            if(!(hexStr.charAt(i) >= '0' && hexStr.charAt(i) <= 'F')) {
                    throw new NumberFormatException("String is not a hex string");
            }

            char hexchar = hexStr.charAt(i);
            result = result * 16 + hexCharToDecimal(hexchar);
        }
        return result;
    }

    public static int hexCharToDecimal(char ch) {
        if(ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }
}