package com.mms.fib;
public class fibo1 {

	static int x;
	static int x1=0,x2=1,i,x3;

	static void fibos(int x)
	{
		if (x>0)
		 { 
		 x3=0;
			x3=x1+x2;
			System.out.print(" "+x3);
			x1=x2;
			x2=x3;
			fibos(x-1);
		 }
		
			
		 }
		
	public static void main(String[] args) {
		
		System.out.print(x1+" "+x2);
		x=7;
		fibos(x-2);
		
		
		
	}
		

}



