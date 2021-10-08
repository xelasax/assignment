package org.turntabl.javaone.objectsandclasses;

public abstract class Trade {
    String id;
    String symbol;
    int quantity;
    double price = 0;

    abstract double calcDividend();

    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public Trade(String id, String symbol, int quantity, double price) {
        this(id,symbol,quantity);
        this.price = price;
    }


    @Override
    public String toString() {
        return "Trade [" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ']';
    }

    public void setPrice(double price) {
        if(price < 0 ) {
           throw new RuntimeException("Invalid Price. Price cannot be negative");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
