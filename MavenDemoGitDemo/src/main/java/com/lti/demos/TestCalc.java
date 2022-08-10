package com.lti.demos;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c= new Calculator();
		String msg= c.sayHello();

		System.out.println(msg);
		
		int s= c.addNos(4, 798);
		System.out.print(s);
		System.out.println("helllo");
		System.out.println("added a new line");
	}

}
