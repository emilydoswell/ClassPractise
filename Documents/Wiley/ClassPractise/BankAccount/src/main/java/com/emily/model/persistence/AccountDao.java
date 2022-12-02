package com.emily.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emily.entity.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, String> {
	
	public Account findByAccountIdAndUserPassword(int accountId, String password);
	
	public Account findByAccountId(int accountId);
	
	// DML so we must use @Modifying and @Transactional
	@Modifying
	@Transactional
	@Query("update BankAccount set bankBalance=bankBalance+:inc where accountId=:id")
	double updateBalance(@Param("accountId") int accountId, @Param("inc") double increment);
//	// These @Params are taken from the @Query above
}
