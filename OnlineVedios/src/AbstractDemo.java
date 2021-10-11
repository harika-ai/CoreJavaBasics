//whenever obstract in your method then class needs to abstract..so we can defined class as abstract by defining abstract keyword
//when class as obstract we unable to create object in main class
//because there is no method implemention--no method call..no method execution--n0 need object creation
//so for static members also--inside class if all members are static keep it as abstract
//for super class also we need to keep it as abstract because in real word super class object creation won't consider.
// for abstract method overriding and inheritance  is compulsory
//method overriding is used to change the any of the action task from the superclass to subclass we go fo this at runtime without effecting subclass\
//method overiding --for maintance difficulty and maintance easy
//for method overiding method signature should be same as super class method
//method overiding possible with inheritance by using extend keyword while inheriting properties from super class

abstract class Human {
	public abstract void walk();
	public void eat() {
		
	}
}

class Men extends Human {

	@Override//by using this anotation
	public void walk() {
		System.out.println("Men walk");
	}

}
class Provider{
	public void show(Number n) {//
		//number is super abstract class of Integer float double so we can easily access the values
		System.out.println(n);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
 
		Human obj=new Men();
		Provider provider=new Provider();
		provider.show(5.5);
		obj.walk();
	}
}
