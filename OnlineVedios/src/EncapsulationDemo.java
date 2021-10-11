//Binding the data with help of methods know an encapsulation
//while creating a feature in an application only authorized person having rights to add features by using private keywors
//for modifing and acessing that feature values done by encapulsation//by getters and setter methid
class Student1 {
	private int sRollNo;
	private String sName;

	// Getters and Setters methods should be public
	public void setSRollNo(int r) {
		sRollNo = r;
	}

	public int getSRollNo() {
		return sRollNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
}
//your data needs to saved ..private variables only authorized persons able to acess
//by using encapuslation we can acess and set the data from any class 
public class EncapsulationDemo {

	public static void main(String[] args) {
		Student1 student = new Student1();
		student.setSRollNo(1);
		System.out.println(student.getSRollNo());
	}
}
