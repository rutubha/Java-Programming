class Tax {
    private int fillingStatus;    
    private int[][] brackets = {
                                    {27050, 65550, 136750, 297350},
                                    {45200, 109250, 166500, 297350},                         
                                    {22600, 54625, 83250, 148675},
                                    {36250, 93650, 151650, 287351}
                                };
    private double[] rates = {0.15, 0.275, 0.305, 0.355, 0.391};
    private double taxableIncome;

    Tax(){
       this.fillingStatus = 0;
       this.taxableIncome = 0;
    }

    Tax(int fillingStatus, int[][] brackets, double[] rates, double taxableIncome) { 
        this.fillingStatus = fillingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    void setFillingStatus(int fillingStatus) {
        this.fillingStatus = fillingStatus;
    }

    void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }
    void setRates(double[] rates) {
        this.rates = rates;
    }

    void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    int getFillingStatus() {
        return fillingStatus;
    }

    int[][] getBrackets() {
        return brackets;
    }

    double[] getRates() {
        return rates;
    }

    double getTaxableIncome() {
        return taxableIncome;
    }

    double getTax(){ 

        if(this.taxableIncome < brackets[this.fillingStatus][0]){
            return this.taxableIncome * rates[0];
        } else if(this.taxableIncome < brackets[this.fillingStatus][1]){
            return ((brackets[this.fillingStatus][0]) * rates[0] +
                     (this.taxableIncome - brackets[this.fillingStatus][0]) * rates[1]);
        } else if(this.taxableIncome < brackets[this.fillingStatus][2]){ 
            return ((brackets[this.fillingStatus][0]) * rates[0] + 
                    (brackets[this.fillingStatus][1] - brackets[this.fillingStatus][0]) * rates[1] + 
                    (this.taxableIncome - brackets[this.fillingStatus][1]) * rates[2]);  
        } else if(this.taxableIncome < brackets[this.fillingStatus][3]){ 
            return ((brackets[this.fillingStatus][0]) * rates[0] + 
                (brackets[this.fillingStatus][1] - brackets[this.fillingStatus][0]) * rates[1] + 
                (brackets[this.fillingStatus][2] - brackets[this.fillingStatus][1]) * rates[2] + 
                (this.taxableIncome - brackets[this.fillingStatus][2]) * rates[3]); 
        } else if (this.taxableIncome > brackets[this.fillingStatus][3]){ 
            return ((brackets[this.fillingStatus][0]) * rates[0] + 
                (brackets[this.fillingStatus][1] - brackets[this.fillingStatus][0]) * rates[1] + 
                (brackets[this.fillingStatus][2] - brackets[this.fillingStatus][1]) * rates[2] + 
                (brackets[this.fillingStatus][3] - brackets[this.fillingStatus][2]) * rates[3] + 
                (this.taxableIncome - brackets[this.fillingStatus][3]) * rates[4]); 
        }

        return 0;
    }
}
