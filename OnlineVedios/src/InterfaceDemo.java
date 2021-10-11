//
//same like abstract class
//you canot define methods we can only declare methods by defaults methods abstract public methods
//for abstract class we can define abstract methods and other methods
// interface we can do by using implements keyword
//multiple inheritance can possible by interface..we can implements more than one class at time
//Adv: By interface we canot create object of interface
//we can create reference of interface and assign class object value which is implements the interface
//to acheive serialization--converting data into byte code
//Every object will certainly die when jvm dies..but sometimes we awant reuse the object between sevral jvm's 
//we need to transfer an object another machine over the nwtwork --as byte stream storing it in file or disk
//ObjectOutputStream.writeObject()--for Serialized
//ObjectInputStream.readObject()--for For Deserialization
//declaring methods in interface anyone can acess the methods and knows what are the operations are going on in the project
//types of interfaces
// 1.Normal
//2.Single abstract method---Functional Interface--Lambda Expression--scala
//3.Marker interface// 
// functinal Interfaces//which doesnot have methods ex:serializable --

public interface InterfaceDemo {
	void show();
}

class Interfaceg implements InterfaceDemo {

	@Override
	public void show() {
		System.out.println("show");
	}
}

class Sample {
	public static void main(String[] args) {
		InterfaceDemo demo = new Interfaceg();
		demo.show();
	}
}