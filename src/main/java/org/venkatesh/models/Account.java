package org.venkatesh.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Account {
    private int accountId;
    private BigDecimal balance;
}
