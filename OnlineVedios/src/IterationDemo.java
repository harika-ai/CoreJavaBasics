
public class IterationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		if (n == 1) {
			System.out.println("Hello");
		}
		if (n == 2) {
			System.out.println("Hello");
			System.out.println("Hello");
		}
		if (n == 3) {
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}
		//if we want to print repatdetly or multiple times 
		//in above code redudency happens we repating code multuple times
		//if we want to execute 1000 times code redudency happens
		//so go for loop
		//while dowhile for loop,foreachloop(enhanced loop)
		int i=1;//intialization
		while(i<=5) {
			//condition
			System.out.println("Hello");
			i++;//updation increament or decrement
		}
		//do while
		//input taking user from user where condition check later 
		// first we need to perform task atleast once then check the condition
		int p=0;
		do {
			System.out.println("Hello");
			p++;
		}while(p<=5);
		//for loop we will write all three at on eline(intialization,condition,updation
		//when you know the starting and ending point then go for for loop
		for(int k=0;k<=5;k++) {
			System.out.println("Hello");
			
		}
		//for each loop we will use for arrays
	}

}
