
public class NestedLoop {

	public static void main(String[] args) { /* 
												****
												****
												****
												****
												*/
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * 
		 * 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5 1 2 3 4 5 6
		 */
		int num = 1;
		for (int p = 1; p <= 6; p++) {
			for (int q = 1; q <= p; q++) {
				System.out.print(q);
				System.out.print(' ');
			}
			System.out.println();
		}
		/*
		 * A 
		 * A B
		 * A B C
		 * 
		 * $ $ $ $ $
		 * $       $
		 * $       $
		 * $ $ $ $ $
		 */
		//ASCII values are 
		//a--z...97 to 122
		//A--Z ---65 to 90
		for(int i=65;i<=67;i++) {
			for(int j=65;j<=i;j++) {
				char c=(char) j;
				System.out.print(c);
				System.out.print(' ');
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				if(((i==2 && j==2)||(i==2 && j==3)||(i==2 && j==4)||(i==3 && j==2)||(i==3 && j==3) ||(i==3 && j==4))) {
					System.out.print(' ');
				}else {
				System.out.print('$');
				}
			}
			System.out.println();
		}
	}
}
