package com.beginnersbug.example.singleton;

public class SingletonExample {

	public static SingletonExample singletonExampleObject = null;

	public String stringVarible = "Singleton string";

	private SingletonExample() {

	}

	public static SingletonExample getSingletonInstance() {
		if (null == singletonExampleObject) {
			singletonExampleObject = new SingletonExample();
		}
		return singletonExampleObject;
	}

}
