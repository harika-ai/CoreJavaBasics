//overriding the subclass method by super class method with same method name at runtime 
//by assigning the super class refrence to the subclass object
//@override annottaion is used to indicates method names from super class should be same as subclass.
//if we not give same then its give compilation error
class F {// super class
	public void show() {
		System.out.println("in A");
	}
}

class C extends F {// subclass
	@Override
	public void show() {
		super.show();
		System.out.println("in B");
	}

	public void confitc() {
		System.out.println("conftic");
	}
}

class E extends F {
	@Override
	public void show() {
		super.show();
		System.out.println("in E");
	}
}
//runtime and compiletime polymorphisam
public class MethodOverridingDemo {

	public static void main(String[] args) {

		C b = new C();
		b.show();
		F b1 = new C();// we are assigining object at runtime linking object done at runtime so called as runtime polymorphisam
		b1.show();
		// b1.confitc(); cannot acess this method , becuase the confitc function name
		// not there in F class
		// we can access methods which are same as super class.
		b1 = new E();//assiging different object dynamic dispatch method
		b1.show();

	}
}
