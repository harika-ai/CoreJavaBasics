package com.telusko.exceptionhandling;

//RuntimeException--unchecked exception
//CompiletimeException--checked exception
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// exception occurs then directly jumps from try to catch block
			// it won't execute try statements
			int k = 7;
			int j = 2;
			int i = 9 / 0;
			System.out.println("output is" + k / j);
		} catch (Exception e) {
			//it's having all exception classes
			//below Exception class cannot declare another catch blocks with Arithemetic exceptions..etc
			System.out.println("Error");
		}
		System.out.println("Bye");

		try {
			// exception occurs then directly jumps from try to catch block
			// it won't execute try statements
            int a[]=new int[6];
            a[6]=89;//ArrayIndexoutofBoundException
			int k = 7;
			int j = 2;
			int i = 9 / 0;
			System.out.println("output is" + k / j);
			System.out.println("bye");
		} catch (ArithmeticException e) {// its is a subclass of RuntimeException
			System.out.println("Error");
			System.out.println("bye");
		}catch (ArrayIndexOutOfBoundsException e) {// its is a subclass of RuntimeException
			System.out.println("Error");
			System.out.println("bye");
			//for handling multiple catch with mutiple exception follow below to avoid code redudency and 
			//it will come to one catch block it wont't anothr catch block 
		} finally {
			System.out.println("bye");// finally block is used to execute the statements even though the execution
										// fails in try-
			// for above we can repat code in catch block but code rededundency happens
			// in above bye statements for removing code redudency using finally block
		}
		System.out.println("Bye");
		
		try {
			// exception occurs then directly jumps from try to catch block
			// it won't execute try statements
			int k = 7;
			int j = 2;
			int i = 9 / 0;
			System.out.println("output is" + k / j);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
		}
	}

}
