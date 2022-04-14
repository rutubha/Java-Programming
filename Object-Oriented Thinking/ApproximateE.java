import java.math.BigDecimal;

class ApproximateE {
    public static void main(String[] args) {
      int i = 100;
      while(i <= 1200) {
          System.out.println("e value is" + getE(i));
          i += 100;
      }  
    }   
    
    public static BigDecimal getE(int j) {
       BigDecimal sum = new BigDecimal(1);
        int  fact = 1;
        for(int i = 1; i < j; i++) {
            fact = fact * i;
            double divider = 1 / fact;
            sum = sum.add(new BigDecimal(divider));
       }

        return sum;
    }
}

