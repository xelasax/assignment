package org.turntabl.javaone.objectsandclasses;

public class FundTrade extends Trade{

    private Double dividend;

    public FundTrade(String id, String symbol, int quantity, double dividend) {
        super(id, symbol, quantity);
        this.dividend = (dividend/100);
    }

    public FundTrade(String id, String symbol, int quantity, double price, double dividend) {
        this(id,symbol,quantity,dividend);
        super.price = price;
    }

    @Override
    double calcDividend() {
        // Formula to calculate dividend for fund
        return 0;
    }

}
