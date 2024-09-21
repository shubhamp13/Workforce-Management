package com.employeemanagement.entities;

import jakarta.persistence.*;

@Entity
public class BankAccount
{
    @Id
    private Long  bankAccountNumber;
    private String  bankAccountType;

    public Long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(Long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccountNumber=" + bankAccountNumber +
                ", bankAccountType='" + bankAccountType + '\'' +
                '}';
    }
}
