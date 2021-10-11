class Casio {
	//constructor overloading..at at time using more than one constuctor as default with parameterized cpnstructor
	//method overloading same method name and different parameter we need to pass
	//Runtime polymerphisam
	public void add(int i) {
		System.out.println(i);
	}

	public void add(int i, int j) {
		System.out.println(i + j);
	}

	public void add(double i, int j, int k) {
		System.out.println(i + j + k);
	}
}

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio casio=new Casio();
		casio.add(2);
		casio.add(2, 3);
		casio.add(2.5,3,9);
	}

}
