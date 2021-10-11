
@FunctionalInterface // it won't allow more than one abstract method
interface Esd {
	void show();

}

public class InterfaceClassDemo {

	public static void main(String[] args) {
		Esd obj = new Esd() {
			@Override
			public void show() {
				System.out.println("I am the best");
			}
		};
		Esd obj1 = () -> System.out.println("hjk");// same like above but its java 8 feature
		obj.show();
		obj1.show();
		Demo obj2 = () -> System.out.println("hgdfh");
		// for overriding default methods we needs to call methods as below
		Demo obj3 = new Demo() {

			@Override
			public void abc() {
				System.out.println("Example");
			}

			public void show() {
				System.out.println("I am");
			}
		};
		obj2.show();
		obj2.abc();
		obj3.show();
		obj3.abc();
		// Multiple inheritance issue in interface with default methods
		Fyuik fy = new Fyuik();
		fy.abc();
		fy.show();
		Derfg derfg=new Derfg();
		derfg.show();
		
	}
}

//Default method
// in abstract class---> we can define and declare methods but till 1.7 java
//but in 1.8 java we can define and declare methods in java 8 // by using default keyword
//defult methods won't effect the implement class ..so we can add the required feature at any time 
// then why we need abstract class then interface..we will dicuss later
@FunctionalInterface // we can implements more than one method which is not abstract i.e only default methods
//it will allows only non-static abstract methods..not static methods--1.7
//it allows default and static methods--1.8 and private methods for 1.9 java
interface Demo {
	void abc();

	default void show() {
		System.out.println("klj");
	}
}
// remove ambigmultiple inheritance --by public keyword in place of default methods--and its resolved by method overriding
class Fyuik implements Esd, Demo {

	@Override
	public void abc() {
		System.out.println("njk");
	}

	@Override
	public void show() {
		System.out.println("qwe");
	}

}
// another way of multiple inheritance'
class Derfg implements Esd, Demo{

	/*
	 * @Override public void abc() {
	 * 
	 * }
	 */
	
}

	@Override
	public void show() {
		//here the method name should be same in both interfaces
		//so for invoking the or overiding the method by using default methods(we canot override abstract methods) by using below statement
		Demo.super.show();// we only invoke the defualt methods not abstract methods.
		//Esd.super.defaultmethodname();
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}	
}

