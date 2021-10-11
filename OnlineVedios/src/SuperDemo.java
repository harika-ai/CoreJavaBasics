class A{
	public A() {
		System.out.println(" in A");
	}
	public A(int i) {
		System.out.println(" in A int");
	}
	
}
class B extends A{
	public B() {
		super();//by default given by compiler
		System.out.println("in  B");
	}
	public B(int i) {
		super(i);// if want call parameterized constructor
		//super(); by defaulty it will call default constructor
		System.out.println(" in B int");
	}
	
}
public class SuperDemo {

	public static void main(String[] args) {
     B obj1=new B(5);
     B obj2=new B();
 
	}

}
