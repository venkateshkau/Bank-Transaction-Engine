package org.venkatesh;

import java.math.BigDecimal;


public class Account {
    private int accountId;
    private BigDecimal balance;

    public Account(int accountId, BigDecimal balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal balance) {
        this.balance = this.balance.add(balance);
    }

    public void withdraw(BigDecimal balance) {
        if(this.balance.subtract(balance).compareTo(BigDecimal.ZERO) >= 0) {
            this.balance = this.balance.subtract(balance);
        }
    }
}
