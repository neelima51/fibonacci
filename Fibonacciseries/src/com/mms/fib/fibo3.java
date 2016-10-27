package com.mms.fib;

public class fibo3 {

	/**
	 * @param args
	 */

	static int x1=0;
	static int x2=1;
	int count;
	
	public  void disp1()
	{
		
		System.out.print(x1+" "+x2);
	}
	public void disp1(int count)
	{ 
		
       if(count>0)
       {
		
    	   int x3=0;
			x3=x1+x2;
			System.out.print(" "+x3);
			x1=x2;
			x2=x3;
		disp1(count-1);
       }
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=0;
		int x2=1;
		fibo3 o=new fibo3();
		o.disp1();
		o.count=9;
		o.disp1(o.count-2);
		System.out.println();
		
		fibo3 o1=new fibo3();
		o1.disp1();
		o1.count=7;
		o1.disp1(o1.count-2);    

	}

}
