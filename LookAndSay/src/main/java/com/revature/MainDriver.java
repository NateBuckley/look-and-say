package com.revature;

import java.math.BigInteger;

public class MainDriver {

	public static void main(String[] args) {
		System.out.println(lookAndSay(BigInteger.valueOf(Long.parseLong("1213200012171979"))));
		System.out.println(lookAndSay(BigInteger.valueOf(54544666)));
		System.out.println(lookAndSay(BigInteger.valueOf(95)));
		System.out.println(lookAndSay(BigInteger.valueOf(Long.parseLong("1213141516171819"))));
		System.out.println(lookAndSay(BigInteger.valueOf(120520)));
		System.out.println(lookAndSay(BigInteger.valueOf(231)));

	}
	
	private static BigInteger lookAndSay(BigInteger number) {
		String numberString = number.toString();
	    StringBuilder newNum = new StringBuilder();
	    if(numberString.length() % 2 == 1){
	    	return BigInteger.valueOf(-1);
	    }
	    for(int i = 0; i < numberString.length() - 1; i += 2){
	    	for(int j = Integer.parseInt(Character.toString(numberString.charAt(i))); j > 0; j--){
	    		newNum.append(Character.toString(numberString.charAt(i + 1)));
	        }
	    }
	    
	    return new BigInteger(newNum.toString());
	}

}
