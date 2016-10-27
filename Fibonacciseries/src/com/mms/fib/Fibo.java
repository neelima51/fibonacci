package com.mms.fib;

public class Fibo {
   
	public int x;
	 Fibo(int x)
	{
		  int x1=0,x2=1,i,x3;
		  System.out.print(x1+" "+x2);
		
		
		 for(i=2;i<x;i++)
		 { 
			x3=x1+x2;
			System.out.print(" "+x3);
			x1=x2;
			x2=x3;
		 }
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibo o=new Fibo(5);
		System.out.println();
		Fibo o1=new Fibo(10);
	
        
	}

}
