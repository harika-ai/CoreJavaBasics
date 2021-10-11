class Anny {
	public void show() {
		System.out.println("A in show");
	}
}
// it wion't use unwanted memory =r3
public class AnnonymousClassExample {

	public static void main(String[] args) {

		Anny obj = new Anny() {
			public void show() {// it is the class which doesnot have name by specfying object and implements the class
				System.out.println("I am the best");
			}
		};
		obj.show();
		Abc abc = new Abc() {
			@Override
			public void display() {
				System.out.println("opu");
			}
		};
		abc.display();
	}
}

interface Abc {
	void display();
}

/*
 * class Implementor implements Abc {
 * 
 * @Override public void display() { System.out.println("hjk"); } }
 */