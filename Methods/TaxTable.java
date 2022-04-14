class TaxTable { 
    public static void main (String[] args) { 
        System.out.println("TaxableIncome\t\tSingle\t\tmarried Joint or\t\tMarried\t\tHead of a hous");
        System.out.println("\t\t\t\t\tQualifying Widow");
        System.out.println("_________________________________________________________________________________________________________________");
        
        double taxableIncome = 50000;
        while (70000 >= taxableIncome) {
            double statusFor0 = Math.round(computeTax(0, taxableIncome));
            double statusFor1 = Math.round(computeTax(1, taxableIncome));
            double statusFor2 = Math.round(computeTax(2, taxableIncome));
            double statusFor3 = Math.round(computeTax(3, taxableIncome));
            System.out.println(taxableIncome+"\t\t\t"+statusFor0 + "\t\t" + statusFor1 + "\t\t\t\t" + statusFor2 + "\t\t" + statusFor3);

            taxableIncome = taxableIncome + 100;
        }
    }
    public static double computeTax (int status, double taxbleIncome) {
        double tax = 0;
        if (status == 0) {
            if(taxbleIncome <= 8350) {
                tax = taxbleIncome * 0.10;
            } else if (taxbleIncome <= 33950) {
                tax = 8350 * 0.10 + (taxbleIncome - 8350) * 0.15;
            } else if (taxbleIncome <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxbleIncome - 33950) * 0.25;
            } else if (taxbleIncome <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxbleIncome - 82250) * 0.28;
            } else if  (taxbleIncome <= 372950) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (taxbleIncome - 171550) * 0.33;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (taxbleIncome - 372950) * 0.35;
            }
        } else if (status == 1) {
            if(taxbleIncome <= 16700) {
                tax = taxbleIncome * 0.10;
            } else if (taxbleIncome <= 67900) {
                tax = 16700 * 0.10 + (taxbleIncome - 16700) * 0.15;
            } else if (taxbleIncome <= 137050) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxbleIncome - 67900) * 0.25;
            } else if (taxbleIncome <= 208850) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxbleIncome - 137050) * 0.28;
            } else if  (taxbleIncome <= 372950) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (taxbleIncome - 208850) * 0.33;
            } else {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (taxbleIncome - 372950) * 0.35;
            }
        } else if (status == 2) {
            if(taxbleIncome <= 8350) {
                tax = taxbleIncome * 0.10;
            } else if (taxbleIncome <= 33950) {
                tax = 8350 * 0.10 + (taxbleIncome - 8350) * 0.15;
            } else if (taxbleIncome <= 68525) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxbleIncome - 33950) * 0.25;
            } else if (taxbleIncome <= 104425) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxbleIncome - 68525) * 0.28;
            } else if  (taxbleIncome <= 186475) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (taxbleIncome - 104425) * 0.33;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (taxbleIncome - 186475) * 0.35;
            }
        } else if (status == 3) {
            if(taxbleIncome <= 11950) {
                tax = taxbleIncome * 0.10;
            } else if (taxbleIncome <= 45500) {
                tax = 11950 * 0.10 + (taxbleIncome - 11950) * 0.15;
            } else if (taxbleIncome <= 117450) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxbleIncome - 45500) * 0.25;
            } else if (taxbleIncome <= 190200) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxbleIncome - 117450) * 0.28;
            } else if  (taxbleIncome <= 372950) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (taxbleIncome - 190200) * 0.33;
            } else {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (taxbleIncome - 372950) * 0.35;
            }
        }

        return tax;
    }
}