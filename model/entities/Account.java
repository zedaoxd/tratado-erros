package Exercicio12.model.entities;

import Exercicio12.model.exceptions.DomainExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance, withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        if(this.withdrawLimit < amount){
            throw new DomainExceptions("Withdraw error: The amount exceeds withdraw limit");
        } else if(this.balance < amount) {
            throw new DomainExceptions("Withdraw error: Not enough balance");
        }
        this.balance -= amount;
    }
}
