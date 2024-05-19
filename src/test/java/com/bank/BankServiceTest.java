package com.bank.service;

import com.bank.model.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
public class BankServiceTest {
	@Autowired
	private BankService bankService;

	@Test
	public void testCreateAccount() {
		Account account = bankService.createAccount("John Doe");
		assertEquals("John Doe", account.getName());
		assertEquals(0.0, account.getBalance());
	}

	@Test
	public void testDeposit() {
		Account account = bankService.createAccount("John Doe");
		account = bankService.deposit(account.getId(), 100.0);
		assertEquals(100.0, account.getBalance());
	}

	@Test
	public void testWithdraw() {
		Account account = bankService.createAccount("John Doe");
		account = bankService.deposit(account.getId(), 100.0);
		account = bankService.withdraw(account.getId(), 50.0);
		assertEquals(50.0, account.getBalance());
	}
}
