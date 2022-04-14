import java.math.BigDecimal;

class DivisibleBy3And5 {
    public static void main(String[] args) {
        String numString = "" + 1;

        //Creating 50 digit number string
        for(int i = 0; i < 49; i++) {
            numString += "0";
        }

        //conver 50 digit string int BigDecimal
        BigDecimal num = new BigDecimal(numString);
        int numCount = 0;

        //Find 50 digit number that divisible by 3 or 5
        while (numCount < 10) {
            BigDecimal reminder1 = num.remainder(new BigDecimal(3));
            BigDecimal reminder2 = num.remainder(new BigDecimal(5));

            if(reminder1.equals(BigDecimal.ZERO) || reminder2.equals(BigDecimal.ZERO)) {
                numCount++;
                System.out.println(numCount+": "+num);
            }

            num = num.add(BigDecimal.ONE);
        }
    }
}