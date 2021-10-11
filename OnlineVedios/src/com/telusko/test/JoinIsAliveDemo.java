package com.telusko.test;

//join is used to tell the main method  execution wait for sometime you needs to join after some time
// in below after execution of t1, t2 it will go to the execution of remaining part in the java
public class JoinIsAliveDemo {

	public static void main(String[] args) throws InterruptedException {
		Runnable obj1 = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		};

		Runnable obj2 = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		System.out.println(t1.isAlive());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		System.out.println(t2.isAlive());
		t1.join();
		t2.join();
		System.out.println(t2.isAlive());//is Alive method is used to check the main method
		System.out.println(t1.isAlive());//is Alive method is used to check the main method

		
		System.out.println("after t1 and t2 execution it will execute the join statements");
	}
}
