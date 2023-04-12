package com.gaddafi.musa;

public class Assets {

    private String symbol;
    private String name;



    public Assets(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    @Override
    public String toString() {
        return "%-8s %s".formatted(symbol, name);
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
