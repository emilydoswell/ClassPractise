package com.emily.model.service;

import com.emily.entity.Account;

public interface AccountService {
	
	public boolean loginCheck(Account account);
	
	public Account findByAccountId(int accountId);
	
//	boolean incrementBalance(int accountId, double increment);

}
