package org.venkatesh.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Transaction {
    private String transactionId;
    private TransactionType type;
    private BigDecimal amount;
    private Account sender;
    private Account receiver;
}
