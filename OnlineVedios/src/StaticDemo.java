class Emp {
	int eId;
	String eName;
	static String eCEO;
	static {// when class load by class loader it will load all static members  having single copy
		//because each class jvm call classloader at once ..so static member control is under classloader..it loads at once
		//so it is having single copy
		eCEO = "Mahesh";
	}

	public Emp(int eId, String eName) {// it loads when creates an object no.of times loads=no.of ojects
		this.eId = eId;
		this.eName = eName;
	}

	public void show() {
		System.out.println(eId + ":" + eName + ":" + eCEO);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		Emp rahul = new Emp(1, "rahul");
		Emp sachin = new Emp(2, "sachin");
		rahul.show();
		sachin.show();

	}
	//we can acess only static memebers inside static method we cannot access non static
	//we can acess non static members by creating an object
	//non static member we can acess by creation of object
	//its under controller of developer based on devloper needs creates objects
}
