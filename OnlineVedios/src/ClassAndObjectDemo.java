
class Cal {
	int num1;
	int num2;
	int result;

	public Cal() {
		super();
		this.num1=5;
		this.num2=5;
	}

	public Cal(double num1, int num2) {
		super();
		this.num1 = (int) num1;// this used for current instance variable or  current object variable 
		// when local varibale and instance varaible name we ned to use this and when we use multiple objects that time also we will use
		this.num2 = num2;
	}

	public Cal(int num1) {
		super();
		this.num1 = num1;
		this.num2=num1;
		
	}

	public void perform() {
		result = num1 + num2;
	}
}

public class ClassAndObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// building is object for this we jvm needs blue print(i.e class)..its give
		// structure of object
		// every object have 2 things i.e
		// knows something: structure of logo color of the logo,values by varaibale
		// does something: method ,behaviour by method
		// java is object oriented language
		Cal cal;// refrence
		cal = new Cal();// new used create an object with help of constructor
		/*
		 * cal.num1 = 3; cal.num2 = 4;
		 */
		cal.perform();
		cal=new Cal(5.6,7);
		
		System.out.println(cal.result);
		
	}
//for calling main method will used it should be static 
	// because with creating object we won't call main method and without main
	// method we can't create an object..because of this we are using static
	//new keyword used to create object in Heap memory ..it will consume the space..for hou much space it will consume it will give by constructor
	//1.constructer is member method ..2.same name as class name 3.it never return anything
	//4.constructor used to allocate memory to object
	//5. for intialization variables
	//it will be called by jvm after creation of object i.e automatically called..no need to called
	//default constructor, parameterized constructor.
	//when we are using more than one constructor its called as constructor overlaodinh;
	//we ant to create our object in multiple ways for that going to use constuct overloading
	//for avodimg code redudency in the construct overloading go for consturct chaining
	//construct chaining possible with call to super statement super();
}