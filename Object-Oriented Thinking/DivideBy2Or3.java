import java.math.BigDecimal;

class DivideBy2Or3 {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal(Long.MAX_VALUE);
        int count = 0;

        while(count < 10) {
            if(num.remainder(new BigDecimal(2)).equals(BigDecimal.ZERO) || 
            num.remainder(new BigDecimal(3)).equals(BigDecimal.ZERO) ) {
                count++;
                System.out.println(count+" : "+num);
            }
            num = num.add(BigDecimal.ONE);
        }
    }    
}
