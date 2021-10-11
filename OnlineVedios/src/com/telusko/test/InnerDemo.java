package com.telusko.test;

import com.packagjava.jk.AceessModifiers;

public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AceessModifiers publicModifer=new AceessModifiers();
		publicModifer.sRollN0=9;
		//publicModifer.sName--private so we cannot acess it
		//publicModifer.sPercentage//cannot acess prottected members without child class
		//publicModifer.sMarks--canot acess default methods,varibales,classes outside the package
	}

}
