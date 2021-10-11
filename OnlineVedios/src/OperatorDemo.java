
public class OperatorDemo {

	/*
	 * Arithemetic +,- *, /,% Bitwise Relational logical
	 * 
	 */

	public static void main(String[] args) {

		int m = 5, n = 9;
		int r1 = m + n;
		int r2 = m - n;
		double r3 = m / n;
		int r4 = m * n;
		int r5 = m % n;

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);

		// ++n; pre increment
		// n++; post incrememnt

		m = ++n;
		System.out.println(m);
		n = m++;
		System.out.println(n);
		System.out.println(m);
		m = --n + ++m - ++n;
		System.out.println(m);
		System.out.println(n);

		// selection statements
		// if else,switch
		int a = 9;
		// even or odd
		if (a == 0)
			System.out.println("nothing");
		if (a % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
//if more then aone statement then we need use{ }
		if (a == 0) {
			System.out.println("nothing");
			System.out.println("nothing");
		}
		if (a % 2 == 0) {
			System.out.println("even");
			System.out.println("even");
		} else {
			System.out.println("odd");
			System.out.println("odd");
		}
//ternary operator
//?:condition?expr1:expr2
		int i = 8, j = 0;
		if (i > 6)
			j = 1;
		else
			j = 2;
		j = i > 6 ? 1 : 2;
		System.out.println(j);
		System.out.println(i);
		// switch operator
		int p = 2;
		
		switch (p) {
		case 1:
			System.out.println("one");
			break;
			//without break it will execute all below sysout where the condition is satisfy
			//so using break statement here
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		default:
			System.out.println("No match");
		}
		//we can usenstring in switch in 1.8 above versions of java		
		String s="str";
		switch (s) {
		case "klj":
			System.out.println("one");
			break;
		case "klo":
			System.out.println("two");
			break;
		case "str":
			System.out.println("three");
			break;
		case "klf":
			System.out.println("four");
			break;
		default:
			System.out.println("No match");
		}

	}

}
