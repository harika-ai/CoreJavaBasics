package com.telusko.test;

//collection is collection of objects..
//vectors used before 1.2 java
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

//collection which is the topic
//Collection is the interface
//Collections is the class
//Collection(interface)-extends-List(Interface)-implements-ArrayList(Class)
//interface--interface by using extend keyword
//class implements interface using implements keyword

//int a[]=new int[size]
//Collection values=new ArrayList();
//adding values --values.add(0);
//Adv:no need to mention size of array..we can expand and strick the array
//in above array we have int type .But in Collection we can add any date type values
//for specific data type--Use the Generics
//Collection<Integer> values=new ArrayList<Integer>();

//()---used this for methods functions
//{}--we can use this for functions
//[]--use this for array
//1.2 collection API
//1.5--Generics

//Collection<Integer> values=new ArrayList<>();//its support above 1.7 java version
//List<Integer> values=new ArrayList<>();//BY using List interface we can mention index also it's having more features

//Set<Integer> numbers=new HashSet<>();//Every Element in the set should be unique ..its not dublicate 
//Hash set  --all the elements should not be sorted//while fetching and inserting values--random order elements to be sorted
//Treeset--we can fetch the values by sorted format
//Set<Integer> numbers=new TreeSet<>();

//Map:Key value relation--any value can be have key
//Every value should have key ..key can be number or object anything
//Map is the interface we can use Hash map(synchronization) or HashTable one is Synchronized ,another is Asynchronized
//Hashtable--synchronization--one thread one process
//Aynchronization--multiple threads at a time--HashMap
//Map<k,v>  m=new HashMap<>();//for Asynchronization
//for synchronization go for Hashatble
//Map<String,Integer> maps=new HashTable<>();
//we can convert collection values to array values
//collectionobject.add() method will returns boolean value 
//if object not added then returns false value
//we can use addall() and removeall() methods

//collection doesnot support index numbers
//we use Iterator its an interface its an interface we can fetch all values from collection into interface

public class CollectionsDemo

{

	public static void main(String[] args) {

		Collection values = new ArrayList();
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2);// here the location of object is unorderded so going for List which is
						// interface imple
		System.out.println(values);
		Iterator it = values.iterator();
		/*
		 * System.out.println(it.next()); System.out.println(it.next());
		 * System.out.println(it.next()); System.out.println(it.next());
		 */
		// in above we get exception no such elemnt exception above array size is 3 but
		// here it getting error
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		List listvalues = new ArrayList();
		listvalues.add(4);// value 4 is notnumber object of Integer v=new Integer(4)---
		listvalues.add(5);
		listvalues.add(9);
		listvalues.add(2, 22);// we can type of date
		listvalues.add("hjk");
		/*
		 * for (int i = 0; i <= listvalues.size(); i++) {
		 * System.out.println(listvalues.get(i)); }
		 *///using this we get index out of bound exception 
		// enhanced for loop type of data using as object
		for (Object o : values) {
			System.out.println(o);
		}
		// for specfic type of datatypes in collections as below--use generics

		List<Integer> value = new ArrayList<>();
		value.add(4);
		value.add(6);
		value.add(8);
		for (Integer o : value) {
			System.out.println(o);
		}

	}
}
