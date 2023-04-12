package com.gaddafi.musa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // User Account
        Account account1 = new Account(1000, List.of(
                new Assets("BTC", "Bitcoin"),
                new Assets("ETH", "Ethereum"),
                new Assets("USDT", "Tether"),
                new Assets("FTM", "Fantom")));
        Account account2 = new Account(1000, List.of(
                new Assets("XRP", "XRP"),
                new Assets("MATIC", "Polygon"),
                new Assets("DOT", "Polkadot")));
        Account account3 = new Account(1000, List.of(
                new Assets("TRX", "Tron"),
                new Assets("UNI", "Uniswap"),
                new Assets("ATOM", "Cosmos"),
                new Assets("FIL", "Filecoin")));
        // User
        User user = new User("Qaddafi", 10001, account1);
        user.addAccount(account2);
        user.addAccount(account3);

        var acc2OrMore = acctWithMoreThanTwoAsset(user.getAccounts());
        System.out.println(acc2OrMore.size());
        var acctBTC = accWithBTC(user.getAccounts());
        System.out.println(acctBTC.size());

    }

    public static List<Account> acctWithMoreThanTwoAsset(List<Account> accounts) {
        List<Account> acctList = new ArrayList<>();
        for (var acct : accounts) {
            if (acct.getAssets().size() >= 2) {
                acctList.add(acct);
            }
        }
        return acctList;
    }

    public static List<Account> accWithBTC(List<Account> accounts) {
        List<Account> BTCAcct = new ArrayList<>();
        for (var acct : accounts) {
            for (var asset : acct.getAssets()) {
                if (asset.getSymbol().equals("BTC")) {
                    BTCAcct.add(acct);
                }
            }
        }
        return BTCAcct;
    }
}
