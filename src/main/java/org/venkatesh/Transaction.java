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

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }
}
