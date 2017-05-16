package com.revature.designpatterns;

public class SingletonExample {
	//Bar any access to our one instance
	private static SingletonExample se;
	
	//Bars ability for an outside class to invoke "new" on our singleton
	private SingletonExample(){
		
	}
	//provide a means to get the instance
	public static SingletonExample getSingleton(){
		if(se==null){
			se = new SingletonExample();
		}
		return se;
	}
}
