package org.turntabl.javaone.objectsandclasses;

public class BondTrades extends Trade{

    private final Double dividend;

    public BondTrades(String id, String symbol, int quantity, double dividend) {
        super(id, symbol, quantity);
        this.dividend = dividend;
    }

    public BondTrades(String id, String symbol, int quantity, double price, double dividend) {
        this(id,symbol,quantity,dividend);
        super.price = price;
    }

    @Override
    double calcDividend() {
        // Formula to calculate dividend for trade
        return 0;
    }
}
