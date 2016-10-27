package com.mms.fib;

public class Fibo4 {

	/**
	 * @param args
	 */
	int n;
	static int fib(int n)
    {
    if (n <= 1)
       return n;
   
    return(fib(n-1) + fib(n-2));
    
	
    }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		
	    
	}

}
