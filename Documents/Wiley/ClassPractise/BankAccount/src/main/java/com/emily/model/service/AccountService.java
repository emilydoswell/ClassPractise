package com.emily.model.service;

import com.emily.entity.Account;

public interface AccountService {
	
	public boolean loginCheck(Account account);
	
	boolean incrementBalance(int accountId, double increment);

}
