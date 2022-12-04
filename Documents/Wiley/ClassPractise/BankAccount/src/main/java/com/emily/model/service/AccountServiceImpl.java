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
		try {
			Account newAccount = dao.findByAccountIdAndUserPassword(account.getAccountId(), account.getUserPassword());
			
			if (newAccount != null)
				return true;
			
		} catch(Exception e) {
			return false;
		}
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

	@Override
	public boolean incrementBalance(int accountId, double increment) {
		// This is the account that we're changing (not our own account)
		Account transferAccount = dao.findByAccountId(accountId);
			
		if (transferAccount != null) {
			double currentBalance = transferAccount.getBankBalance();
			dao.updateBalance(accountId, (currentBalance + increment));
			return true;
		} else {
			return false;
		}
	}

}
