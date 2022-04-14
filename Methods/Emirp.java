class Emirp {
    public static void main(String[] args) {
        int count = 0;
        int space = 0;
        int i = 2;
        while(count <=120) {
            boolean result = Emirp(i);
            if (result) {
                System.out.print(i+" ");
                count++;
                space++;
            }
            if(space == 10) {
                System.out.println(" ");
                space = 0;
            }
            i++;
        }
        System.out.println(Emirp(23));
    }   
    public static boolean Emirp(int n) {
        boolean result = true;
        for(int i = 2; i <= (n / 2); i++) { 
            if (n % i == 0) {
                result = false;
            }
            else {
                result = true;
            }
        }

        if ( result == true) {
            int digit = 0;
            while (n != 0) {
                digit = digit * 10;
                digit = digit + (n % 10);
                n = n / 10; 
            }
            for(int i = 2; i <= (digit / 2); i++) { 
                if (digit % i == 0) {
                    result = false;
                }
                else {
                    result = true;
                }
            }
        }

        
        return result;
    } 
}
