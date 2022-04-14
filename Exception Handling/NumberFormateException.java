class NumberFormateException {
    public static void main(String[] args) {

        try {
            int result = 0;
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) +
                            Integer.parseInt(args[2]);
                    break;

                case '-':
                    result = Integer.parseInt(args[0]) -
                            Integer.parseInt(args[2]);
                    break;

                case '.':
                    result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                    break;

                case '/':
                    result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
                    break;
            
            }

            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]+ " = " + result);
        }
        catch(Exception e) {
            System.out.println("Exception please enter the correct numberic number");
        }
    }
}