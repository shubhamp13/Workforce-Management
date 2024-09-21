package com.employeemanagement.controller;

import com.employeemanagement.entities.BankAccount;
import com.employeemanagement.repositories.BankAccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankAccountController
{
    private final BankAccountRepository bankAccountRepository;

    public BankAccountController(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @PostMapping("/accounts")
    public BankAccount saveBankAccount(@RequestBody BankAccount bankAccount)
    {
        return bankAccountRepository.save(bankAccount);
    }

    @GetMapping("/accounts")
    public List<BankAccount> getAllBankAccounts()
    {
        return bankAccountRepository.findAll();
    }
    @PostMapping("/accounts-list")
    public List<BankAccount> saveListBankAccount(@RequestBody List<BankAccount> bankAccounts)
    {
        return bankAccountRepository.saveAll(bankAccounts);
    }
}
