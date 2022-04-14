import java.util.Scanner;

class BinToDec {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       System.out.println("Enter the Binary String: ");
       String binStr = in.nextLine();
       in.close();

       try {
           System.out.println("Decimal value of binary string " + binStr + " is " + Binary2Dec(binStr));
       } catch (BinaryFormatException e) {
           System.out.println(e.getMessage());
       }
    }   
    
    public static int Binary2Dec(String binStr) throws BinaryFormatException{
        int result = 0;
        for(int i = 0, j = binStr.length() - 1; i < binStr.length(); i++, j--) {
            if(binStr.charAt(i) < '0' || binStr.charAt(i) > '1') {
                throw new BinaryFormatException("Binary string is not valid");
            }

            result += (Integer.parseInt(String.valueOf(binStr.charAt(i)))) * Math.pow(2, j);
        }
        return result;
    }
}

class BinaryFormatException extends Exception {
    BinaryFormatException(String str) {
        super(str);
    }
}
