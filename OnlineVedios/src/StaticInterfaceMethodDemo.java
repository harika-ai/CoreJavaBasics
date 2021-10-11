interface Lsdef {

	int num = 8;// which is act as final variable which is created inside interface

	static void abc() {
		System.out.println("kk");
	}
	void c();
	void d();

}
interface Lsd {

	int num = 8;// which is act as final and static variable which is created inside interface

	static void abc() {
		System.out.println("kkh");
	}

}
class Gh implements Lsdef,Lsd{
	void abc() {
		System.out.println("dfjgf");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}
}

public class StaticInterfaceMethodDemo {

	public static void main(String[] args) {

		Lsdef.abc();
		Gh gh=new Gh();
		gh.abc();
	}
}
