package com.sierra.handson4;

public class HandsOn {

	public static void main(String[] args) {
		
		int doubld = 2;
		// enter double method
		int sum = doubleMe(doubld);
		
		System.out.println(sum); 
		
		// enter quad method
		int quad = quadrupleMe
		(doubld);
	
		System.out.println(quad); 
		
		// enter Times method
		int count = doubleMeTimes (doubld, quad);
		System.out.println(count);

	}

   
 static int doubleMe(int val)
{
	
	val = val*2;
	return val;
}
static int quadrupleMe(int val) 
{	
	val = val*4;
    return val;
}

static int doubleMeTimes(int val, int count) 
{
	//val = val*2;
	count *= doubleMe(val);
	return count;
}
}