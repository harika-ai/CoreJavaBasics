
public class JumpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break , continue
		
		for (int i=1;i<=10;i++) {
			if(i==7) {
				continue;//it will continue the remaining execution except this step
			}
			System.out.println("The value of i is:"+i);
		}
		for (int i=1;i<=10;i++) {
			if(i==7) {
				break;//it will break the execution it will comes out from for loop
			}
			System.out.println("The value of i is:"+i);
		}
	}
}
