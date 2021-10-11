package com.telusko.test;
//Thread is process ..It is a unit of process

//in our java we use only one Thread
//main is thread in every java application
//ex:in processor --we have four cores --if we have 4 threads it will take less time compare to one thread 
//Adv:less time complexity
//foe Asyn the Application as below
//Amezon--Thread1(request go to server)--thread2..response to mobile--get the same time
//we can acess web applications
//clients-----Thread-servlets--server--webapp
//How to acheive the Thread application:
//Thread t1=new Thread();
//t1.start();is used to create thread then it will start by run() method
//t1.run();
//t1.wait();
//t1.sleep();static method
//t1.notify()
//thread will stop automatically
class Hi extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		Thread.sleep(500);
		obj1.start();// internally call run method
		Thread.sleep(500);//without sleep methods both objs creates threads at a time,so by using this creating objs one after another.
		obj2.start();
	}
}

class A {

}

class HJk extends A implements Runnable {

	int[] values = { 6, 5, 1, 7, 8 };

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			values[i] = values[i] * 2;
		}
	}

}
