package org.venkatesh;

import java.math.BigDecimal;

public class Transaction {
    private String transactionId;
    private TransactionType type;
    private BigDecimal amount;
    private Account sender;
    private Account receiver;

    public Transaction(String transactionId, TransactionType type, BigDecimal amount, Account sourceAccount) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.sender = sourceAccount;
    }

    public Transaction(String transactionId, TransactionType type, BigDecimal amount, Account sender, Account receiver) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getTransactionId() {
        return transactionId;
    }


    public TransactionType getType() {
        return type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Account getSender() {
        return sender;
    }

    public Account getReceiver() {
        return receiver;
    }

}
