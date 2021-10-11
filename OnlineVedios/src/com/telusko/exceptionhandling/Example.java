package com.telusko.exceptionhandling;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in); int i = scan.nextInt();
		 */
        
		/*
		 * // Double d=scan.nextDouble(); scan.nextLine(); String s=scan.nextLine();
		 * scan.close();
		 * 
		 * System.out.println("String: " + s); System.out.println("Double: " + d);
		 * System.out.println("Int: " + i);
		 */
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String integer = null;
            StringBuffer sbSpace = new StringBuffer();
            int spaces=0;
            if(s1.length() <= 10 && x<=999)
            {
              spaces=15-s1.length();
             if(x<=99){
               integer= "00"+x;  
             }else if(x<=9){
                  integer="0"+x;
             }else{
                  integer=String.valueOf(x);
             } 
            }
            for (int j = 0; j <= spaces; j++) {
                sbSpace.append(" ");
             }
            System.out.println(s1+sbSpace+integer);
        }
       
        System.out.println("================================");

	}

}
