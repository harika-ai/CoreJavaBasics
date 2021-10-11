class Calc {
	public int add(int i, int j) {
		return i + j;
	}

	public int add1(int... n) {
		//variable length arguments
		int sum = 0;
		for (int k : n) {
			sum = sum + k;
		}
		return sum;
	}
}

public class VaragsDemo {

	public static void main(String[] args) {

		Calc obj = new Calc();
		System.out.println(obj.add(7, 8));
		System.out.println(obj.add1(3,4,5,6,7));
	}

}
