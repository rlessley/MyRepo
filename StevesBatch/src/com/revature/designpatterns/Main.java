package com.revature.designpatterns;

public class Main {

	public static void main(String[] args) {
		SingletonExample se = SingletonExample.getSingleton();
		System.out.println(System.identityHashCode(se));
		SingletonExample se2 = SingletonExample.getSingleton();
		System.out.println(System.identityHashCode(se2));
		
		
		ShapeFactory sf = new ShapeFactory();
		sf.retrieveShape("CiRcLe").draw();
		sf.retrieveShape("TrIaNgLe").draw();
		sf.retrieveShape("SqUaRe").draw();

	}

}
