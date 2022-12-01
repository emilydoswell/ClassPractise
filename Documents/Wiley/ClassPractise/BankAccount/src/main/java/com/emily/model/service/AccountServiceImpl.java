package com.emily.model.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.emily.entity.Account;
import com.emily.model.persistence.AccountDao;

public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao dao;
	
	// This is checking with the Dao that we have a user with this ID.
	@Override
	public boolean loginCheck(Account account) {
		Account newAccount = dao.findByAccountId(account.getAccountId());
		
		if (newAccount != null)
			return true;
		
		return false;
	}

	@Override
	public boolean incrementBalance(int accountId, double increment) {
		Account newAccount = dao.findByAccountId(accountId);
		
		if (dao.updateBalance(accountId, increment) > 0) {
			return true;
		}
		
		return false;
	}

}
