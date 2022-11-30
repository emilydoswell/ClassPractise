package com.emily.model.service;

import org.springframework.stereotype.Service;

@Service
public class MirroredService {
	
	public int reverseNumber(int userNumber) {	
		int reverse = 0;
		
		while(userNumber != 0) {
			reverse = reverse*10 + userNumber%10;
			userNumber = userNumber/10;
		}
		
		return reverse;
	}
	
	public boolean checkReverse(int userNumber) {
		int rev = reverseNumber(userNumber);
		
		if (rev == userNumber) 
			return true;
		else	
			return false;
		
	}
}

