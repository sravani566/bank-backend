package com.bankapp;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.dao.TransactionLogDao;
import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.Account;
import com.bankapp.entities.Customer;
import com.bankapp.entities.TransactionLog;
import com.bankapp.service.AccountService;
import com.bankapp.service.CustomerService;

@SpringBootApplication
public class BankappFinalApplication implements CommandLineRunner{

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private TransactionLogDao transactionLogDao;
	
	@Autowired
	private CustomerService customerService;
	public static void main(String[] args) {
		SpringApplication.run(BankappFinalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Customer cust= new Customer("Pooja", "pooja123", "admin", "kwd", "kwd",
		 * "5678129", "p@s.com", LocalDate.of(1994, Month.NOVEMBER, 11)); Customer
		 * cust1= new Customer("Sravani", "sravani123", "mdpk", "tnk", "tnk",
		 * "985678129", "s@s.com", LocalDate.of(1996, Month.MAY, 21));
		 * 
		 * customerService.addCustomer(cust); customerService.addCustomer(cust1);
		 * 
		 * Account account1 = new Account("Pooja", 1000.00 , "saving", "mgbrothes col",
		 * "mudinepalli", "4522896463", "p@s.com", LocalDate.of(1994,Month.NOVEMBER,
		 * 11));
		 * 
		 * Account account2 = new Account("Sravani", 1000.00 , "saving",
		 * "gandhinagar col", "gudiwada", "4522896463", "s@s.com",
		 * LocalDate.of(1996,Month.JANUARY, 21));
		 * 
		 * accountService.save(account1); accountService.save(account2);
		 */
		
		//accountService.transfer(1, 2, 100);
		//accountService.deposit(1, 100);
		accountService.withdraw(2, 100);
		/*
		 * AddressChangeRequest addressChangeRequest = new
		 * AddressChangeRequest("ramalayam temple", "purushottapalli", "55654856",
		 * "pooja@s.com");
		 * 
		 * //accountService.changeAddress(1, addressChangeRequest);
		 * 
		 * List<TransactionLog> list = transactionLogDao.findByFromAccount(2);
		 * 
		 * for(TransactionLog log:list) System.out.println(log);
		 */
	}

}
