package com.telusko.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//BufferReader
//Scanner
public class UserInput {

	public static void main(String[] args) {

		System.out.println("Enter a member");
		BufferedReader br =null;
				try{
					br=	new BufferedReader(new InputStreamReader(System.in));
					int n = Integer.parseInt(br.readLine());//compilation exception --checked exception

				}catch(Exception e){
					System.out.println("jk");

				}
				finally {
					//br.close();//if we use it in try because of exception it won't execute.
					//if exception not there it won't come to catch
					//need to repeat in both 
					//for that using finally block
				}
	}

}
