//introduction
// int a=1;int c=1; int b=3;
//But for 1000 varibales its difficult r8  examples tea cups with trey and without trey
//Array is collection of elements
//Array having unique number i.e index number we can access array values by using index values
//two dimensional array or 3 dim --etc dimen indicates by row and column number
//Jagged array different size of the columns
class Student{
	int srollno;
	String sName;
}
public class ArraysDemo {

	public static void main(String[] args) {
		int num[] = new int[4];// size of array we need to mention
		// inside heap memory with index values as 0,1,2,3---0 0 0 0
		num[0] = 8;
		num[1] = 12;
		num[3] = 54;
		num[2] = 76;
		num[1] = 87;
		// System.out.println(num[4]);//Array index out of bound exeception
		// for code redudency going for below
		for (int i = 0; i <= 3; i++) {
			System.out.println(num[i]);
		}
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();		
		
		Student s[]= {s1,s2,s3,s4};//array of student objects
		int a[]= {1,2,3,4};
		int b[]= {2,4,6,8};
		int c[]= {5,6,7,8};
		int d[][]= {
				{1,2,3,4},
				{2,4,6,8},
				{5,6,7,8},
				{4,9}
		};
		System.out.println(d.length);
		
		//printing array elements when no.of elements not fixed or fixed
		for(int i=0;i<d.length;i++) {
			//System.out.println(d[i].length);
			for(int j=0;j<d[i].length;j++) {
				//System.out.print(d[j].length);
				System.out.print(""+d[i][j]);
			}
			System.out.println();
			
		}
		int p[]= {8,9,6,4};
		//enhanced for loop or for each loop
		for(int k:a) {
			System.out.print(k);
		}
		System.out.println();
		for(int k[]:d) {
			for(int l:k) {
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
