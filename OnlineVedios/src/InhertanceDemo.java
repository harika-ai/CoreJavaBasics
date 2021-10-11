//Is-A relation Hs-A ralation
//inheritance parents to child relation
//we can inherit only the non-static members not the static memebrs
//because we have multiple copies of non-static members and single copy of static member which is used by super class it self
class Caluc {// super class
	public int add(int i, int j) {
		return i + j;
	}
}

class Caluculator {
	public int add(int i, int j) {
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}
}

//but in above code redeuncy will happens then go for inheritance using extend keyword
class CalAdv extends Caluc {// sub class single leval inheritance
	public int sub(int i, int j) {
		return i - j;
	}
}

class CalVeryAdv extends CalAdv {// multi leval inheritance
	public int mul(int a, int b) {
		return a * b;
	}
}
// multiple inheritance it won't possible.
public class InhertanceDemo {// base class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caluc obj1 = new Caluc();
		int result = obj1.add(5, 4);
		System.out.println(result);
		Caluculator obj2 = new Caluculator();
		System.out.println(obj2.add(7, 8));
		System.out.println(obj2.sub(9, 3));
		CalAdv calAdv = new CalAdv();// single leval inheritance
		System.out.println(calAdv.add(8, 9));
		System.out.println(calAdv.sub(8, 2));
		CalVeryAdv calVeryAdv = new CalVeryAdv();
		System.out.println(calVeryAdv.add(3, 4));
		System.out.println(calVeryAdv.sub(8, 4));
		System.out.println(calVeryAdv.mul(9, 3));

	}
}
