package com.lcpan.m07_1;

public class Test1 {

	public static void main(String[] args) {
		
		
		Dog dog = new Dog();
		dog.run();
		Animal animal=dog;
		animal = dog;
		animal.run();
		animal = new Cat();
		animal.run();
		animal = new Lion();
		animal.run();
		
	}

}
