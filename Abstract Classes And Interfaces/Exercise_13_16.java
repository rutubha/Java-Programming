class Exercise_13_16 {
    public static void main(String[] args) {
        
        //Check args is valid
        if(args.length != 1) {
            System.out.println("Usage: java Exercise_15_16 \"intruction\"");
            System.exit(0);;
        }

        //Store into the string
        String cal = args[0];

        //split
        String[] str = cal.replaceAll(" ", "/").split("/");

        //Create rational object
        Rational r1 = new Rational(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        Rational r2 = new Rational(Integer.parseInt(str[3]), Integer.parseInt(str[4]));

        //Retrive operand
        switch (str[2].charAt(0)) {
            case '+': cal += " = " + r1.add(r2); 
                break;
            case '-': cal += " = " + r1.subtract(r2); 
                break;
            case '.': cal += " = " + r1.multiply(r2); 
                break;
            case '/': cal += " = " + r1.divide(r2); 
                break;
            default:
                System.out.println("Illegel argument: + - . /");
                System.exit(2);;
        }

        //display result 
        System.out.println(cal);
    }
}