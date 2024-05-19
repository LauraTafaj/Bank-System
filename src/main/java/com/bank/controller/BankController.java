package com.bank.controller;

import com.bank.model.Account;
import com.bank.model.Transaction;
import com.bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BankController {
    @Autowired
    private BankService bankService;

    @PostMapping("/accounts")
    public Account createAccount(@RequestParam String name) {
        return bankService.createAccount(name);
    }

    @PostMapping("/accounts/{accountId}/deposit")
    public Account deposit(@PathVariable Long accountId, @RequestParam double amount) {
        return bankService.deposit(accountId, amount);
    }

    @PostMapping("/accounts/{accountId}/withdraw")
    public Account withdraw(@PathVariable Long accountId, @RequestParam double amount) {
        return bankService.withdraw(accountId, amount);
    }

    @GetMapping("/accounts/{accountId}/transactions")
    public List<Transaction> getTransactions(@PathVariable Long accountId) {
        return bankService.getTransactions(accountId);
    }
}
