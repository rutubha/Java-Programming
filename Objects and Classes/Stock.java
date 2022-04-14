class Stock { 
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String symbol, String name) { 
        this.symbol = symbol;
        this.name = name;
    }

    void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    double getChangePercentage() { 
      return (currentPrice - previousClosingPrice) * 100;  
    }
}