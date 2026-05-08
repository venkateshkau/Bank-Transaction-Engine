package org.venkatesh;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class DemoRunner {
    int nextAccountId = 101;
    Map<Integer, Account> accounts = new HashMap<>();

    public Account createAccount(BigDecimal balance) {
        Account account = new Account(nextAccountId++, balance);
        accounts.put(nextAccountId, account);
        return account;
    }

    public Transaction createTransaction(Account account, BigDecimal amount) {

    }
}
