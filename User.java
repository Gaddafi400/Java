package com.gaddafi.musa;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Account> accounts = new ArrayList<>();
    private String username;
    private int Id;

    public User(String username, int Id, Account account) {
        this.username = username;
        this.Id = Id;
        this.accounts.add(account);
    }

    public String getUsername() {
        return username;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    @Override
    public String toString() {
        return "%-8s %d".formatted(username, Id);
    }
}
