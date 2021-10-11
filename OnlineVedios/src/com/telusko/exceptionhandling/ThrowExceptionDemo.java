package com.telusko.exceptionhandling;

public class ThrowExceptionDemo {

	public static void main(String[] args) {

		int i,j;
		i=8;
		j=05;
		try {
			int k=i/j;
			if(k==0)
				//throw new Exception();
			//if you want give your own exceptions then do as otherwise mention above
			throw new TeluskoException("This is not possible");
		}catch(TeluskoException e){
			System.out.println("sytem"+e.getMessage());
		}	
	}
}