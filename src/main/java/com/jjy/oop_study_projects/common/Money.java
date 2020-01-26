package com.jjy.oop_study_projects.common;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Money {
    public static Money ZERO = Money.wons(0);
    private BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public Money plus(Money money) {
        return new Money(this.amount.add(money.getAmount()));
    }

    public Money minus(Money money) {
        return new Money(this.amount.subtract(money.getAmount()));
    }

    public Money times(double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }
}
