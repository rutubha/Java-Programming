class Calculator {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        char c = '+';

        int i = 0;
        int count = 0;
        while(count < 3) {
            if((int)args[i].charAt(0) != 32) {
                if(count == 0) {
                    a = Integer.parseInt(args[i]);
                    count++;
                } else if (count == 1) {
                    c = args[i].charAt(0); 
                    count++;
                } else {
                    b = Integer.parseInt(args[i]);
                    count++;
                }
            }

            i++;
        }

        switch (c) {
            case '+': System.out.println(a+b);
                break;

            case '-': System.out.println(a-b);
                break;

            case '.': System.out.println(a*b);
                break;
                
            case '/': System.out.println(a/b);
                break;
            
            default : System.out.println("Something went wrong");
        }
    }    
}
