import java.util.Scanner;
class ComputeTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Variable
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        double[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 20885, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}
        };

        //status
        System.out.print("(0-single filer, \n1-married jointly or qualifying widow(er)"+
                            ",\n2-married sepately, \n3-Head of household)"+
                            "\n Enter the filling status: ");

        int status = in.nextInt();

        if(status > 3) {
            System.exit(1);
        }
        
        //income
        System.out.print("Enter taxable income: ");
        double income = in.nextDouble();

        //tax
        double tax = computeTax(income, status, rates, brackets);

        //Display tax
        System.out.println("Tax is "+tax);

    }

    public static double computeTax (double income, int status, double[] rates, double[][] brackets) { 
        double tax = 0;

        if(income <= brackets[status][0]) { 
            tax = income * rates[0]; 

        } else if (income <= brackets[status][1]) { 

            tax = brackets[status][0] * rates[0] + (income - brackets[status][0]) * rates[1];

        } else if (income <= brackets[status][2]) { 

            tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
            (income - brackets[status][1]) * rates[2];
            
        } else if (income <= brackets[status][3]) {

            tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
            (brackets[status][2] - brackets[status][1]) * rates[2] +(income - brackets[status][2]) * rates[3];
            
        } else if (income <= brackets[status][4]) { 

            tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
            (brackets[status][2] - brackets[status][1]) * rates[2] +(brackets[status][3] - brackets[status][2]) * rates[3] +
            (income - brackets[status][3]) * rates[4];
            
        } else { 
            tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
            (brackets[status][2] - brackets[status][1]) * rates[2] +(brackets[status][3] - brackets[status][2]) * rates[3] +
            (brackets[status][4] - brackets[status][3]) * rates[4] + (income - brackets[status][4]) * rates[5] ;
            
        }

        return tax;
    }
 }