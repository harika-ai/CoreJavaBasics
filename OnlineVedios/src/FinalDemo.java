//no one can overide for final method,inheritance is possible with final method
//no one extend for final class-->inheriting the class from its self not possible
//but final classs can inherits the properties of super class which is not final
//final varibale represents constant value..we cannot reinitailize the variale
//static variable is not constant variable and it's having single copy
class ASD {
	final int i;// used to as constant value we cannot change further

	public ASD(int i2) {
		this.i = i2;
		int i = 10;
	}
}

class RT {
	int i = 0;
	final int k = 9;

	public RT() {
		i = 19;
		// k=8;
	}
}

final class FinalClass {

}

/*
 * class finalSubClass extends FinalClass{ we canot override final class--get
 * the compiletime error }
 */

class FinalMethod {
	public final void show() {
		System.out.println("show");
	}
}

class FinalSubClass extends FinalMethod {
	
	/*
	 * public void show() { System.out.println(); } compiletime error
	 * 
	 * // we cannot override method
	 */	 
}

public class FinalDemo {

	public static void main(String[] args) {
		ASD obj = new ASD(12);
		System.out.println(obj.i);
		RT a = new RT();
		System.out.println(a.i);
		System.out.println(a.k);
		FinalMethod finalMethod = new FinalMethod();
		finalMethod.show();

	}
}
