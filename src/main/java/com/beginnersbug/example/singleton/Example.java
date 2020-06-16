package com.beginnersbug.example.singleton;

public class Example {

	public static void main(String[] args) {
		try {
			SingletonExample singletonObject = SingletonExample.getSingletonInstance();
			System.out.println(singletonObject.stringVarible);
			singletonObject.stringVarible = "BeginnersBug";

			// Creating another object
			SingletonExample singletonInstance = SingletonExample.getSingletonInstance();
			System.out.println(singletonInstance.stringVarible);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
