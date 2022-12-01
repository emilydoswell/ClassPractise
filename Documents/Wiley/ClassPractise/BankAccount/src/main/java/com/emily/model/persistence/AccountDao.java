package com.emily.model.persistence;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emily.entity.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, String> {
	
	public Account findByAccountId(int accountId);
	
	// DML so we must use @Modifying and @Transactional
//	@Modifying
//	@Transactional
//	@Query("update BankAccount set bankBalance=bankBalance+:inc where accountId=:id")
//	double updateBalance(@Param("accountId") int accountId, @Param("inc") double increment);
//	// These @Params will be taken from the HTML form when the user inputs the id and increment amount
}
