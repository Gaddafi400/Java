package com.gaddafi.musa;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private int id;
    private List<Assets> assets = new ArrayList<>();

    public Account(int id, List<Assets> assets) {
        this.id = id;
        this.assets = assets;
    }

    public void printAssets() {
        for (var asset : assets) {
            System.out.println(asset);
        }
    }

    public List<Assets> getAssets() {
        return assets;
    }

    public int getId() {
        return id;
    }

}
