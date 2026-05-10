package com.example;

abstract class Money {
    protected int amount;

    abstract Money times(int multiplier);

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && getClass().equals(money.getClass());
    }

    static Money Dollar(int amount) {
        return new Dollar(amount);
    }

    static Money Franc(int amount) {
        return new Franc(amount);
    }

}
