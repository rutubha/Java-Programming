class CreditCardNumber { 
    public static void main(String[] args) {
        String value = "4388576018410707";
       System.out.println(isValid(value));
    }

    public static boolean isValid (String number) { 
        boolean valid = false;
        if (number.length() >= 13 || number.length() <= 16) {
            valid = true;
        }

        if (number.charAt(0) == 4 || (number.charAt(0) == 3 && number.charAt(1) == 7) || number.charAt(0) == 5 || number.charAt(0) == 6) {
            valid = true;
        }

        int evenSum = sumOfDoubleEvenPlace(number);
        int oddSum = sumOfOddPlace(number);
        int total = evenSum + oddSum;

        if (total % 10 == 0) {
            valid = true;
        } else {
            valid = false;
        }

        return valid;
    }

    public static int sumOfDoubleEvenPlace (String number) {
        int sum = 0;
        int n = number.length() - 2;
        while(n >= 0) {
            sum = sum + getDigit((int)(number.charAt(n)));
            n = n - 2;
        }

        return sum;
    }

    public static int getDigit (int number) {
        int value = 0;
        if (number % 9 == number) {
            value = number;
        } else {
            value = (number % 10) + (number / 10);
        }

        return value;
    }

    public static int sumOfOddPlace (String number) {
        int sum = 0;
        int n = number.length() - 1;
        while (n >= 0) { 
            sum = sum + (int)(number.charAt(n));
            n = n - 2;
        }
        return sum;
    }
}