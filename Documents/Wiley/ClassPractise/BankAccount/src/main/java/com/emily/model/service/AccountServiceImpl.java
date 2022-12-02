package com.emily.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emily.entity.Account;
import com.emily.model.persistence.AccountDao;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao dao;
	
	// This is checking with the Dao that we have a user with this ID.
	@Override
	public boolean loginCheck(Account account) {
		Account newAccount = dao.findByAccountIdAndUserPassword(account.getAccountId(), account.getUserPassword());
		
		if (newAccount != null)
			return true;
		
		return false;
	}

	@Override
	public Account findByAccountId(int accountId) {
		Account newAccount = dao.findByAccountId(accountId);
		
		if (newAccount != null) {
			return newAccount;
		}
		
		return null;
	}

//	@Override
//	public boolean incrementBalance(int accountId, double increment) {
//		Account newAccount = dao.findByAccountId(accountId);
//		
//		if (dao.updateBalance(accountId, increment) > 0) {
//			return true;
//		}
//		
//		return false;
//	}

}
