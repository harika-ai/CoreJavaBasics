/*
 * Inner classes
 * member class
 * static class
 * Annonymous class
 * 
 * */
class Outer {
	 int a = 8;// member variable//non static variable--scope with in the class and out side the class--acess by using object name
	static int b = 8;// member variable//static varibale--scope same--acess by calssname-single copy--we can reinitialize value its not constant
	//known as class varibale..if anything chnages in the static members whole class will effect

	public void method() {
		System.out.println("memeber method" + a);
	}
	public static void method1() {
		System.out.println("memeber method" + b);

	}

	class Inner {// member class or inner class is used to only purpose of outer class not for other classes Outer$Inner.class

		public void display() {
			System.out.println("In display");
		}
	}

	static class InnerStatic {// static inner class
		public void display1() {
			System.out.println("static display");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.method();
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
		Outer.InnerStatic obj2 = new Outer.InnerStatic();
		obj2.display1();
		obj.method1();
	}
}
