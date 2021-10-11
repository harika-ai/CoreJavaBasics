// int , float, double

public class WrapperDemo {

	public static void main(String[] args) {

		int i=5;
		Integer ii=new Integer(i);//Boxing-wrapping--putting premetive inside the object
		int j=ii.intValue();//unboxing-unwrapping--taking premitive value out from object
		Integer value=i;//AutoBoxing
		int k=value;//Autounboxing
		// we will assign string value in in int variable by using parsInt
	}
}
